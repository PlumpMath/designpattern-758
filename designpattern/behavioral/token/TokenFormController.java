package designpattern.behavioral.token;

import java.util.Random;

// spring mvc framework is necessary, because of that, methods are commented out

/*
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

/**
 * Synchronizer token pattern to prevent double processing of a html form.
 * This implementation uses the spring mvc framework.
 * @author Christian Kusan
 */
public class TokenFormController /*extends CancellableFormController*/ {

    
    // attributes
    
    /** The token key. */
    final private static String TOKEN_KEY = "_synchronizerToken";
    
    /** The invalid token view. */
    private String invalidTokenView;

    
    // static
    
    /**
     * Gets the token key.
     * @return a string
     */
    public static String getTokenKey() {
        return TOKEN_KEY;
    }
    
    /**
     * Returns the next token.
     * @return a string
     */
    public static String nextToken() {
        
        long seed = System.currentTimeMillis(); 
        Random r = new Random();
        r.setSeed(seed);
        return Long.toString(seed) + Long.toString(Math.abs(r.nextLong()));
    }
    
    
    // getter and setter
    
    /**
     * Gets the invalid token view.
     * @return the string token
     */
    public String getInvalidTokenView() {
        return invalidTokenView;
    }
    
    /**
     * Sets the invalid token view.
     * @param invalidTokenView the new string token
     */
    public void setInvalidTokenView(String invalidTokenView) {
        this.invalidTokenView = invalidTokenView;
    }
    
    
    // methods

    /**
     * Checks whether the token is valid or not duplicate.
     * @param request the request
     * @return true if valid, otherwise false
     * @throws TokenException 
     *//*
    private synchronized boolean isTokenValid(HttpServletRequest request) throws TokenException {
        
        HttpSession session = request.getSession();
        String sessionToken = (String)session.getAttribute(getTokenKey());
        String requestToken = request.getParameter(getTokenKey());
        
        if(null == requestToken)
            // the hidden field wasn't provided
            throw new TokenException("Missing synchronizer token in request");
        
        if(null == sessionToken)
            // The session has lost the token
            throw new TokenException("Missing synchronizer token in session");
        
        if(sessionToken.equals(requestToken)) {
            // accept the submission and increment the token so this form can't be submitted again
            session.setAttribute(getTokenKey(), nextToken());
            return true;
        }
        
        return false;
    }*/

    /**
     * Handles a form submit request.
     * @param request the request
     * @param response the response
     * @param command the command
     * @param errors the bind exception errors
     * @return a ModelAndView instance
     * @throws Exception 
     *//*
    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response,
                Object command, BindException errors) throws Exception {
        
        if(isTokenValid(request))
            return super.onSubmit(request, response, command, errors);
        
        return new ModelAndView(invalidTokenView);
    }*/
}