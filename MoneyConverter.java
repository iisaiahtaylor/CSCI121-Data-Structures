import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: $");
        double amount = sc.nextDouble();

        System.out.print("Would you like to donate to Clark Men's Basketball? (yes/no):");
        String donateOption = sc.next().toLowerCase();

        double donation = 0.0;
        if (donateOption.equals("yes")) {
            System.out.print("Enter Donation Amount:$");
            donation = sc.nextDouble();
        }


        MoneyConverter.calculateChange(amount + donation);
    }

    public static void calculateChange(double amount) {
        // Convert the amount to cents
        int cents = (int) (amount * 100);

        //Calculate number of twenty dollar bills
        int twentydollarbills = cents / 2000;
        cents %= 2000;

        //Calculate number of ten dollar bills
        int tendollarbills = cents / 1000;
        cents %= 1000;

        //Calculate number of five dollar bills
        int fivedollarbills = cents / 500;
        cents %= 500;

        // Calculate number of quarters
        int quarters = cents / 25;
        cents %= 25;

        // Calculate number of dimes
        int dimes = cents / 10;
        cents %= 10;

        // Calculate number of nickels
        int nickels = cents / 5;

        //Calculate number of pennies
        int pennies = cents / 1;

        // Print results
        System.out.printf("For your outstanding amount $%.2f, you will need:%n", amount);
        System.out.println(twentydollarbills + " twenty dollar bill(s)");
        System.out.println(tendollarbills + " ten dollar bill(s)");
        System.out.println(fivedollarbills + " five dollar bill(s)");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
