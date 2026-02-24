import java.util.ArrayList;

public class Main {

   public static void main(String []args) {

      // 4.7 WRAPPER CLASSES wrap primitives into objects 
      // why? some methods NEED objects!
      Integer fancyInt = new Integer(15);
      Double fancyDoub = new Double(6.00);
      // calling the constructor is no longer necessary!
      // can just declare them like you would primitives:
      Integer fancierInt = 15; 
      System.out.println(fancierInt);
      // AUTOBOXING:  Java converts int to Integer 
      int regularInt = fancierInt; // UNBOXING

      // Another benefit of Wrappers: you can use some methods
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MIN_VALUE);
      String stringgyNums = "6.0";
      double parsedD = Double.parseDouble(stringgyNums);
      System.out.println(parsedD);
      String stringgyNums2 = "2";
      int parsedI = Integer.parseInt(stringgyNums2);
      System.out.println(parsedI);

      // 4.8 ARRAYLIST
      /* ArrayList is a RE-SIZABLE  collection
      You can ADD or REMOVE items from the lists!
      ArrayList is MUTABLE (can change during run)  
      */

      // ArrayList<Type> name = new ArrayList<Type>();

      ArrayList<String> toDo = new ArrayList<String>();
      // For number, must use WRAPPER classes (not primitives!)
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doublList = new ArrayList<Double>();

      // ARRAYLIST METHODS (assume "list" is an ArrayList)

      // list.size() returns an int
      // counts the number of items in the list
      int numTasks = toDo.size();
      System.out.println("Number of items on TO DO list: " + numTasks);

      // list.add( obj ) appends the obj to end of list 
      // returns a boolean, but that's not important 
      toDo.add( "Do hw today");
      toDo.add( "Submit the Brwon summer program application");
      toDo.add( "have tutring today");
      // check size after adding stuff
      System.out.println("Number of items after adding: " + toDo.size() );
      System.out.println( toDo ); // ArrayList has a nice toString method!!!

      // list.add( index, obj ) inserts the obj 
      // AT a specific INDEX! (position)
      toDo.add(1, "Eat food");
      System.out.println( toDo );
      // REMEMBER that indexes start at 0
      // so 1 means we added to the SECOND spot
      

   }

}