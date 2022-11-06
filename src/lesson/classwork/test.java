package lesson.classwork;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Gib deine Körpergröße in cm ein:");
        double lengthInSm = in.nextDouble();
        int lengthInMM = (int) Math.round(lengthInSm * 100);
        System.out.println("Deine Größe in mm " + lengthInMM);
        if (lengthInMM > 20000) {

            System.out.println("du bist sehr groß");
        }
    }
}