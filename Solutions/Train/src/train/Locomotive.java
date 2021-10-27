package train;

import java.util.ArrayList;
import java.util.List;

public class Locomotive extends AWagon {

    public Locomotive(){
        content = new ArrayList<>();
    }

    @Override
    public int getContentWeight() {
        return 0;
    }


    @Override
    public List getContent() {
        return new ArrayList();
    }
}
