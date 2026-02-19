public class Main {

   public static void main(String []args) {

      // 4.7 WRAPPER CLASSES wrap primitives into objects 
      // why? some methods NEED objects!
      Integer fancyInt = new Integer(2);
      Double fancyDoub = new Double(6.00);
      // calling the constructor is no longer necessary!
      // can just declare them like you would primitives:
      Integer fancierInt = 13; 
      System.out.println(fancierInt);
      // AUTOBOXING:  Java converts int to Integer 
      int regularInt = fancierInt; // UNBOXING

      // Another benefit of Wrappers: you can use some methods
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MIN_VALUE);
      String stringgyNums = "2.0";
      double parsedD = Double.parsedDouble(stringgyNums);
      System.out.println(parsedD);
      String stringgyNums2 = "2";
      int parsedI = Integer.parsedInt(stringgyNums2);
      System.out.println(parsedI);





   }
}
