package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphMatrice implements GraphMethod{

    int[][] matriceRelations;


    public GraphMatrice(int nombreNeuds){
        matriceRelations = new int[nombreNeuds][nombreNeuds];
    }

    public int getIndexFromChar(char lettre){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUWXZY";
        return alphabet.indexOf(lettre);
    }
    public char getIndexFromChar(int index){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUWXZY";
        return alphabet.charAt(index);
    }


    public void addRelation(Node source,Node dest){
        // ajoute une relation(arête) entre les 2 noeuds(sommets) spécifiés
        matriceRelations[getIndexFromChar(dest.getName())][getIndexFromChar(source.getName())] = 1;
    }

    public boolean existeRelation(Node source, Node dest){
        //indique si une relation existe entre ces 2 noeuds
        return matriceRelations[getIndexFromChar(dest.getName())][getIndexFromChar(source.getName())] == 1;
    }

    public boolean existeChemin(Node source,Node dest){
        //qui indique si un chemin existe entre ces 2 noeuds :
        // retournera donc true pour existeChemin(A,E), mais false pour existeChemin(A,H) !

        return parcoursGraph(source.getName(), "").indexOf(dest.getName()) != -1;
    }

    private String parcoursGraph(char letter, String relations){
        if(relations.indexOf(letter) == -1){
            // save node as visited
            relations+=letter;

            // parcours relations
            int[] relationArray = matriceRelations[getIndexFromChar(letter)];
            for (int nodeRelation: relationArray) {
                parcoursGraph(getIndexFromChar(nodeRelation), relations);
            }
        }
        return relations;
    }

}
