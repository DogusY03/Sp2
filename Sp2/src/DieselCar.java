public class DieselCar extends AFuelCar {

    protected boolean particleFilter;

    protected DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmL = getKmPrLitre();

        if (kmL > 20) {
            if (!particleFilter) {
                return 130 + 1000;
            }
            return 130;

        } else if (kmL > 15 && kmL < 20) {
            if (!particleFilter) {
                return 1390 + 1000;
            }
            return 1390;

        } else if (kmL > 5 && kmL < 10) {
            if (!particleFilter) {
                return 1850 + 1000;
            }
            return 1850;

        } else if (kmL > 5 && kmL < 10) {
            if (!particleFilter) {
                return 2770 + 1000;
            }
            return 2770;
        } else {
            if (!particleFilter) {
                return 15260 + 1000;
            }
            return 15260;
        }

    }


    @Override
    public String toString() {
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}