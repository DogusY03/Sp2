public class Main {
    public static void main(String[] args) {

        Car car = new GasolineCar ("BJ 23 352","Skoda", "SuperB", 5, 18);
        Car car2 = new DieselCar ("AE 42 502", "BMW", "520D",5, 15, "true");
        Car car3 = new ElectricCar ("EA","BMW", "I8",3, 12, 500,369);

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);

        FleetOfCars t = new FleetOfCars();
        t.addCar(car);
        t.addCar(car2);
        t.addCar(car3);
        System.out.println(t);
    }




}