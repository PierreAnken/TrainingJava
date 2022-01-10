package graphs;

import java.util.ArrayList;

public interface GraphMethodPondere extends GraphMethod{

    void addRelation(Node source, Node dest, int cost);
    int getTravelCost(Node source, Node dest);
}
