package designpattern.creational.builder;

/**
 * Describes an electronic mail message.
 * @author Christian Kusan
 */
public class EMailMessage {
    
    
    // interfaces
    
    /**
     * The builder interface.
     */
    public interface IBuild {
        
        /**
         * Sets the mail mime type.
         * @param mimeTypeName the mime type name
         * @return the builder
         */
        IBuild mimeType(String mimeTypeName);
        
        /**
         * Builds a mail message.
         * @return the mail message
         */
        EMailMessage build();
    }
    
    /**
     * The mail content interface.
     */
    public interface IContent {
        
        /**
         * Sets the mail content.
         * @param content the mail content
         * @return the builder
         */
        IBuild content(String content);
    }
    
    /**
     * The mail subject interface.
     */
    public interface ISubject {
        
        /**
         * Sets the mail subject.
         * @param subject the subject
         * @return a concrete content object
         */
        IContent subject(String subject);
    }
    
    /**
     * The mail receiver interface.
     */
    public interface ITo {
        
        /**
         * Sets the mail receiver.
         * @param to the mail receiver
         * @return a concrete subject object
         */
        EMailMessage.ISubject to(String to);
    }
    
    
    // attributes
    
    /** The mail content. */
    private String _content;
    
    /** The mail sender. */
    private String _from;
    
    /** The mail mime type. */
    private String _mimeType;
    
    /** The mail subject. */
    private String _subject;
    
    /** The mail receiver. */
    private String _to;
    
    /**
     * This class builds the mail message.
     */
    private static class Builder implements IBuild, IContent, ISubject, ITo {

        
        // attributes
        
        /** The e-mail message. */
        final private EMailMessage _INSTANCE;
        
        
        // initializer
        
        /**
         * The default constructor.
         * @param from the mail sender
         */
        public Builder(String from){
            _INSTANCE = new EMailMessage();
            _INSTANCE._from = from;
        }
        
        
        // virtual methods

        /**
         * Builds the e-mail message.
         * @return the built message
         */
        @Override
        public EMailMessage build() {
            return _INSTANCE;
        }

        /**
         * Defines the content.
         * @param content the mail text content
         * @return the builder
         */
        @Override
        public IBuild content(String content) {
            _INSTANCE._content = content;
            return this;
        }
        
        /**
         * Defines the mime type.
         * @param mimeTypeName the mime type name
         * @return the builder
         */
        @Override
        public IBuild mimeType(String mimeTypeName) {
            _INSTANCE._mimeType = mimeTypeName;
            return this;
        }

        /**
         * Defines the mail subject.
         * @param subject the mail subject
         * @return the builder
         */
        @Override
        public IContent subject(String subject) {
            _INSTANCE._subject = subject;
            return this;
        }

        /**
         * Defines the receiver.
         * @param to the mail receiver
         * @return the builder
         */
        @Override
        public ISubject to(String to) {
            _INSTANCE._to = to;
            return this;
        }
        
    }
    
    
    // initializer 
 
    /**
     * The default constructor.
     */
    private EMailMessage(){}
    
    
    // static methods
    
    /**
     * Gets the mail builder.
     * @param from the sender
     * @return the mail message
     */
    public static ITo from(String from) {
        return new EMailMessage.Builder(from);
    }
}      