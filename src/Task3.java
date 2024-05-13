import java.time.LocalDate;

public class Task1 {
    //1.Выведите все даты текущего года
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2023,12,31);
        LocalDate date = LocalDate.of(2024,12,31);
        while (now.isBefore(date)){
            now = now.plusDays(1);
            System.out.println(now.getDayOfMonth());
        }

    }
}