package designpattern.creational.prototype;

/**
 * Describes an abstract shape or the shape prototype.
 * @author Christian Kusan
 */
public abstract class Shape implements Cloneable {
    
    
    // attributes
    
    /** The shape id. */
    private String _id;
    
    /** The shape type. */
    protected String _type;
   
    
    // getter and setter
   
    /**
     * Gets the shape id.
     * @return the id
     */
    public String getId() {
      return _id;
    }
    
    /**
     * Gets the shape type.
     * @return the type
     */
    public String getType(){
        return _type;
    }
   
    /**
     * Sets the shape id.
     * @param id the id
     */
    public void setId(String id) {
        _id = id;
    }
   
    
    // methods
    
    /**
     * Clones the object.
     * @return the cloned object
     * @throws CloneNotSupportedException an exception if the object clone is 
     * not supported
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
    
    /**
     * Draws the shape.
     */
    abstract void draw();
   
}