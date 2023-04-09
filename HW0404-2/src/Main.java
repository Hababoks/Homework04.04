import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Используйте for.
//        Необходимо суммировать все нечётные целые числа в диапазоне,
//        введённом пользователем.Пользователь указывает
//        нижнюю и верхнюю границу диапазона.

        Scanner console = new Scanner(System.in);
        System.out.println("Vvedite chisla: ");
        int y = console.nextInt();
        int x = console.nextInt();
        int sum = 0;
        for (int i = y; i <= x; i++) {
            if(i%2 == 1){
                sum +=i;
            }
            
        }
        System.out.println("Summa chisel v diapazone ot " + y +" do " + x + " ravna " + sum);
    }
}