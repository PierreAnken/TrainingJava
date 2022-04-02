package Practice.Train;

public class Locomotive extends Wagon {

    private final float coal_by_km_and_kg = 0.02f;
    private float remaining_coal;
    private float traveled_km;

    public Locomotive(int length, Wagon rearWagon) {
        super(length, rearWagon, WagonType.LOCOMOTIVE);
    }

    public int GetWeight(){
        return 500 + (int)GetCoalWeight();
    }

    public int GetCoalWeight(){
        return (int)(remaining_coal * 0.1f);
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
        float totalWeight = this.GetWeight();
        Wagon currentWagon = this;

        while (currentWagon.wagonInRear != null) {
            currentWagon = currentWagon.wagonInRear;
            totalWeight += currentWagon.GetWeight();
        }
        System.out.println("Train weight: "+ totalWeight);
        return totalWeight;
    }

    // [200] - [200] - [150] - |_250]>
    public void DisplayComposition() {

        StringBuilder sb = new StringBuilder("|"+ (GetWeight()-GetCoalWeight())+"_"+ GetCoalWeight()+"]>");

        // Get through all wagons and gather weight
        Wagon currentWagon = this;
        while (currentWagon.wagonInRear != null) {
            currentWagon = currentWagon.wagonInRear;
            // Complete the drawing with current wagon
            sb.insert(0,"["+currentWagon.GetWeight()+"] - ");
        }
        System.out.println(sb);

    }


//    public boolean LoadPassenger(int numPassenger) {
//
//    }

//    private int FreeSeats() {
//        int freeSeatsCount = 0;
//        Wagon currentWagon = this;
//        while (currentWagon.wagonInRear != null) {
//            currentWagon = currentWagon.wagonInRear;
//            if (currentWagon.wagonType == WagonType.PASSENGER){
//                int freeSeatInWagon = Wagon.passenger_by_wagon-((int)currentWagon.storage.size());
//
//            }
//        }
//        System.out.println("Train weight: "+ totalWeight);
//        return totalWeight;
//    }

}
