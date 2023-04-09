import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Используйте foreach.
//        Дан Enum месяцев. Пользователь вводит имя текущего месяца в консоль.
//        Программа должна вывести все месяцы, кроме того, что ввёл пользователь.

        Scanner con = new Scanner(System.in);
        System.out.println("Vvedite nazvanie mesiaca goda v verhnem registre: ");
        String m = con.nextLine();
        Month year = Month.valueOf(m);
        System.out.println(" Ostavshiesia mesiaci: ");
        for (Month month1 : Month.values()) {
            if (month1 != year) {
                System.out.println(month1.name() + " ");
            }


        }
    }
}