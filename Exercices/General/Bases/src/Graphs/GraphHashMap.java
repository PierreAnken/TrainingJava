package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphHashMap implements GraphMethod{

    HashMap<Node, ArrayList<Node>> relations;

    public GraphHashMap(){
        relations = new HashMap<>();
    }

    public void addRelation(Node source,Node dest){
        // ajoute une relation(arête) entre les 2 noeuds(sommets) spécifiés
        ArrayList<Node> nodeRelations =  relations.get(source);
        if(nodeRelations == null){
            nodeRelations = new ArrayList<>();
        }
        nodeRelations.add(dest);
        relations.put(source, nodeRelations);
    }

    public boolean existeRelation(Node source, Node dest){
        //indique si une relation existe entre ces 2 noeuds
        return relations.getOrDefault(source, new ArrayList<>()).contains(dest);
    }

    public boolean existeChemin(Node source,Node dest){
        //qui indique si un chemin existe entre ces 2 noeuds :
        // retournera donc true pour existeChemin(A,E), mais false pour existeChemin(A,H) !

        return parcoursGraph(source, new ArrayList<>()).contains(dest);
    }

    private ArrayList<Node> parcoursGraph(Node source, ArrayList<Node> nodes){
        if(!nodes.contains(source)){
            // save node as visited
            nodes.add(source);

            // parcours relations
            for (Node nodeRelation: relations.getOrDefault(source, new ArrayList<>())) {
                parcoursGraph(nodeRelation, nodes);
            }
        }
        return nodes;
    }

}
