package designpattern.other.mvp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * View.
 * @author Christian Kusan
 */
public class View extends JFrame {

    
    // attributes
    
    /** The message label. */
    final private JLabel _MSG_LABEL;
    
    /** The presenter. */
    private Presenter _presenter;
    
    /** The input field. */
    final private JTextField _TEXTFIELD;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public View() {
        
        _presenter = new Presenter();
        
        _MSG_LABEL = new JLabel("Login");
        _TEXTFIELD = new JTextField();
        
        View.this.init();
    }

    /**
     * Initializes the view.
     */
    private void init() {

        _TEXTFIELD.setColumns(13);
        
        JButton btn = new JButton("Login");
        btn.addActionListener((ActionEvent evt) -> {
            _presenter.login();
        });

        GridBagLayout layout = new GridBagLayout();
        layout.columnWidths = new int[] {0, 7, 0};
        layout.rowHeights = new int[] {0, 7, 0, 7, 0};
        setLayout(layout);
        
        add(_MSG_LABEL, 
                new GridBagConstraints(0, 0, 3, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 10, 10));
        add(new JLabel("User:"), 
                new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 10, 10));
        add(_TEXTFIELD, 
                new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 10, 10));
        add(btn, new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 10, 10));
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(200, 200);
        setTitle("MVP");
    }

    
    // getter and setter
    
    /**
     * Sets the presenter.
     * @param presenter a new presenter object
     */
    public void setPresenter(Presenter presenter){
        _presenter = presenter;
    }
    
    
    // methods
    
    /**
     * Closes the window.
     */
    public void close() { dispose(); }
    
    /**
     * Opens the window.
     */
    public void open() {
        
        setVisible(true);
        _TEXTFIELD.selectAll();
        _TEXTFIELD.requestFocus();
    }
    
    /**
     * Updates the model.
     */
    public void updateModelFromView() {
        _presenter.getModel().setUsername(_TEXTFIELD.getText());
    }

    /**
     * The user is rejected.
     */
    public void userRejected() {
        
        _MSG_LABEL.setText("Try it again!");
        _TEXTFIELD.selectAll();
        _TEXTFIELD.requestFocus();
    }
    
    /**
     * Updates the view.
     */
    public void updateViewFromModel() {
        _TEXTFIELD.setText(_presenter.getModel().getUsername());
    }
  
}