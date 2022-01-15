package Graphs;


public class Relation {

    private final Node source;
    private final Node dest;

    public Relation (Node source, Node dest){
        this.source = source;
        this.dest = dest;
    }

    public Node getSource() {
        return source;
    }

    public Node getDest() {
        return dest;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Relation relation)) return false;

        return source.getName() == relation.source.getName()
                && dest.getName() == relation.dest.getName();
    }

}
