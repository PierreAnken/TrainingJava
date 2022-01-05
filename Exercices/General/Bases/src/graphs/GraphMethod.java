package graphs;

public interface GraphMethod {
    void addRelation(Node source, Node dest);

    boolean existeRelation(Node source, Node dest);

    boolean existeChemin(Node source, Node dest);
}
