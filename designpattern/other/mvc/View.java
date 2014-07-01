package designpattern.other.mvc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * The view class.
 * @author Christian Kusan
 */
public class View extends JFrame {
    
    
    // attributes
    
    /** The model to store the data. */
    final private Model _MODEL;
    
    /** The input textfield. */
    final private JTextField _TEXTFIELD; 
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param model the used data model
     */
    public View(Model model) {
        
        _MODEL = model; 
        
        _TEXTFIELD = new JTextField("");
        JButton btn = new JButton("Senden");
        
        // here's the controller, written as lambda expression
        btn.addActionListener((ActionEvent ae) -> {
            _MODEL.setContent(_TEXTFIELD.getText()); 
        }); 
        
        setLayout(new GridLayout(1,2));
        add(_TEXTFIELD); 
        add(btn); 
         
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(200, 200);
        setTitle("Input");
        setVisible(true); 
    } 
}