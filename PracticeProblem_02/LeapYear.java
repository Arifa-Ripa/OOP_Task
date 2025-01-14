package PracticeProblem_02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if((year % 4 == 0 || year % 400 ==0 ) && year % 100 !=0) {
            System.out.println("Its a Leap year");
        }
        else System.out.println("Not Leap year");
    }
}
