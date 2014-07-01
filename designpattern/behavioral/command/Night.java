package designpattern.behavioral.command;

/**
 * Client.
 * @author Christian Kusan
 */
public class Night {

    /**
     * The default constructor.
     */
    public Night(){
        
        Light light = new Light();
        OnCommand lightOn = new OnCommand(light);
        OffCommand lightOff = new OffCommand(light);
        
        // light switcher 1
        LightSwitch lightSwitcher = new LightSwitch(lightOn, lightOff);
        lightSwitcher.switchOn();
        lightSwitcher.switchOff();
        Monster monster = new Monster();
        MonsterHideCommand monsterHide = new MonsterHideCommand(monster);
        MonsterComeOutCommand monsterCome = new MonsterComeOutCommand(monster);
        
        
        // light switcher 2
        LightSwitch lightSwitcher2 = new LightSwitch(monsterHide, monsterCome);
        lightSwitcher2.switchOn();
        lightSwitcher2.switchOff();
        
        System.out.println("");
        
        // filter test
        for(int i = 0; 10 > i; ++i)
            lightSwitcher2.switchOn();
        System.out.println("");
        
        lightSwitcher2.switchOff();
    }
}