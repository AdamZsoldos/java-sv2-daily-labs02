package day04;

public class GasStation {

    private final double fuelPrice;

    public GasStation(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double refuelCar(Car car, int fuelInLitre) {
        car.setTotalFuelTankedInLitre(car.getTotalFuelTankedInLitre() + fuelInLitre);
        return fuelPrice * fuelInLitre;
    }
}
