package PracticeProblem_01;

import java.util.Scanner;

public class AreaOfScaleneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double s = (a + b + c) / 2;
        Double area = Math.pow((s * (s-a) * (s-b) * (s-c)) , 0.5);
        System.out.println("Area of the Scalene Triangle : " +area);

    }
}
