import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double arm = sc.nextDouble();

        Double area = Math.pow(3.0d/4.0d, 0.5 ) * Math.pow(arm, 2);
        System.out.println("Area of the equilateral triangle : " +area);
    }
}
