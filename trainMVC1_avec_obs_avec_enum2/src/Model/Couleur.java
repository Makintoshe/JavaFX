package Model;

import Model.Couleur;

// TODO: Auto-generated Javadoc
/**
 * The Enum Couleur.
 */
public enum Couleur {
    
    /** The blue. */
    BLUE("bleu"),
    
    /** The green. */
    GREEN("vert"),
    
    /** The red. */
    RED("rouge"),
    
    /** The yellow. */
    YELLOW("jaune");
	
    
    /** The couleur. */
    private final String couleur;
    
    /**
     * Instantiates a new couleur.
     *
     * @param couleur the couleur
     */
    private Couleur(String couleur) {
    	this.couleur = couleur;
    }
    
    /**
     * Gets the couleur.
     *
     * @return the couleur
     */
    private String getCouleur() {
    	return couleur;
    }
    
    /**
     * Gets the enum.
     *
     * @param txt the txt
     * @return the enum
     */
    public static Couleur getEnum(String txt) {         
    	for (Couleur uneCouleur : Couleur.values())             
    		if (uneCouleur.getCouleur().equals(txt)) 
    			return uneCouleur;         
    	return null;     
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override 
    public String toString() {
        return couleur;
    }
}
