package PracticeProblem_02;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Odd series : ");
        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0) System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Even series : ");
        int i = 1;
        while(i <= 20){
            if(i % 2 == 0) System.out.print(i + " ");
            i ++;
        }

        System.out.println();
        System.out.println("Number series : ");
        int j = 1;
        int sum = 0;
        do{
            System.out.print(j + " ");
            sum += j;
            j++;
        }while (j <= 20);

        System.out.println();
        System.out.println("Sum of the series : " + sum);
    }
}
