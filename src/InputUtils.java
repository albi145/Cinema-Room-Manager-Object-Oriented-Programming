import java.util.Scanner;

public interface InputUtils {
    Scanner scanner = new Scanner(System.in);

    static int userChoice () {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.println();

        return scanner.nextInt();
    }

    static int rowsLength () {
        System.out.println("Enter the number of rows:");
        return scanner.nextInt();
    }

    static int seatsLength () {
        System.out.println("Enter the number of seats in each row:");
        return scanner.nextInt();
    }
    static int userRow () {
        System.out.println("Enter a row number:");
        return scanner.nextInt();
    }

    static int userSeat () {
        System.out.println("Enter a seat number in that row:");
        return scanner.nextInt();
    }
}
