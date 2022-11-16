
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Room room = new Room(InputUtils.rowsLength(), InputUtils.seatsLength());

        while (true) {
            switch (InputUtils.userChoice()) {
                case 1 -> room.printRoom();
                case 2 -> {
                    while (!room.buyTicket(InputUtils.userRow(), InputUtils.userSeat())) ;
                }
                case 3 -> room.statistic();
                case 0 -> {
                    return;
                }
            }
        }
    }
}