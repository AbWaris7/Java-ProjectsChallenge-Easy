package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();
        int water = numberOfCups * 200;
        int milk =  numberOfCups * 50;
        int coffeeBean = numberOfCups * 15;

        System.out.println("For "+numberOfCups+" cups of coffee you will need:");
        System.out.println(water +" ml of water");
        System.out.println(milk +" ml of milk");
        System.out.println(coffeeBean +" g of coffee beans");






    }
}
