package objects;

public class Parking {

    private Car[] parkingZones;

    public Parking(int places) {
        parkingZones = new Car[places];
    }

    public int ParkCar(Car carToPark) {

        for (int placeNbr = 0; placeNbr < parkingZones.length; placeNbr++) {
            if (parkingZones[placeNbr] == null) {
                parkingZones[placeNbr] = carToPark;
                System.out.println("Place " + placeNbr + " taken.");
                return placeNbr;
            }
        }
        System.out.println("No place for this car.");
        return -1;
    }

    public boolean ParkCar(Car carToPark, int wantedPlace){
        int wantedRealPlace = wantedPlace -1;

        if (parkingZones[wantedRealPlace] == null) {
            parkingZones[wantedRealPlace] = carToPark;
            System.out.println("Place " + wantedPlace + " taken.");
            return true;
        }

        return false;
    }

    public String toString(){
        StringBuilder parkingContent = new StringBuilder("Parking content:\n");

        for (Car parkedCar : parkingZones) {
            if (parkedCar == null) {
                parkingContent.append("[ ]");
            } else {
                parkingContent.append("["+parkedCar.getBrand()+"]");
            }
        }

        return parkingContent.toString();
    }

}
