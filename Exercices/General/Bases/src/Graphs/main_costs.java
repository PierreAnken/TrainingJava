package Graphs;

public class main_costs {
    public static void main(String[] args) {
        GraphMethod graph = new GraphRelation();
        Node A = new Node('A', "A");
        Node B = new Node('B', "B");
        Node C = new Node('C', "C");
        Node D = new Node('D', "D");
        Node E = new Node('E', "E");
        Node F = new Node('F', "F");
        Node G = new Node('G', "G");
        Node H = new Node('H', "H");

        graph.addRelation(A, D);
        graph.addRelation(A, B);
        graph.addRelation(B, C);
        graph.addRelation(B, E);
        graph.addRelation(D, B);
        graph.addRelation(D, E);
        graph.addRelation(D, G);
        graph.addRelation(G, F);
        graph.addRelation(E, H);
    }
}
