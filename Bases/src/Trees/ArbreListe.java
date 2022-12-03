package Trees;

import java.util.*;

public class ArbreListe implements Arbre {
    private Noeud racine;

    public ArbreListe() {
        racine = null;
    }

    static class Noeud {
        private String nom;
        private List<Noeud> fils;

        public Noeud(String nom, List<Noeud> fils) {
            this.nom = nom;
            this.fils = fils;
        }

        public String toString() {
            return nom;
        }
    }

    @Override
    public Noeud creer(String nom, Noeud... fils) {
        return racine = new Noeud(nom, fils.length == 0 ? null : new ArrayList<>(Arrays.asList(fils)));
    }

    /**
     * Retourne la liste des noms des personnes n'ayant pas d'enfant ("les feuilles de l'arbre")
     */
    @Override
    public List<String> listeSansEnfant() {
        return parcoursArbreRec(racine, new ArrayList<>());
    }

    private List<String> parcoursArbreRec(Noeud depart, List<String> noms) {
        // Si pas d'enfants, on sauvegarde
        if (depart.fils == null) {
            noms.add(depart.nom);
        } else {
            for (Noeud fils : depart.fils) {
                parcoursArbreRec(fils, noms);
            }
        }
        return noms;
    }

    /**
     * Indique si nom1 & nom2 sont "au même niveau" et n'ont pas le même père
     */
    @Override
    public boolean sontCousins(String nom1, String nom2) {

        Object[] dataA = getNodeDataFromName(nom1, racine, null, 0);
        Object[] dataB = getNodeDataFromName(nom2, racine, null, 0);

        // pères différents?
        if(dataA[2] != dataB[2]) {
            //même niveau?
            return dataA[1] == dataB[1];
        }

        return false;
    }

    // [noeud, niveau, pere]
    private Object[] getNodeDataFromName(String searchedName, Noeud current, Noeud pere, Integer niveau) {
        Object[] data = null;

        if (current.nom.equals(searchedName)) {
            return new Object[]{current, niveau, pere};
        }

        if (current.fils != null) {
            for (Noeud fils : current.fils) {
                Object[] childrenData = getNodeDataFromName(searchedName, fils, current, niveau + 1);
                if (childrenData != null) {
                    data = childrenData;
                }
            }
        }
        return data;
    }
}