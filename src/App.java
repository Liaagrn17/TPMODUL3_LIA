import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant Chef = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.print("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.print("Enter how much food to made: ");
                orderQty = input.nextInt();

                Thread a1 = new Thread(Chef);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread a2 = new Thread(waiter);

                a1.start();
                a2.start();
                a1.join();
                a2.join();

            } catch (Exception er) {
                System.out.println("Input must be Integer!!\n");
            }
        }

    }

}
