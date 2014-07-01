package designpattern.other.mvp;

/**
 * Presenter.
 * @author Christian Kusan
 */
public class Presenter {
    
    
    // attributes
    
    /** The login thread. */
    private Runnable _onLogin;
    
    /** The view. */
    private View _view;
    
    /** The user. */
    private User _user;
    
    
    // getter and setter
    
    /**
     * Gets the user.
     * @return the user
     */
    public User getModel() {
        return _user;
    }

    /**
     * Gets the view.
     * @return a view instance
     */
    public View getView() {
        return _view;
    }
    
    /**
     * Sets the user.
     * @param user the new user
     */
    public void setModel(User user) {
        _user = user;
    }

    /**
     * Sets logged in.
     * @param onLogin a new runnable instance
     */
    public void setOnLogin(Runnable onLogin) {
        _onLogin = onLogin;
    }
    
    /**
     * Sets the view.
     * @param view the new view 
     */
    public void setView(View view) {
        _view = view;
    }

    
    // methods

    /**
     * Logs in.
     */
    public void login() {
        
        _view.updateModelFromView();
        
        if(_user.getUsername().equalsIgnoreCase("root")) {
            
            _view.close();
            _view.setPresenter(null); // for memory sanity
            _onLogin.run();
        } 
        else _view.userRejected();
    }

    /**
     * Runs the thread.
     */
    public void run() {
        
        _user.setUsername("previousUser");
        _view.setPresenter(this);
        _view.updateViewFromModel();
        _view.open();
    }

}