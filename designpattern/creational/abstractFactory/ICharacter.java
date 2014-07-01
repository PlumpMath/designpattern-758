package designpattern.creational.abstractFactory;

/**
 * Abstract factory.
 * @author Christian Kusan
 */
public interface ICharacter {
  
    /**
     * Creates a mount.
     * @return the mount
     */ 
    IMount createMount();
    
    /**
     * Creates a weapon.
     * @return the weapon
     */
    Weapon createWeapon();
}