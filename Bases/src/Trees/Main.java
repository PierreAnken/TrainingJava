package Trees;

public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================================================");
        System.out.println("===== 1) Test de la classe Arbre : listeSansEnfant() & sontCousins() =============");
        System.out.println("==================================================================================");

        Arbre a = getArbre();
        System.out.println("Personnes sans enfant: " + a.listeSansEnfant());

        System.out.println("Caro & Celia " + (a.sontCousins("Caro", "Celia") ? "sont" : "ne sont pas") + " cousins");
        System.out.println("Doly & Daryl " + (a.sontCousins("Doly", "Daryl") ? "sont" : "ne sont pas") + " cousins");
        System.out.println("Cody & Cora " + (a.sontCousins("Cody", "Cora") ? "sont" : "ne sont pas") + " cousins");
        System.out.println("Celia & Daria " + (a.sontCousins("Celia", "Daria") ? "sont" : "ne sont pas") + " cousins");

    }

    private static Arbre getArbre() {
        Arbre a = new ArbreListe();
        a.creer("Adam", a.creer("Barry", a.creer("Caren"), a.creer("Carla", a.creer("Daria"), a.creer("Daryl")), a.creer("Caro")), a.creer("Ben", a.creer("Celia")), a.creer("Bill"), a.creer("Bob", a.creer("Cody", a.creer("Doly")), a.creer("Colin"), a.creer("Cora")));
        return a;
    }
}