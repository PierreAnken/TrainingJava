package train.wagons;

import train.things.Person;

public class PassengerWagon extends AWagon {

    public PassengerWagon(){
        super(WagonType.PASSENGER);
        storage = new Person[20];
    }

}
