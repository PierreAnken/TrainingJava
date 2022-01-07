package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GraphMatrice implements GraphMethod{

    private int[][] matriceRelations;
    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUWXZY";

    public GraphMatrice(int nombreNeuds){
        matriceRelations = new int[nombreNeuds][nombreNeuds];
    }

    public int getIndexFromChar(char lettre){
        return alphabet.indexOf(lettre);
    }
    public char getCharFromIndex(int index){
        return alphabet.charAt(index);
    }


    public void addRelation(Node source,Node dest){
        // ajoute une relation(arête) entre les 2 noeuds(sommets) spécifiés
        matriceRelations[getIndexFromChar(source.getName())][getIndexFromChar(dest.getName())] = 1;
    }

    public boolean existeRelation(Node source, Node dest){
        //indique si une relation existe entre ces 2 noeuds
        return matriceRelations[getIndexFromChar(source.getName())][getIndexFromChar(dest.getName())] == 1;
    }

    public boolean existeChemin(Node source,Node dest){
        //qui indique si un chemin existe entre ces 2 noeuds :
        // retournera donc true pour existeChemin(A,E), mais false pour existeChemin(A,H) !
        return parcoursGraph(source.getName(), "").contains(String.valueOf(dest.getName()));
    }

    private String parcoursGraph(char letter, String relations){

        if(!relations.contains(String.valueOf(letter))){
            // save node as visited
            relations+=letter;

            // parcours relations
            int[] relationArray = matriceRelations[getIndexFromChar(letter)];

            int indexLine = 0;
            for (int nodeRelation: relationArray) {
                if(nodeRelation == 1){
                   relations = parcoursGraph(getCharFromIndex(indexLine), relations);
                }
                indexLine++;
            }
        }
        return relations;
    }

}
