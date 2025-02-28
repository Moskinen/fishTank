public class fish {
    //Attributes
    private final String name;
    private String healthStatus;
    private String home;
    private final String color;
    private final String species;
    private final boolean sex;

    //Constructor
    public fish(String name, String home, String color, String species, boolean sex){
        this.name = name;
        this.healthStatus = "Healthy";
        this.home = home;
        this.color = color;
        this.species = species;
        this.sex = sex;
    }

    //Getter
    String getName(){
        return this.name;
    }

    String getHealth(){
        return this.healthStatus;
    }

    String getHome(){
        return this.home;
    }

    String getColor(){
        return this.color;
    }

    String getSpecies(){
        return this.species;
    }

    String getSex(){
        if(this.sex){
            return "Female";
        } else {
            return "Male";
        }
    }

    //Setter
    void updateHealthStatus(String updateHealth){
        this.healthStatus = updateHealth;
    }

    void changeHome(String updateHome){
        this.home = updateHome;
    }


    //toString
    public String toString(){
        return "Name of fish: " + name + "\nHealth status: " + healthStatus + " Lives in: "
                + home + "\nFish info:\n" + color + ", " + species + ", " + this.getSex();
    }

}

