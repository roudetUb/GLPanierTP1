import java.util.ArrayList;

/**
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax) {  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        this.fruits = new ArrayList<Fruit>();
        if (contenanceMax < 1) {
            throw new IllegalArgumentException("La contenance maximale doit être supérieure à 0");
        } else {
            this.contenanceMax = contenanceMax;
        }
    }

    @Override
    public String toString() {  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String result = "";
        for (Fruit f : fruits) {
            result += f.toString() + "\n";
        }
        return result;
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
    public Fruit getFruit(int i) {  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
        return this.fruits.get(i);
    }

    public void setFruit(int i, Fruit f) {  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        if (this.fruits.contains(this.fruits.get(i))) {
            this.fruits.set(i, f);
        }
    }

    public boolean estVide() {  //predicat indiquant que le panier est vide
        return this.fruits.isEmpty();
    }

    public boolean estPlein() {  //predicat indiquant que le panier est plein
        return !this.fruits.isEmpty();
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        boolean found = false;
        if (!fruits.isEmpty()){ 
            for (Fruit fruit : fruits) {
                if (o.equals(fruit)) found=true;
            }
        }
        if (!found) fruits.add(o);
    }

    //groupe 5
    public void retrait() throws PanierVideException { //retire le dernier fruit du panier si celui-ci n'est pas vide

    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	    double prix = 0.0;
        for (int i=0; i<fruits.size(); i++) {
            prix += fruits.get(i).getPrix();
        }
        return prix;
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
        Banane b1=new Banane();
        Banane b2=new Banane(10, "Espagne");
        Banane b3=new Banane(-5, "Espagne");
        Orange o1=new Orange();
        Orange o2=new Orange(10, "Espagne");
        Orange o3=new Orange(-5, "Espagne");
        Panier p=new Panier(10);
        try {
            p.ajout(o1);
            p.ajout(o2);
            p.ajout(o3);
            p.ajout(o1);

            p.ajout(b1);
            p.ajout(b2);
            p.ajout(b3);
            p.ajout(b1);
            for (Fruit fruit : p.fruits) {
                System.out.println(fruit.toString());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
	    System.out.println("premier test Panier");
    }
}
