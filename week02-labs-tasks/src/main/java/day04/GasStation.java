package day04;

public class GasStation {

    private final double fuelPrice;

    public GasStation(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public static void main(String[] args) {

        GasStation gasStation = new GasStation(351.4);
        Car car = new Car();

        System.out.println(gasStation.refuelCar(car, 20));

        car.setTotalDistanceTraveledInKm(211);

        System.out.println(car.calculateFuelConsumption());
    }

    public double refuelCar(Car car, int fuelInLitre) {
        car.setTotalFuelTankedInLitre(car.getTotalFuelTankedInLitre() + fuelInLitre);
        return fuelPrice * fuelInLitre;
    }
}
