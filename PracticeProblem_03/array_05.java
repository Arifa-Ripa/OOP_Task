package PracticeProblem_03;

import java.util.Scanner;

public class array_05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed Array : ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
