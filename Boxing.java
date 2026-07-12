//DESCRIPTION: Core Java Concepts - Autoboxing, Unboxing, and Wrapper Classes

public class Boxing {
    public static void main(String[] args) {

      System.out.println("Hello, World!");
      int x = 10;
      Integer y = x;
      //Integer y = Integer.valueOf(x);-->correct but not necessary 
      
      System.out.println(x);
      System.out.println(y);//  Prints object directly by calling y.toString()
      System.out.println(y.intValue());//this is also correct

      //unboxing 
     // Integer a = new Integer(20); //depriciated API 
      Integer a = 20; //-->autoboxing
      int b = a;     // -->unboxing

      System.out.println(a);   // Prints object directly by calling y.toString()
      System.out.println(b);


      //arithematic operations
      Integer A = 10;
      Integer B =  20;
      int sum = A + B;
      // Compiles to: A.intValue() + B.intValue()


      System.out.println("sum = " +sum);
      
      Integer n = null;
     // int m = n;  RUNTIME ERROR java tries to run null.intValue(), causing a crash


      printInteger(50);
    }
    // real world examples
    public static void printInteger(Integer x)  /* Expects Object */ {System.out.println(x);} 

}
