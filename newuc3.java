import java.util.Scanner;

class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    static int getUserInput() {
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");

            if (sc.hasNextInt()) {
                slot = sc.nextInt();

                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("Invalid input! Enter number between 1 and 9.");
                }

            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        int userSlot = getUserInput();
        System.out.println("You selected: " + userSlot);
    }
}