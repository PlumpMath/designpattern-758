package designpattern.behavioral.command;

/**
 * Concrete command.
 * @author Christian Kusan
 */
public class MonsterHideCommand implements ICommand {
    
    
    // attributes
    
    /** The monster. */
    final private Monster _MONSTER;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param monster the receiver object
     */
    public MonsterHideCommand(Monster monster){
        _MONSTER = monster; 
    }
    
    
    // methods
    
    /**
     * Executes the hide command.
     */
    @Override
    public void execute(){
        
        _MONSTER.hide();
    }
}