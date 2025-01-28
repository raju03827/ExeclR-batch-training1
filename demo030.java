package core_java;
import java.util.*;

// Class that contains the ArrayList and related method
class ArrayListCode {
    void arrayListMethod() {
        // Create an ArrayList of Integer type
        ArrayList<Integer> araylist1 = new ArrayList<>();    

        // Adding elements to the ArrayList
        araylist1.add(100);
        araylist1.add(200);
        araylist1.add(100);
        araylist1.add(0);
        araylist1.add(900);
        araylist1.add(600);

        // Print elements of the list using Iterator
        System.out.println("Elements of the list: ");
        Iterator<Integer> iterate = araylist1.iterator();
        
        // Iterate through the list and print each element
        while (iterate.hasNext()) { 
            System.out.println(iterate.next()); 
        }
    }
}

// Main class to run the program
public class demo030 {
    public static void main(String[] args) {
        // Create an object of ArrayListCode and call arrayListMethod
        ArrayListCode obj = new ArrayListCode();
        obj.arrayListMethod();
    }
}