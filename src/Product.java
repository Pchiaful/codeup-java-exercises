import java.util.Arrays;

public class Product {

    /* TODO: create a class called Product with two private properties of name and priceInCents.
//    Add a public static method called, findAveragePrice, that takes in an array of products
//    and finds the average price of all products. Add a main method to the class to test some
//    values.
// */

    //private variables
    private String name;
    private double priceInCents;

    //constructor
    public Product(String productName, int price) {
        this.name = productName;
        this.priceInCents = price;
    }

    //object
    public static Product[] products = {
            new Product("milk", 10),
            new Product("eggs", 50),
            new Product("cheese", 25)
    };

    //static method
    public static double findAveragePrice (Product[] listOfProducts) {
        double sum = 0;
        for (Product product : listOfProducts) {
            sum += product.priceInCents;
        }
        return sum/products.length;
    }

    //also a setter
    public static String[] printNames (Product[] listOfNames) {
        String[] names = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            names[i] = listOfNames[i].name;
        }
        return names;
    }

    //setter
    public static void printAllNames () {
        for (Product product : products) {
            System.out.println(product.getNames());
        }
    }

    //getter
    public String getNames() {
        return name;
    }

    public static void main(String[] args) {
        System.out.printf("The average price of all of the products is $%.2f.", findAveragePrice(products));

        System.out.println();

        System.out.println(Arrays.toString(printNames(products)));

        printAllNames();
    }
}
