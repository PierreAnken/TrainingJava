package Graphs;

public class main {
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

        graph.addRelation(A,D);
        graph.addRelation(A,B);
        graph.addRelation(B,C);
        graph.addRelation(B,E);
        graph.addRelation(D,B);
        graph.addRelation(D,E);
        graph.addRelation(D,G);
        graph.addRelation(G,F);
        graph.addRelation(H,G);

        System.out.println("chemin entre A et F? " +graph.existeChemin(A,F));
        System.out.println("chemin entre A et H? " +graph.existeChemin(A,H));
        System.out.println("chemin entre G et B? " +graph.existeChemin(G,B));
        System.out.println("relation entre G et B? " +graph.existeRelation(G,B));
        System.out.println("relation entre A et D? " +graph.existeRelation(A,D));

    }
}
