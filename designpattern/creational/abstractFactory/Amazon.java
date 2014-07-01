package designpattern.creational.abstractFactory;

/**
 * Concrete factory for amazons.
 * @author Christian Kusan
 */
public class Amazon implements ICharacter {

    /**
     * Creates the mount.
     * @return a panther
     */
    @Override
    public IMount createMount() {
        return new Panther();
    }

    /**
     * Creates the weapon.
     * @return a bow
     */
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
    
}