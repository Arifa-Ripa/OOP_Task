import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();

        Double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle : " + area);
    }
}
