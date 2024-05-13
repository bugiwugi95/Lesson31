import java.time.LocalDate;

public class Task2 {
    //1.Выведите все даты текущего года
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        char[][] calendar = new char[5][7];
        System.out.println(now.getMonth());
        System.out.println("  "+"пн  вт  ср  чт  пт  сб  вс");
        for (int row = 0; row < calendar.length; row++) {
            for (int col = 0; col < calendar[row].length; col++) {
                int day = now.getDayOfMonth();
                calendar[row][col] = (char) day;
                if (row == 0 && day > 1 && day < 31) {
                    day = 1 + col;
                } else if (row == 1 && day > 1 && day < 31) {
                    day = 1 + col + (5+2);
                } else if (row == 2 && day > 1 && day < 31) {
                    day = 1 + col + 14;
                } else if (row == 3 && day > 1 && day < 31) {
                    day = 1 + col + 21;
                } else if (row == 4 && day > 1 && day < 31) {
                    day = 1 + col + 28;
                    if (day >= 31) {
                        col = ' ' ;

                    }

                }

                if (day < 10){
                    System.out.print("  ");
                }else {
                    System.out.print(" ");

                }
                System.out.print(day + " ");
            }
            System.out.println();
        }


    }
}