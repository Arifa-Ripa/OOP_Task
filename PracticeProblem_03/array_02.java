package PracticeProblem_03;

import java.util.Scanner;

public class array_02 {
    public static void main(String[] args) {
        System.out.println("Student's Grade Point : ");

        Scanner sc =  new Scanner(System.in);
        float grade = sc.nextFloat();

        if(grade > 2.0f){
            if(grade >= 3.5f){
                System.out.println("The student qualifies for Medal");
            }
            else {
                System.out.println("The student does not qualifies for Medal");
            }
        }
    }
}
