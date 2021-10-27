package train.wagons;

import train.WagonType;
import train.things.Person;
import train.wagons.AWagon;

public class PersonWagon extends AWagon {

    public PersonWagon(){
        super(WagonType.PEOPLE);
        storage = new Person[20];
    }
}
