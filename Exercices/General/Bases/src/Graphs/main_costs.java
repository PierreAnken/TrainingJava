package Graphs;

public class main_costs {
    public static void main(String[] args) {
        GraphMethodPondere graph = new GraphRelation();
        Node A = new Node('A', "A");
        Node B = new Node('B', "B");
        Node C = new Node('C', "C");
        Node D = new Node('D', "D");
        Node E = new Node('E', "E");
        Node F = new Node('F', "F");
        Node G = new Node('G', "G");
        Node H = new Node('H', "H");

        graph.addRelation(A, D, 15);
        graph.addRelation(A, B, 20);
        graph.addRelation(B, C, 30);
        graph.addRelation(B, E, 12);
        graph.addRelation(D, B, 11);
        graph.addRelation(D, E, 25);
        graph.addRelation(D, G, 22);
        graph.addRelation(G, F, 33);
        graph.addRelation(E, H, 16);
    }
}
