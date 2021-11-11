package train.wagons;

import train.things.Merchandise;

public class MerchandiseWagon extends AWagon {

    public MerchandiseWagon(){
        super(WagonType.MERCHANDISES);
        storage = new Merchandise[100];
    }

}
