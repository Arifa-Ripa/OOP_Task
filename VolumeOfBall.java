import java.util.Scanner;

public class VolumeOfBall {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Double radius = sc.nextDouble();

            Double volume = (4.0d/3.0d) * Math.PI * Math.pow(radius, 3);
            System.out.println("Volume of the ball : " + volume);
        }

}
