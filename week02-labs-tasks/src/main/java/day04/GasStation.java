package day04;

public class GasStation {

    private final double fuelPrice;

    public GasStation(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public static void main(String[] args) {

        GasStation gasStation = new GasStation(350.0);
        Car car = new Car();

        System.out.println(gasStation.refuelCar(car, 20));

        car.setTotalDistanceTraveledInKm(200);

        System.out.println(car.calculateFuelConsumption());
    }

    public double refuelCar(Car car, int fuelInLitre) {
        car.setTotalFuelTankedInLitre(car.getTotalFuelTankedInLitre() + fuelInLitre);
        return fuelPrice * fuelInLitre;
    }
}
