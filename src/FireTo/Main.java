package FireTo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r = 6371.01;
        double x;
        double y;
        double x2;
        double y2;
        double d;

        System.out.println("Første punkt");

        x = input.nextDouble();
        y = input.nextDouble();

        System.out.println("Andet punkt");

        x2 = input.nextDouble();
        y2 = input.nextDouble();

        d = r*Math.acos(Math.sin(Math.toRadians(x))
                *Math.sin(Math.toRadians(x2))
                +Math.cos(Math.toRadians(x))
                *Math.cos(Math.toRadians(x2))
                *Math.cos(Math.toRadians(y)-Math.toRadians(y2)));

        System.out.println(d);

    }
}
