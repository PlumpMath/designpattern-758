package designpattern.creational.abstractFactory;

/**
 * Concrete factory for cavaliers.
 * @author Christian Kusan
 */
public class Cavalier implements ICharacter {
    
    /**
     * Creates the mount.
     * @return a pony
     */
    @Override
    public IMount createMount() {
        return new Pony();
    }

    /**
     * Creates the weapon.
     * @return a sword
     */
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
    
}