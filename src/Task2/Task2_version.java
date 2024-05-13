import java.time.LocalDate;

public class Task2_version {
    //1.Выведите все даты текущего года
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2023,12,31);
        LocalDate date = LocalDate.of(2024,1,31);
        int[][] calendar = new int[5][7];
        while (now.isBefore(date)){
            now = now.plusDays(1);
            for (int row = 0; row < calendar.length; row++) {
                for (int col = 0; col < calendar[row].length; col++) {
                    calendar[row][col] =  now.getDayOfMonth();
                    System.out.print( calendar[row][col]);
                }
                System.out.println();
            }

        }



    }
}