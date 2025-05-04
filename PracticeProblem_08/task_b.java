package PracticeProblem_08;

class Restaurant{

    int deliveryTime = 40;
    String name;
    double price;

    Restaurant(double price, String name){
        this.price = price;
        this.name = name;
    }

    public int getDeliveryTime(){
        return deliveryTime;
    }

    public double getTax(){
        return price*0.1;
    }

    public void totalBill(){
        System.out.println("Name : " + name);
        System.out.println("Delivery Time : " + getDeliveryTime());
        System.out.println("Bill : " + (price + getTax()));
    }
}

class FastFood extends Restaurant{
    double tax = 0.15;

    FastFood(double price, String name){
        super(price, name);
    }

    public double getTax(){
        return price*tax;
    }
}

class FineDining extends Restaurant{
    int deliveryTime = 60;

    FineDining(double price, String name){
        super(price, name);
    }
    @Override
    public int getDeliveryTime() {
        return deliveryTime;
    }
}

public class task_b {
    public static void main(String[] args){
        FastFood fastFood = new FastFood(980,"Fast Food Restaurant");
        fastFood.totalBill();

        System.out.println();

        FineDining fineDining = new FineDining(1000, "Fine Dining Restaurant");
        fineDining.totalBill();
    }
}
