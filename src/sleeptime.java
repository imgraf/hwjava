package Hausaufgaben;

import java.util.Scanner;

public class sleeptime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sleepHours = sc.nextInt();

        if (sleepHours > 16) {
            System.out.println("Сейчас самое время спать");
        } else if (sleepHours > 10 && sleepHours <= 16) {
            System.out.println("Не переживайте, до сна больше 10 часов");
        } else if (sleepHours < 7) {
            System.out.println("До сна осталось меньше 7 часов");
        } if (sleepHours == 3) {
            System.out.println("До сна 3 часа, если вы голодные, то надо успеть перекусить");
        } else if (sleepHours == 2) {
            System.out.println("До сна 2 часа, завершайте выполнение текущей работы");
        } else if (sleepHours == 1) {
            System.out.println("До сна 1 час, посмотрите перед сном что-то интересное, или почитайте");
        } else if (sleepHours < 1) {
            System.out.println("Время ложиться спать. Конец дня!");
        } else {
            System.out.println("До сна осталось " +sleepHours+ " часов");
        }

    }
}
