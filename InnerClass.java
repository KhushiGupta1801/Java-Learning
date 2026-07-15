// prompt: exhaustive, ultra-detailed, long engineering breakdown of the video  capturing every
// technical nuance, compiler quirk, and low-level memory behavior taught in the lecture.

public class InnerClass {
  public static void main(String[] args) {

    Outer out = new Outer();
    Outer.Inner inout = out.new Inner();

     // Or
    //Outer.Inner in = new Outer().new  Inner();

    inout.fun();
    inout.fun2();  // old version 
    Outer.Inner.fun2();


  }

}

class Outer {

  int x = 1;            //level 1 

  class Inner {
    int x = 2;        // level 2 
    void fun() {
      int x = 3;       // level 3
      System.out.println("Outer x = "+ Outer.this.x);
      System.out.println("Inner x = " + this.x);  
      System.out.println("Inner method x = "+ x); // here level 3 overshadows 1 and 2
    }

    static void fun2() {    // static methods can be written in nested classes also
      System.out.println("hello");
    }

  }
}