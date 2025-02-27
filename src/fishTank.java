import java.util.Scanner;

public class fishTank {
    Scanner scanner = new Scanner(System.in);
    private String lastWaterChange;

    public String waterPercent;
    public String algeKiller;

    public enum WaterQuality {
        PERFECT,
        GOOD,
        OKAY,
        BAD
    }

    private WaterQuality waterQuality;

    public fishTank() {
        this.lastWaterChange = "";
    }

    public fishTank(String lastWaterChange) {
        this.lastWaterChange = lastWaterChange;
    }

    public void changeWater() {
        System.out.println("Whats the current date?");
        this.lastWaterChange = scanner.nextLine();

        System.out.println("How many percent of the water would u like to change?");
        String userInputPercent = scanner.nextLine();

        System.out.println("How many ml of alge killer would u like to add?");
        String userInputAlgeKiller = scanner.nextLine();

        changeWaterQuality();

        System.out.println("Water Change Status:");
        System.out.println("Date: " + this.lastWaterChange + ". Percent water changed: " + userInputPercent +
                ". ML of Alge Killer added: " + userInputAlgeKiller + ". Previous Water Quality: " + waterQuality);
    }

    public void changeWaterQuality () {
        System.out.println("How would u describe the water before the water change?:");
        System.out.println("1. Perfect");
        System.out.println("2. Good");
        System.out.println("3. Okay");
        System.out.println("4. Bad");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                waterQuality = WaterQuality.PERFECT;
                break;
            case 2:
                waterQuality = WaterQuality.GOOD;
                break;
            case 3:
                waterQuality = WaterQuality.OKAY;
                break;
            case 4:
                waterQuality = WaterQuality.BAD;
                break;
            default:
                System.out.println("Invalid input");
                waterQuality = WaterQuality.OKAY;
        }

    }

    @Override
    public String toString() {
        return "fishTank{" +
                "lastWaterChange='" + lastWaterChange + '\'' +
                '}';
    }
}
