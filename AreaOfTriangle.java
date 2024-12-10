import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double base = sc.nextDouble();
        Double height = sc.nextDouble();


        Double area = 0.5 * base * height;
        System.out.println("Area of the Triangle : " + area);
    }
}

