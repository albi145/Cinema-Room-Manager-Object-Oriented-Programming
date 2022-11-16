
import java.util.Arrays;
import java.util.stream.IntStream;

public class Room {
    public int rows;
    public int seats;
    public char[][] arr;
    int userRow;
    int userSeat;


    public Room(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.arr = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                arr[i][j] = 'S';
            }
        }
    }

    void printRoom() {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seats; i++) {
            System.out.printf(" %d", i);
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.printf("%d ", i);
            for (int j = 1; j <= seats; j++) {
                System.out.printf("%c ", arr[i - 1][j - 1]);
            }
            System.out.println();
        }
    }

    boolean buyTicket(int userRow, int userSeat) {
        this.userRow = userRow;
        this.userSeat = userSeat;

        if (userRow < 1 || userRow > rows || userSeat < 1 || userSeat > seats) {
            System.out.println("Wrong input");
            return false;
        } else if (arr[userRow - 1][userSeat - 1] == 'B') {
            System.out.println("That ticket has already been purchased!");
            return false;
        } else {
            arr[userRow - 1][userSeat - 1] = 'B';
            int ticketPrice = rows * seats <= 60 ? 10 : userRow <= (rows / 2) ? 10 : 8;
            System.out.printf("Ticket price: $%d", ticketPrice);
            return true;
        }
    }

    void statistic() {
        int counter = 0;
        int price = 0;
        int totalIncome = 0;
        int allSeats = rows * seats;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (arr[i][j] == 'B') {
                    counter++;
                    if (allSeats <= 60) {
                        price += 10;
                    } else {
                        if (i + 1 <= rows / 2) {
                            price += 10;
                        } else {
                            price += 8;
                        }
                    }
                    System.out.println(price);

                }
                if (allSeats <= 60) {
                    totalIncome += 10;
                } else {
                    if (i + 1 <= rows / 2) {
                        totalIncome += 10;
                    } else {
                        totalIncome += 8;
                    }
                }
            }
        }
        System.out.printf("Number of purchased tickets: %d%n", counter);
        double perecentage = (double) 100 / allSeats * counter;
        System.out.printf("Percentage: %.2f%%%n", perecentage);
        System.out.printf("Current income: $%d%n", price);
        System.out.printf("Total income: $%d", totalIncome);
    }
}
