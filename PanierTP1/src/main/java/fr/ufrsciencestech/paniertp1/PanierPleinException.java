package fr.ufrsciencestech.paniertp1;

/**
 *
 * @author roudet
 */
public class PanierPleinException extends Exception {
    
    public PanierPleinException()
    {
	super("Ajout impossible car le panier est plein !");
    }

}
