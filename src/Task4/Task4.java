import java.time.LocalDate;
import java.util.Scanner;

public class Task4 {
    //4.Пользователь вводит дату, вывести все числа с 1 января того же года до этой даты
    public static void main(String[] args) {
        User userInput = getUser();
        resultDate(userInput.inputYear, userInput.inputMonth, userInput.inputDay);


    }

    private static User getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input year: ");
        int inputYear = scanner.nextInt();
        System.out.print("input month: ");
        int inputMonth = scanner.nextInt();
        System.out.print("input day: ");
        int inputDay = scanner.nextInt();
        return new User(inputYear, inputMonth, inputDay);
    }

    private static class User {
        public final int inputYear;
        public final int inputMonth;
        public final int inputDay;

        public User(int inputYear, int inputMonth, int inputDay) {
            this.inputYear = inputYear;
            this.inputMonth = inputMonth;
            this.inputDay = inputDay;
        }
    }

    private static void resultDate(int inputYear, int inputMonth, int inputDay) {
        LocalDate dateUser = LocalDate.of(inputYear, inputMonth, inputDay);
        LocalDate date = LocalDate.of(dateUser.getYear(), 1, 1);
        System.out.println("Result: ");
        while (date.isBefore(dateUser)){
            date = date.plusDays(1);
            System.out.println(date);
        }
    }
}
