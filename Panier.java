import java.util.ArrayList;

/**
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax) {  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)

    }

    //tests
    public static void main(String[] args) throws PanierPleinException {
        //Ecrire ici vos tests
        System.out.println("premier test Panier");
        Panier p1 = new Panier(5);
        Panier p2 = new Panier(5);
        Panier p3 = new Panier(1);

        Orange o1 = new Orange(0.5, "Espagne");
        Orange o2 = new Orange(1.0, "Espagne");
        Orange o3 = new Orange(0.8, "France");
        Orange o4 = new Orange(0.2, "Italy");
        Orange o5 = new Orange(0.1, "France");

        p1.ajout(o1);
        p1.ajout(o2);
        p1.ajout(o3);
        p1.ajout(o4);
        p1.ajout(o5);

        p2.ajout(o5);
        p2.ajout(o3);
        p2.ajout(o2);
        p2.ajout(o1);
        p2.ajout(o4);

        p3.ajout(o5);

        System.out.println(p1.equals(p3));

    }

    @Override
    public String toString() {  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        return "";
    }

    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
        return null;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut

    }

    public int getTaillePanier() {  //accesseur retournant la taille allouee pour l'attibut fruits
        return 0;
    }

    public int getContenanceMax() {  //accesseur du second attribut
        return 0;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	    return this.fruits.get(i);
    }

    public void setFruit(int i, Fruit f) {  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        if (this.fruits.contains(this.fruits.get(i))){
            this.fruits.set(i, f);
        }    
    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
	    return this.fruits.isEmpty();
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
		    return !this.fruits.isEmpty();
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException {  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein

    }

    //groupe 5
    public void retrait() throws PanierVideException { //retire le dernier fruit du panier si celui-ci n'est pas vide

    }

    //groupe 6
    public double getPrix() {  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
        return 0;
    }

    //groupe 7
    public void boycotteOrigine(String origine) {  //supprime du panier tous les fruits provenant du pays origine

    }

    //groupe 8
    @Override
    public boolean equals(Object o) {  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        if (o != null && getClass() == o.getClass()) {
            Panier p = (Panier) o;
            int compt = 0;
            if (p.fruits.size() == this.fruits.size()) {
                for (Fruit f : p.fruits) {
                    if (this.fruits.contains(f)) {
                        System.out.println(f);
                        compt++;
                    }
                }
                return compt == p.fruits.size();
            }
        }
        return false;
    }
    
    //tests
    public static void main (String[] args){
    	//Ecrire ici vos tests
	System.out.println("premier test Panier");
    }
}
