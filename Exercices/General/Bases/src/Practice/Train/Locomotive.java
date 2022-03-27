package Practice.Train;

public class Locomotive extends Wagon {

    private final float coal_by_km_and_kg = 0.05f;
    private float remaining_coal;
    private float traveled_km;

    public Locomotive(int weight, int length, Wagon rearWagon) {
        super(weight, length, rearWagon, WagonType.LOCOMOTIVE);
    }

    public void Travel(float km) {
        float needed_coal = km * coal_by_km_and_kg * TrainWeight();
        if (needed_coal > remaining_coal)
            System.out.println("Not enough Coal to travel " + km);
        else {
            remaining_coal -= needed_coal;
            traveled_km += km;
            System.out.println("You drove " + km + ", total " + traveled_km + ", remaining coal " + remaining_coal);
        }
    }

    public void Refuel(float coalQuantity) {
        remaining_coal += coalQuantity;
        System.out.println("Coal refuelled: " + remaining_coal);
    }

    private float TrainWeight() {
        float totalWeight = weight;
        Wagon currentWagon = this;

        while (currentWagon.wagonInRear != null) {
            currentWagon = currentWagon.wagonInRear;
            totalWeight += currentWagon.weight;
        }
        System.out.println("Train weight: "+ totalWeight);
        return totalWeight;
    }

    public boolean LoadPassenger(int numPassenger) {

    }

    private int FreeSeats() {
        int freeSeatsCount = 0;
        Wagon currentWagon = this;
        while (currentWagon.wagonInRear != null) {
            currentWagon = currentWagon.wagonInRear;
            if (currentWagon.wagonType == WagonType.PASSENGER){
                int freeSeatInWagon = Wagon.passenger_by_wagon-((int)currentWagon.storage.size());

            }
        }
        System.out.println("Train weight: "+ totalWeight);
        return totalWeight;
    }

}
