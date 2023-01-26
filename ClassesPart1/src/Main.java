public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("S60");
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car volvo = new Car();
        volvo.setModel("V60");
        volvo.setColor("Black");
        volvo.describeCar();
    }
}