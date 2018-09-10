
package collectioninterfacetask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionInterfaceTask {

// 2 objects of concrete classes
    public static ArrayList testArrayList = new ArrayList();
    public static LinkedList testLinkedList = new LinkedList();
    
    public static void main(String[] args) {
        
    // add elements to objects
        testArrayList.add(3.14);
        testArrayList.add(2.72);
        testArrayList.add(1.13);
        
        testLinkedList.add(3.14);
        testLinkedList.add(2.72);
        testLinkedList.add(1.13);
        
    // display number of elements
        System.out.println(testArrayList.size());
        System.out.println(testLinkedList.size());
        
    // display collection elements
        System.out.println(testArrayList);
        System.out.println(testLinkedList);
    
    // check if collection contains element '3.14'
    // ArrayList
        if (testArrayList.contains(3.14))  {
            testArrayList.remove(3.14);
            System.out.println("\nArrayList contained 3.14, and it has been removed.");
        
        // display new ArrayList
            System.out.println("New ArrayList:\n" + testArrayList);
        }
        else {
            System.out.println("ArrayList does not contain 3.14.");
        }
        
        // LinkedList
        if (testLinkedList.contains(3.14))  {
            testLinkedList.remove(3.14);
            System.out.println("\nLinkedList contained 3.14, and it has been removed.");
            
        // display new LinkedList
            System.out.println("New LinkedList:\n" + testLinkedList);
        }
        else {
            System.out.println("LinkedList does not contain 3.14.");
        }
    }
}


// methods used: add, size, contains, remove.