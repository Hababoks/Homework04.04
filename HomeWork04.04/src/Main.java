import java.util.Random;

public class Main {
    //    Проект 1. Используйте while:
//    Напиши программу, которая моделирует ситуацию.
//    Ты попросил друзей скинуться на подарок на твой День Рождения.
//    Каждый друг случайным образом может подарить тебе одну купюру номиналом 500, 1000, 2000 или 5000 рублей.
//    Твоя цель - новенький игровой ПК, который стоит 100 000 рублей.
//    Как только друзья подарят тебе нужную сумму (или даже чуть больше),
//    останавливай сбор подарков и веди всех выпить за твоё здоровье в лучший бар города!
    public static void main(String[] args) {
        int sum = 0;
        int endAmount = 100000;
        Random rnd = new Random();
        while (sum < endAmount) {
            System.out.println("Sobrano seichas:" + sum);
            int x = 0;
            int randomNum = rnd.nextInt(4);
            switch (randomNum) {
                case 0:
                    x = 100;
                    break;
                case 1:
                    x = 1000;
                    break;
                case 2:
                    x = 2000;
                    break;
                case 3:
                    x = 5000;
                    break;
            }
            sum += x;
        }
        System.out.println("Sbor ostanovlen,sobrano: " + sum + " roubles. Все идем в бар пить пиво!");

    }
}