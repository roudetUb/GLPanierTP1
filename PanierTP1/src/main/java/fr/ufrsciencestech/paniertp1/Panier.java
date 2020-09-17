import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
      // Guillaume
	     this.contenanceMax = Math.abs(contenanceMax);
       this.fruits = new ArrayList<Fruit>();
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        // Guillaume
        return "Le panier comporte " + this.fruits.size() + " et a une contenanceMax de " + this.contenanceMax;
    }

    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
	this.fruits = fruits;
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return fruits.size();
    }

    public int getContenanceMax(){  //accesseur du second attribut
	return contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	return null;
    }

    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)

    }

    public boolean estVide(){  //predicat indiquant que le panier est vide
	return false;
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein
	return false;
    }

    //groupe 4 LILI et RIRINE
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
      if(this.fruits.size() < this.contenanceMax){
        this.fruits.add(o);
      }
      else throw new PanierPleinException();
    }

    //groupe 5
    public void retrait(){ // throws PanierVideException{  //retire le dernier fruit du panier si celui-ci n'est pas vide
        //Sarra et Sacha 
        int indice = this.fruits.size();              //modifié par C. Roudet
        Fruit nom_fruit = this.fruits.get(indice-1);  //modifié par C. Roudet
        
        if (indice != 0){
            this.fruits.remove(indice-1);             //modifié par C. Roudet
            System.out.println(nom_fruit.toString() +" a été supprimé du panier");
        }
        else{
            System.out.println("impossible de supprimer, le panier est vide");
        }
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	return 0;
    }

    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine

    }

    //groupe 8
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
      if (o == null || getClass() != o.getClass()) return false;
      Panier p = (Panier)o;
      int length = Math.min(p.getTaillePanier(), this.getTaillePanier());
      for (int i = 0; i < length; i++) {
        if (!p.getFruit(i).equals(this.getFruit(i))) return false;
      }

      return true;
    }

    //tests
     public static void main (String[] args){
    	//Ecrire ici vos tests
	System.out.println("premier test Panier");

        Framboise framboise = new Framboise();
        framboise.setPrix(1.4);
        framboise.setOrigine("France");
        framboise.toString();

        //test ajout panier
        Panier panier = new Panier(1);
        Pomme pomme = new Pomme();
        Pomme pomme2 = new Pomme();
        System.out.println(pomme);
        try{
            panier.ajout(pomme);
            panier.ajout(pomme2);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println();

        Fraise fraise = new Fraise();
        fraise.setPrix(1.4);
        fraise.setOrigine("France");
        fraise.toString();
        panier.retrait();  

    


    }
}
