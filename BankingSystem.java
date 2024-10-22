import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    private static HashMap<String, Double> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter command (create, deposit, withdraw, balance, exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "create":
                    System.out.println("Enter account name: ");
                    String name = scanner.nextLine();
                    accounts.put(name, 0.0);
                    break;
                case "deposit":
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    accounts.put(name, accounts.get(name) + deposit);
                    break;
                case "withdraw":
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    accounts.put(name, accounts.get(name) - withdraw);
                    break;
                case "balance":
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    System.out.println("Balance: " + accounts.get(name));
                    break;
            }
        } while (!command.equals("exit"));
    }
}
