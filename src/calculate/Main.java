package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char input;
        do {
            System.out.println("Enter First Number: ");
            int a = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int b = sc.nextInt();
            System.out.println("Please enter one symbol +,-,*,/:");
            char symbol = sc.next().charAt(0);
            calculator.calculateResult(a, b, symbol);
            System.out.println("\nWould you like to do more calculation please enter Y or N : ");
            input = sc.next().charAt(0);
        } while (input == 'Y' || input == 'y');
        sc.close();
        System.out.println("\nprogram terminate");
    }
}
