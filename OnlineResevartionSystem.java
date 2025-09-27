import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class Reservation {
    String pnr;
    String trainNumber;
    String trainName;
    String classType;
    String dateOfJourney;
    String from;
    String to;

    Reservation(String pnr, String trainNumber, String trainName, String classType, String dateOfJourney, String from, String to) {
        this.pnr = pnr;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.from = from;
        this.to = to;
    }
}

public class OnlineReservationSystem{
    private static Map<String, User> users = new HashMap<>();
    private static Map<String, Reservation> reservations = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample user for testing
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));

        while (true) {
            System.out.println("Welcome to the Online Reservation System");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                login();
            } else {
                break;
            }
        }
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = users.get(username);
        if (user != null && user.password.equals(password)) {
            System.out.println("Login successful!");
            reservationMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void reservationMenu() {
        while (true) {
            System.out.println("1. Make a Reservation");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. Logout");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                makeReservation();
            } else if (choice == 2) {
                cancelReservation();
            } else {
                break;
            }
        }
    }

    private static void makeReservation() {
        System.out.print("Enter PNR number: ");
        String pnr = scanner.nextLine();
        System.out.print("Enter Train Number: ");
        String trainNumber = scanner.nextLine();
        System.out.print("Enter Train Name: ");
        String trainName = scanner.nextLine();
        System.out.print("Enter Class Type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter Date of Journey (YYYY-MM-DD): ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("From (Place): ");
        String from = scanner.nextLine();
        System.out.print("To (Destination): ");
        String to = scanner.nextLine();

        Reservation reservation = new Reservation(pnr, trainNumber, trainName, classType, dateOfJourney, from, to);
        reservations.put(pnr, reservation);
        System.out.println("Reservation made successfully!");
    }

    private static void cancelReservation() {
        System.out.print("Enter PNR number to cancel: ");
        String pnr = scanner.nextLine();

        if (reservations.containsKey(pnr)) {
            reservations.remove(pnr);
            System.out.println("Reservation with PNR " + pnr + " has been cancelled.");
        } else {
            System.out.println("No reservation found with PNR " + pnr);
        }
    }
}
