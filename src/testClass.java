import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fishTank fishtank = new fishTank("26-02-2025", "Good");

        System.out.println("Welcome to our fish menu. \n You can select your option by choosing a number between 1 - 5");
        System.out.println("1. Viewing fish status\n" +
                "2. Updating fish health\n" +
                "3. Changing water\n" +
                "4. Viewing last water change\n" +
                "5. Exiting");

        while (true) {

        String userInput = scanner.nextLine();

        if (userInput.equals("1")) {

        } else if (userInput.equals("2")) {

        } else if (userInput.equals("3")) {
            System.out.print("Would you like to change the water? Y/N");
            String userInputWater = scanner.nextLine();
            if (userInputWater.equals("Y")) {
                fishtank.changeWater();
            }
        } else if (userInput.equals("4")) {
            System.out.println(fishtank.toString());
        } else if (userInput.equals("5")) {

        }
    }
    }

}
