package train;

import java.util.ArrayList;
import java.util.List;

public abstract class AWagon{
    List<Thing> content;
    AWagon rearWagon, frontWagon;
    int maxContent;

    public AWagon(){
        content = new ArrayList<>();
    }

    List<Thing> getContent(){
        return content;
    }
    void addContent(Thing something){
        content.add(something);
    };

    public int getContentWeight() {
        int weight = 0;
        for (Thing t: content) {
            weight += t.getWeight();
        }
        return weight;
    }

    public void setRearWagon(AWagon AWagon){
        rearWagon = AWagon;
    }
    public void setFrontWagon(AWagon AWagon){
        frontWagon = AWagon;
    }

    public AWagon getRearWagon() {
        return rearWagon;
    }

    public AWagon getFrontWagon() {
        return frontWagon;
    }

}
