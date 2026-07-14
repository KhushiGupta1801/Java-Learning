
public class StaticNested {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Outer out = new Outer(); // this is needed to pass the  non static var  to inner class
      out.name = "khushi";
      out.x = 12;
      out.y = 6;
      
      // here input as out for ctor
      Outer.Inner in = new Outer.Inner(out); // since the inner class is static it does not need an object of outer class
      
      in.fun(out); // here input as out for method
      
    }
}

// Static nested class
class Outer {
  static int x;  
  int y;
  String name;

  static class Inner { 
    
    Outer a;
    Inner(Outer a) {
      this.a = a;// saves the copy of outer obj reference inside inner class instance so other methods can use it later.
      System.out.println(a.name);
    }
    
                  
    void fun(Outer m) {
      System.out.println("fun method"+" , x = "+ x +" , y = "+m.y);
    }
  }   // to print y non static var in static class we pass it into static inner class and access it through the outerClassObjectVariable


}