package PracticeProblem_03;

import java.util.Scanner;

public class array_04 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num <= 1){
            System.out.println("This number is not Prime");
        }
        else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    System.out.println("This number is not Prime");
                    return;
                }
            }

            System.out.println("This is a Prime number");
        }
    }
}
