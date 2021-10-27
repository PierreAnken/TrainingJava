package train.wagons;

import train.WagonType;
import train.things.Merchandise;
import train.wagons.AWagon;

public class MerchandiseWagon extends AWagon {

    public MerchandiseWagon(){
        super(WagonType.MERCHANDISES);
        storage = new Merchandise[100];
    }

}
