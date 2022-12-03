package Graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphRelation implements GraphMethod{

    private List<Relation> lstRelations;

    public GraphRelation (){
        this.lstRelations = new ArrayList<>();
    }

    @Override
    public void addRelation(Node source, Node dest) {
        lstRelations.add(new Relation(source,dest));
    }

    @Override
    public boolean existeRelation(Node source, Node dest) {
        return lstRelations.contains(new Relation(source,dest));
    }

    @Override
    public boolean existeChemin(Node source, Node dest) {
        return parcoursGraph(source, new ArrayList<>()).contains(dest);
    }

    private List<Node> parcoursGraph(Node start, List<Node> visitedNodes){

        // Save current node
        visitedNodes.add(start);

        // For each relation
        for (Relation nodeRelation: lstRelations) {

            // If we are the source of the relation
            if(nodeRelation.getSource().getName() == start.getName()){

                // If nobody visited relation destination yet
                if(!visitedNodes.contains(nodeRelation.getDest())){
                    // Recursively visit linked nodes
                    parcoursGraph(nodeRelation.getDest(), visitedNodes);
                }
            }
        }

        return visitedNodes;
    }
}
