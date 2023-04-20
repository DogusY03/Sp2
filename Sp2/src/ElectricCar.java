public class ElectricCar extends ACar {

    protected int batteryCapacity;
    protected int maxRange;
    protected int power;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int power) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.power = power;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return power;
    }

    @Override
    public int getRegistrationFee() {
        float kmL = (float) (power / 91.25 / 100);
        if (kmL > 20) {
            return 330;
        } else if (kmL > 15 && kmL < 20) {
            return 1050;
        } else if (kmL > 10 && kmL < 15) {
            return 2340;
        } else if (kmL > 5 && kmL < 10) {
            return 5500;
        } else {
            return 10470;
        }

    }

    @Override
    public String toString() {
        return  "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", power=" + power +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
