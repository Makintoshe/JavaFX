package model;

// TODO: Auto-generated Javadoc
/**
 * The Enum Operator.
 */
public enum Operator {

	/** The add. */
	ADD("+"),
	
	/** The sous. */
	SOUS("-"),
	
	/** The prod. */
	PROD("*"),
	
	/** The div. */
	DIV("/"),
	
	/** The sin. */
	SIN("sin"),
	
	/** The square. */
	SQUARE("X^2"),
	
	/** The sqrt. */
	SQRT("sqrt");
	
    /** The operation. */
    private String operation ;  
    
    /**
     * Instantiates a new operator.
     *
     * @param abreviation the abreviation
     */
    private Operator(String abreviation) {  
        this.operation = abreviation ;  
   }  
    
    /**
     * Gets the operation.
     *
     * @return the operation
     */
    public String getOperation() {
    	return operation;
    }
	
    /**
     * Gets the operation description.
     *
     * @return the operation description
     */
    public String getOperationDescription() {   //toString
        return  this.operation ;  
    }  

    /**
     * Gets the enum.
     *
     * @param txt the txt
     * @return the enum
     */
    public static Operator getEnum(String txt) {         
    	for (Operator unOperateur : Operator.values())             
    		if (unOperateur.getOperation().equals(txt)) 
    			return unOperateur;         
    	return null;     
    }
    
}

