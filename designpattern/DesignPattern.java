package designpattern;

import designpattern.behavioral.chainofresponsibility.JSONParser;
import designpattern.behavioral.chainofresponsibility.Parser;
import designpattern.behavioral.chainofresponsibility.TextParser;
import designpattern.behavioral.chainofresponsibility.XMLParser;
import designpattern.behavioral.command.Night;
import designpattern.behavioral.interpreter.InterpreterExample;
import designpattern.behavioral.iterator.Stack;
import designpattern.behavioral.iterator.StackIterator;
import designpattern.behavioral.mediator.AbstractUser;
import designpattern.behavioral.mediator.Chat;
import designpattern.behavioral.mediator.IChat;
import designpattern.behavioral.mediator.User;
import designpattern.behavioral.memento.CareTaker;
import designpattern.behavioral.memento.Originator;
import designpattern.behavioral.nullobject.NullObjectExample;
import designpattern.behavioral.observer.ChildsRoom;
import designpattern.behavioral.state.Calculation;
import designpattern.behavioral.strategy.CreditCardStrategy;
import designpattern.behavioral.strategy.Item;
import designpattern.behavioral.strategy.PaypalStrategy;
import designpattern.behavioral.strategy.ShoppingCart;
import designpattern.behavioral.templatemethod.CSVDataParser;
import designpattern.behavioral.templatemethod.DBDataParser;
import designpattern.behavioral.visitor.Garden;
import designpattern.creational.abstractFactory.GameGenerator;
import designpattern.creational.builder.EMailMessage;
import designpattern.creational.factoryMethod.AmericanRestaurant;
import designpattern.creational.factoryMethod.ItalianRestaurant;
import designpattern.creational.factoryMethod.Restaurant;
import designpattern.creational.multiton.Multiton;
import designpattern.creational.prototype.Shape;
import designpattern.creational.prototype.Store;
import designpattern.creational.singleton.Singleton;
import designpattern.other.mvc.AnotherView;
import designpattern.other.mvc.Model;
import designpattern.other.mvc.View;
import designpattern.other.mvp.MVPExample;
import designpattern.structural.adapter.IShape;
import designpattern.structural.adapter.Line;
import designpattern.structural.adapter.Rectangle;
import designpattern.structural.bridge.Production;
import designpattern.structural.composite.Consumer;
import designpattern.structural.container.ContainerExample;
import designpattern.structural.decorator.AbstractCharacter;
import designpattern.structural.facade.TravelCenter;
import designpattern.structural.flyweight.LineFactory;
import designpattern.structural.proxy.Party;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Excecutes design pattern examples.
 * @author Christian Kusan
 */
public class DesignPattern {

    /**
     * Starts the main application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Execute pattern example (input pattern name) or exit (empty line): ");
        
        String line;
        Scanner scan = new Scanner(System.in);
        
        // read console input
        while(!"".equals((line = scan.nextLine())))
            show(line);
        
    }
    
    /**
     * Prints the section title in command line.
     * @param title the title
     */
    private static void format(String title){
        System.out.println("\n---------------------");
        System.out.println(title+"\n");
    }
 
    /**
     * Shows a pattern example.
     * @param pattern the pattern 
     */
    private static void show(String pattern){
        
        switch(pattern){
            case "Abstract Factory": creationalAbstractFactory();
                break;
            case "Adapter": structuralAdapter();
                break;
            case "Bridge": structuralBridge();
                break;
            case "Builder": creationalBuilder();
                break;
            case "Chain of responsibility": behavioralChainOfResponsibility();
                break;
            case "Command": behavioralCommand();
                break;
            case "Composite": structuralComposite();
                break;
            case "Container": structuralContainer();
                break;
            case "Decorator": structuralDecorator();
                break;
            case "Facade": structuralFacade();
                break;
            case "Factory method": creationalFactoryMethod();
                break;
            case "Flyweight": structuralFlyweight();
                break;
            case "Interpreter": behavioralInterpreter();
                break;
            case "Iterator": behavioralIterator();
                break;
            case "Mediator": behavioralMediator();
                break;
            case "Memento": behaviorMemento();
                break;
            case "Multiton": creationalMultiton();
                break;
            case "MVC": otherMVC();
                break;
            case "MVP": otherMVP();
                break;
            case "Null Object": behavioralNullObject();
                break;
            case "Observer": behavioralObserver();
                break;
            case "Prototype": creationalPrototype();
                break;
            case "Proxy": structuralProxy();
                break;
            case "Singleton": creationalSingleton();
                break;
            case "State": behavioralState();
                break;
            case "Strategy": behavioralStrategy();
                break;
            case "Template method": behavioralTemplateMethod();
                break;
            case "Visitor": behavioralVisitor();
                break;
            default: System.out.println("Unknown.");
        }
        
        System.out.println("");
    }
    
    
    // behavioral
    
    /**
     * Shows a chain of responsibility example.
     */
    private static void behavioralChainOfResponsibility(){
        
        // file list
        ArrayList<String> files = new ArrayList<>();
        files.add("a.json");
        files.add("b.txt");
        files.add("c.csv"); // unknown
        files.add("d.xml");
        
        // init chain
        Parser xmlParser = new XMLParser(); // last in the chain
        Parser jsonParser = new JSONParser(xmlParser);
        Parser textParser = new TextParser(jsonParser);
    
        files.stream().forEach((file) -> {
            textParser.parse(file);
        });
    }
    
    /**
     * Shows a command example.
     */
    private static void behavioralCommand(){
        
        format("Command");
        Night night = new Night();
    }
    
    /**
     * Shows an interpreter example.
     */
    private static void behavioralInterpreter(){
    
        format("Interpreter");
        InterpreterExample interpreterExample = new InterpreterExample();
    }
    
    /**
     * Shows an iterator example.
     */
    private static void behavioralIterator(){
    
        format("Iterator");
        
        // init stack
        Stack<Integer> stack = new Stack<>(4);
        
        for(int i = 0; stack.size() > i; ++i) 
            stack.push(i);
        
        // print out (for)
        System.out.println("Print out with iteration loop:");
        for(Iterator it = stack.iterator(); it.hasNext();) 
            System.out.println(((Integer)it.next()).toString());
        
        // print out (foreach)
        System.out.println("\nPrint out with foreach:");
        for(Object o : stack) 
            System.out.println(o.toString());
        
        // print out in reverse order
        System.out.println("");
        StackIterator<Integer> it = (StackIterator)stack.iterator();
        it.reverse();
        System.out.println("");
    }
    
    /**
     * Shows a mediator example.
     */
    private static void behavioralMediator(){
        
        format("Mediator");
        
        IChat chat = new Chat();
        
        AbstractUser bart = new User(chat, "Bart");
        AbstractUser lisa = new User(chat, "Lisa");

        chat.addUser(bart);
        chat.addUser(lisa);
		
	bart.send("Ay Caramba!");
    }
    
    /**
     * Shows a memento example.
     */
    private static void behaviorMemento(){
        
        format("Memento");
        
        Originator<String> originator = new Originator<>();
        CareTaker<String> careTaker = new CareTaker<>();
      
        originator.setState("State 0");
        originator.setState("State 1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State 2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State 3");

        for(int i = 0; 2 > i; ++i){
            originator.getStateFromMemento(careTaker.get(i));
            System.out.println("current: " + originator.getState());
        }
    }
    
    /**
     * Shows a null object example.
     */
    private static void behavioralNullObject(){
        
        format("Null Object");
        NullObjectExample noe = new NullObjectExample();
    }
    
    /**
     * Shows an observer example.
     */
    private static void behavioralObserver(){
        
        format("Observer");
        ChildsRoom scene = new ChildsRoom();
    }
    
    /**
     * Shows a state example.
     */
    private static void behavioralState(){
        
        format("State");
        Calculation calc = new Calculation();
    }
   
    /**
     * Shows a strategy example.
     */
    private static void behavioralStrategy(){
        
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("mustermann@example.com", "12345"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Kurt Mueller", "1234567890123456", "786", "12/15"));
    }
    
    /**
     * Shows a template method example.
     */
    private static void behavioralTemplateMethod(){
        
        format("Template method");
        
        CSVDataParser csvDataParser = new CSVDataParser();
        csvDataParser.parse();
        
        DBDataParser dbDataParser = new DBDataParser();
        dbDataParser.parse();
    }
    
    /**
     * Shows a visitor example.
     */
    private static void behavioralVisitor(){
        
        format("Visitor");
        Garden garden = new Garden();
    }
    
    
    // creational
    
    /**
     * Shows an example for the abstract factory.
     */
    private static void creationalAbstractFactory(){
        
        format("Abstract Factory");
        GameGenerator gg = new GameGenerator();
    }
    
    /**
     * Shows an example for the builder.
     */
    private static void creationalBuilder(){
        format("Builder");
        EMailMessage.from("test@gmail.com")
                .to("test2@gmail.com")
                .subject("Hello World")
                .content("Hello World!")
                .mimeType("text/html") // optional
                .build();
    }

    /**
     * Shows an example for the factory method.
     */
    private static void creationalFactoryMethod(){
    
        format("Factory method example:");
        
        Restaurant americanRestaurant = new AmericanRestaurant();
        americanRestaurant.serveUp();
        
        Restaurant italianRestaurant = new ItalianRestaurant();
        italianRestaurant.serveUp();
    }

    /**
     * Executes a multiton example.
     */
    private static void creationalMultiton(){
        format("Multiton");
        Multiton multiton = Multiton.getInstance("new");
    }
    
    /**
     * Shows a prototype example.
     */
    private static void creationalPrototype(){
        
        format("Prototype");
        
        Store.init();
      
        Shape clon1 = (Shape) Store.getShape("1");
        Shape clon2 = (Shape) Store.getShape("2");
      
        System.out.println("Shape : " + clon1.getType());		
        System.out.println("Shape : " + clon2.getType());		
    }
    
    /**
     * Executes a singleton example.
     */
    private static void creationalSingleton(){
        format("Singleton");
        Singleton singleton = Singleton.getInstance();
    }

    
    // structural
    
    /**
     * Shows an adapter example.
     */
    private static void structuralAdapter(){
        
        format("Adapter");
        
        IShape[] shapes = { new Line(), new Rectangle(), new Line() };
        
        for(int i = 0; shapes.length > i; ++i)
            shapes[i].draw(10, 12, 25, 30);
    }
    
    /**
     * Shows a bridge example.
     */
    private static void structuralBridge(){
    
        format("Bridge");
        Production production = new Production();
    }
    
    /**
     * Shows a composite example.
     */
    private static void structuralComposite(){
        format("Composite");
        Consumer consumer = new Consumer();
    }
    
    /**
     * Shows a container example.
     */
    private static void structuralContainer(){
        format("Container");
        ContainerExample cex = new ContainerExample();
    }
    
    /**
     * Shows a decorator example.
     */
    private static void structuralDecorator(){
        
        format("Decorator");
        
        AbstractCharacter emily = new 
                designpattern.structural.decorator.Weapon(new 
                designpattern.structural.decorator.Mount(new 
                designpattern.structural.decorator.Amazon()));
        System.out.println(emily.description());
    }
    
    /**
     * Shows a facade example.
     */
    private static void structuralFacade(){
        format("Facade");
        TravelCenter tc = new TravelCenter();
    }
    
    /**
     * Shows a flyweight example.
     */
    private static void structuralFlyweight(){
        
        format("Flyweight");
        LineFactory factory = new LineFactory();
        designpattern.structural.flyweight.Line ln1 = factory.getLine(Color.yellow);
        designpattern.structural.flyweight.Line ln2 = factory.getLine(Color.yellow);
        
        ln1.draw(new Point(100, 100), new Point(100, 200));
    }
    
    /**
     * Shows a proxy example.
     */
    private static void structuralProxy(){
        format("Proxy");
        Party p = new Party();
    }
    
    
    // other
    
    /**
     * Show a simple model-view-controller example.
     */
    private static void otherMVC(){
        
        format("MVC");
        Model model = new Model();
        View view = new View(model);
        AnotherView anotherView = new AnotherView(model);
    }
    
    /**
     * Shows a simple model-view-presenter example.
     */
    private static void otherMVP(){
        
        format("MVP");
        MVPExample mvp = new MVPExample();
    }
}