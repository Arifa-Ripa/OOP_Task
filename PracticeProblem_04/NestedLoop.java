package PracticeProblem_04;

public class NestedLoop {
    public static void main(String[] args) {
        int N = 10;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
