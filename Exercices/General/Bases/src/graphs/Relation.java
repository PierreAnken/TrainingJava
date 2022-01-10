package graphs;


public class Relation {

    private Node source;
    private Node dest;
    private int cost;

    public Relation (Node source, Node dest){
        this.source = source;
        this.dest = dest;
    }

    public Relation (Node source, Node dest, int cost){
        this.source = source;
        this.dest = dest;
        this.cost = cost;
    }

    public Node getSource() {
        return source;
    }

    public Node getDest() {
        return dest;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Relation)) return false;
        Relation relation = (Relation) o;
        return source.getName() == relation.source.getName()
                && dest.getName() == relation.dest.getName();
    }

}
