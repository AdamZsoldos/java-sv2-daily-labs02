package day04;

public class Car {

    private int totalFuelTankedInLitre;
    private int totalDistanceTraveledInKm;

    public int getTotalFuelTankedInLitre() {
        return totalFuelTankedInLitre;
    }

    public int getTotalDistanceTraveledInKm() {
        return totalDistanceTraveledInKm;
    }

    public void setTotalFuelTankedInLitre(int totalFuelTanked) {
        this.totalFuelTankedInLitre = totalFuelTanked;
    }

    public void setTotalDistanceTraveledInKm(int totalDistanceTraveledInKm) {
        this.totalDistanceTraveledInKm = totalDistanceTraveledInKm;
    }

    public double fuelConsumption() {
        return totalFuelTankedInLitre * 100.0 / totalDistanceTraveledInKm;
    }
}
