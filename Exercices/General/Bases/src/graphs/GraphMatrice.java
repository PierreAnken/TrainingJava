package graphs;

import java.util.ArrayList;
import java.util.Arrays;
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
    public char getCharFromIndex(int index){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUWXZY";
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
        //System.out.println("Nodes accessibles depuis "+source.getName()+": "+parcoursGraph(source.getName(), new ArrayList<>()));
        return parcoursGraph(source.getName(), new ArrayList<>()).contains(String.valueOf(dest.getName()));
    }

    private ArrayList<String> parcoursGraph(char letter, ArrayList<String> relations){

        if(!relations.contains(String.valueOf(letter))){
            // save node as visited
            relations.add(String.valueOf(letter));

            // parcours relations
            int[] relationArray = matriceRelations[getIndexFromChar(letter)];
            //System.out.println("relations from "+letter+": "+ Arrays.toString(relationArray));

            int indexLine = 0;
            for (int nodeRelation: relationArray) {
                if(nodeRelation == 1){
                    parcoursGraph(getCharFromIndex(indexLine), relations);
                }
                indexLine++;
            }
        }
        return relations;
    }

}
