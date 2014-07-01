package designpattern.behavioral.command;

/**
 * Concrete command.
 * @author Christian Kusan
 */
public class MonsterComeOutCommand implements ICommand {
    
    
    // attributes
    
    /** The monster. */
    final private Monster _MONSTER;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param monster the receiver object
     */
    public MonsterComeOutCommand(Monster monster){
        _MONSTER = monster; 
    }
    
    
    // methods
    
    /**
     * Executes the come out command.
     */
    @Override
    public void execute(){
        
        if(10 > _MONSTER.isScared()) // filter
            _MONSTER.comeOutOfHiding();
        else 
            _MONSTER.comeOutOfHiding2();
    }
}