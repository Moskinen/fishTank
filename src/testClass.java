import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fishTank fishtank = new fishTank();

        fish[] fish = {
                new fish("Wogglie", "Tank 1", "blue", "Clown Fish", true),
                new fish("Swimmie", "Tank 1", "yellow", "Angel Fish", true)
        };


        while (true) {
            System.out.println("Welcome to our fish menu. \n You can select your option by choosing a number between 1 - 5");
            System.out.println("1. Viewing fish status\n" +
                    "2. Updating fish health\n" +
                    "3. Changing water\n" +
                    "4. Viewing last water change\n" +
                    "5. Exiting");

        String userInput = scanner.nextLine();

        if (userInput.equals("1")) {

            for(fish s : fish) {
                System.out.println(s);
            }

        } else if (userInput.equals("2")) {

            for(int i = 0; i < fish.length; i++ ){
                System.out.println("Update health of: " + fish[i].getName());
                String userInputHealth = scanner.nextLine();
                fish[i].updateHealthStatus(userInputHealth);

            }

        } else if (userInput.equals("3")) {
            System.out.print("Would you like to change the water? Y/N");
            String userInputWater = scanner.nextLine();
            if (userInputWater.equals("Y")) {
                fishtank.changeWater();
            }
        } else if (userInput.equals("4")) {
            System.out.println(fishtank);
        } else if (userInput.equals("5")) {
            break;
        }
    }
    }

}
