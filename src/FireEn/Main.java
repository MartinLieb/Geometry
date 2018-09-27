package FireEn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r;
        System.out.println("Hvad er r?");
        r = input.nextDouble();
        double s = 2*r*(Math.sin(Math.PI/5));
        double area = (5*(Math.pow(s, 2)))/(4*(Math.tan(Math.PI/5)));
        System.out.println(area);
    }
}
