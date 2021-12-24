package Model;

import Model.Fonte;
import javafx.scene.text.FontWeight;

// TODO: Auto-generated Javadoc
/**
 * The Enum Fonte.
 */
public enum Fonte{
    
    /** The bold. */
    BOLD("gras"),
    
    /** The italic. */
    ITALIC("italique");
    
    /** The une fonte. */
    private final String uneFonte;
    
    /**
     * Instantiates a new fonte.
     *
     * @param uneFonte the une fonte
     */
    private Fonte(String uneFonte) {
    	this.uneFonte = uneFonte;
    }
    
    /**
     * Gets the font.
     *
     * @return the font
     */
    private String getFont() {
    	return uneFonte;
    }
    
    /**
     * Gets the enum.
     *
     * @param txt the txt
     * @return the enum
     */
    public static Fonte getEnum(String txt) {         
    	for (Fonte uneFonte : Fonte.values())             
    		if (uneFonte.getFont().equals(txt)) 
    			return uneFonte;         
    	return null;     
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override 
    public String toString() {
        return uneFonte;
    }
}
