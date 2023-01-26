public class Car {
    private String make = "Volvo";
    private String model = "XC90";
    private String color = "White";
    private int doors = 4;
    private boolean convertible = false;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model) {
        if (model == null) model = "Unknown";
        String lowercaseModel = model.toLowerCase();
        switch(lowercaseModel){
            case "s60", "v60", "xc90", "xc60" -> this.model = model;
            default -> {
                this.model = "Unsupported";
            }
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door" + " " +
            color + " " +
            make + " " + model + " " +
                (convertible ? "Convertible" : "")
        );
    }
}
