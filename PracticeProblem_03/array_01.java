package PracticeProblem_03;

public class array_01 {
    public static void main(String[] args) {
        float[] arr = new float[5];
        arr[0] = 24.6f;
        arr[1] = 44.3f;
        arr[2] = 12.9f;
        arr[3] = 38.0f;
        arr[4] = 10.5f;

        float avg = 0;
        for (float v : arr) {
            avg += v;
        }
        System.out.println("Average : " + avg/2);
    }
}
