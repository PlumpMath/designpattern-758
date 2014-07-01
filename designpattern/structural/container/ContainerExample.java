package designpattern.structural.container;

import java.util.Iterator;

/**
 * Shows the practical use of the container pattern.
 * @author Christian Kusan
 */
public class ContainerExample {

    public ContainerExample(){
        
        String[] content = { "zero", "one", "two", "three", "four" };
        Container<Integer> intContainer = new Container<>();
        Container<String> strContainer = new Container<>();
        
        for(int i = 0; content.length > i; ++i){
            intContainer.add(i);
            strContainer.add(content[i]);
        }
        
        Iterator<Integer> intIter = intContainer.iterator();
        while(intIter.hasNext())
            System.out.println("Integer Container: " + intIter.next());
        
        Iterator<String> strIter = strContainer.iterator();
        while(strIter.hasNext())
            System.out.println("String Container: " + strIter.next());

        // container container
        Container<Container<Integer>> contContainer = new Container<>();
        contContainer.add(intContainer);        
        Iterator<Container<Integer>> contIter = contContainer.iterator();
        
        while(contIter.hasNext()){
            Container<Integer> innerContainer = contIter.next();
            Iterator<Integer> innerContIter = innerContainer.iterator();
            
            while(innerContIter.hasNext())
                System.out.println("Integer of inner container: " + innerContIter.next());
        }
    }
}