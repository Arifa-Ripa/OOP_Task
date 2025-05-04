package PracticeProblem_05;

class Car{
    String owner;
    String brand;
    String srNum;
    boolean isStarted;
    double fuel;

    Car(String owner, String brand, String srNum, double fuel){
        this.owner = owner;
        this.brand = brand;
        this.srNum = srNum;
        this.isStarted = false;
        this.fuel = fuel;
    }

    public void startCar(){
        if(fuel > 0) isStarted = true;

        System.out.println("Car n0. " + this.srNum + " is Started.");
    }

    public void stopCar(){
        if(this.isStarted) isStarted = false;

        System.out.println("Car n0. " + this.srNum + " is Stopped.");
    }

    public void fuelCheck(){
        System.out.println("Available Fuel : " + this.fuel + " liters");
    }
}
public class task_01 {
    public static void main(String[] args) {
        Car car1 = new Car("xyz", "Ferrari", "01224", 48.78);
        car1.startCar();
        car1.fuelCheck();
        car1.stopCar();

    }
}
