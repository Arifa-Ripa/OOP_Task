package PracticeProblem_03;

import java.util.Scanner;

public class array_03 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Maximum element : " + max);
    }
}
