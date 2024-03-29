/**
 *
 * @author roudet
 */
public class Pomme implements Fruit {
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
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
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
    public boolean equals(Object o){  //predicat pour tester si 2 Pommes sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Pomme or = (Pomme) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Pomme a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	//System.out.println("premier test Pomme");

        Pomme o1 = new Pomme();
        Pomme o2 = new Pomme(1.23, "");
        Pomme o3 = new Pomme(1.5, "Maroc");
        
        o1.setOrigine("Suisse");
        o2.setPrix(2.25);

        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());

   }
}
