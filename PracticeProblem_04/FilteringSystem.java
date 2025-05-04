package PracticeProblem_04;

class Product{
    public void filterProduct(String category){
        System.out.println("Product Category : " +category);
    }

    public void filterProduct(String brand, boolean isBrand){
        if(isBrand){
            System.out.println("Brand Name : " + brand );
        }
    }

    public void filterProduct(int minPrice, int maxPrice){
        System.out.println("Minimum Price : $" + minPrice + ", Maximum Price : $" + maxPrice);
    }

    public void filterProduct(String category, int minPrice, int maxPrice){
        System.out.println("Product Category : " +category + ", Minimum Price : $" + minPrice + ", Maximum Price : $" + maxPrice);
    }

    public void filterProduct(String category, int minPrice, int maxPrice, String brand){
        System.out.println("Product Category : " +category + ", Minimum Price : $" + minPrice + ", Maximum Price : $" + maxPrice + ", Brand : " + brand);
    }
}
public class FilteringSystem {
    public static void main(String[] args) {
        Product product  = new Product();

        product.filterProduct("Fashion");
        product.filterProduct("Nike", true);
        product.filterProduct(1000, 3000);
        product.filterProduct("Nike", 1000, 3000);
        product.filterProduct("Fashion", 1000, 3000, "Nike");

    }
}
