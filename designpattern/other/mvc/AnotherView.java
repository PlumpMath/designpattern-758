package designpattern.other.mvc;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Another view class.
 * @author Christian Kusan
 */
public class AnotherView extends JFrame implements Observer {
    
    
    // attributes
    
    /** The output label. */
    final private JLabel _LABEL;
    
    /** The content model. */
    final private Model _model;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param model the used data model
     */
    public AnotherView(Model model) { 
        
        _model = model; 
        _model.addObserver(AnotherView.this); 
        
        _LABEL = new JLabel(); 
        add(_LABEL); 
         
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setSize(200, 200);
        setTitle("Output");
        setVisible(true); 
    } 
    
    
    // methods
    
    /**
     * Updates the view.
     * @param o the changed subject
     * @param arg the given arguments from the subject
     */
    @Override 
    public void update(Observable o, Object arg){ 
        
        if(null != o)
            _LABEL.setText(_model.getContent()); 
    } 
}