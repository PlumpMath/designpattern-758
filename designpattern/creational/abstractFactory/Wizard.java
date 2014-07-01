package designpattern.creational.abstractFactory;

/**
 * Concrete factory for wizards.
 * @author Christian Kusan
 */
public class Wizard implements ICharacter {

    /**
     * Creates the mount.
     * @return a donkey
     */
    @Override
    public IMount createMount(){
        return new Donkey();
    }
    
    /**
     * Creates the weapon.
     * @return a wand
     */
    @Override
    public Weapon createWeapon(){
        return new MagicWand();
    }
    
}