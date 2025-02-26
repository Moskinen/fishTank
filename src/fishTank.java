import java.util.Scanner;

public class fishTank {
    Scanner scanner = new Scanner(System.in);
    private String lastWaterChange;
    private String waterQuality;

    public String waterPercent;
    public String algeKiller;

    enum waterQuality {
        PERFECT,
        GOOD,
        OKAY,
        BAD
    }

    public fishTank(String lastWaterChange, String waterQuality) {
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;
    }

    public void changeWater(String waterPercent, String algeKiller) {
        System.out.println("Whats the current date?");
        String userInputDate = scanner.nextLine();

        System.out.println("How many percent of the water would u like to change?");
        String userInputPercent = scanner.nextLine();

        System.out.println("How many ml of alge killer would u like to add?");
        String userInputAlgeKiller = scanner.nextLine();


    }

    @Override
    public String toString() {
        return "fishTank{" +
                "lastWaterChange='" + lastWaterChange + '\'' +
                '}';
    }
}
