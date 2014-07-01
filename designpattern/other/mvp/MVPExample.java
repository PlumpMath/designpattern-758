package designpattern.other.mvp;

import javax.swing.JOptionPane;

/**
 * Shows a mvp example.
 * @author Christian Kusan
 */
public class MVPExample {

    /**
     * The default constructor.
     */
    public MVPExample(){
        
        User user = new User();
        Presenter presenter = new Presenter();
        View view = new View();
        
        presenter.setModel(user);
        presenter.setView(view);
        
        presenter.setOnLogin(() -> {
            JOptionPane.showMessageDialog(null, "Welcome user!");
            System.exit(-1);
        });
        
        presenter.run();
    }
}