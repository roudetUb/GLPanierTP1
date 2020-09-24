package fr.ufrsciencestech.paniertp1;


import fr.ufrsciencestech.paniertp1.Fruit;
import fr.ufrsciencestech.paniertp1.Fruit;

/**
 *
 * @author hs731277
 */
public class Pomme implements Fruit{
    private double prix;
    private String origine;

    public Pomme()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }

    public Pomme(double prix, String origine)
    {
      	if(prix < 0)
      	    this.prix = -prix;
      	else
      	    this.prix = prix;

      	if(origine.equals(""))
                  this.origine = "Espagne";  //Espagne par défaut
      	else
                  this.origine = origine;
    }

    public double getPrix(){
	     return prix;
    }

    public void setPrix(double prix){
	     this.prix=prix;
    }

    public String getOrigine(){
	     return origine;
    }

    public void setOrigine(String origine){
	     this.origine=origine;
    }

    @Override
    public String toString(){
        return "Pomme de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){
        if(o != null && getClass() == o.getClass()){
            Pomme p = (Pomme) o;
            return (prix == p.prix && origine.equals(p.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une pomme a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        System.out.println("premier test Pomme");
        Pomme pomme = new Pomme(-2, "UB Dijon");
        System.out.println(pomme.toString());
   }
}
