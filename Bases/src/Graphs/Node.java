package Graphs;

public class Node {

    private final char name;
    private final String description;

    public Node (char name, String description){
        this.description = description;
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
