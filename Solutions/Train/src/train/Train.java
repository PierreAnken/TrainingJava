package train;

public class Train {
    private final AWagon locomotive;
    private AWagon lastWagon;

    public Train(){
        locomotive = new Locomotive();
        lastWagon = locomotive;
    }

    public void addWagonAtStart(AWagon wagon){
        wagon.setFrontWagon(locomotive);

        // If we already have wagon
        if (locomotive.getRearWagon() != null) {
            locomotive.getRearWagon().setFrontWagon(wagon);
        }
        else{
            // we are the last one
            lastWagon = wagon;
        }
        locomotive.setRearWagon(wagon);
    }

    public void addWagonAtEnd(AWagon wagon){
        wagon.setFrontWagon(lastWagon);
        lastWagon.setRearWagon(wagon);
        lastWagon = wagon;
    }

    public int countWagon(){
        AWagon current = locomotive;
        int count = 0;
        while(current.getRearWagon() != null){
            count += 1;
            current = current.getRearWagon();
        }
        return count;
    }

    public void add10Wagons(){
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                PersonWagon personWagon = new PersonWagon();
                addWagonAtEnd(personWagon);

            } else {
                MerchandiseWagon merchandiseWagon = new MerchandiseWagon();
                addWagonAtEnd(merchandiseWagon);
            }
        }
    }

}
