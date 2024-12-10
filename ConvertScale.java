import java.util.Scanner;

public class ConvertScale {
    public static void main(String[] args) {
        System.out.println("Celsius : ");
        Scanner sc = new Scanner(System.in);
        Float celsius = sc.nextFloat();

        Float fahrenheit = (9.0f/5.0f) * celsius + 32;
        System.out.println("Fahrenheit : " +fahrenheit);
    }
}
