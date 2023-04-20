public class GasolineCar extends AFuelCar {


    protected GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType() {

        return "Gasoline";
    }


    @Override
    public int getRegistrationFee() {
        int kmL = getKmPrLitre();

        if(kmL > 20){
            return 330;
        }

        else if(kmL > 15 && kmL < 20){
            return 1050;
        }
        else if(kmL > 10 && kmL < 15){
            return 2340;
        }

        else if(kmL > 5 && kmL < 10){
            return 5500;
        }

        else {
            return 10470;
        }

    }

    @Override
    public String toString() {
        return "GasolineCar{" + "registrationNumber='" + registrationNumber + '\'' + ", make='" + make + '\'' + ", model='" + model + '\'' + ", numberOfDoors=" + numberOfDoors + '}';
    }
}
