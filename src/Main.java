import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double price;
        double sale;

        System.out.println("Please enter the price of your item here: ");
        price = scan.nextDouble();
        sale = price * 1.05;

        System.out.println("The price with tax is $" + sale);
    }
}