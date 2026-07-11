// class --->  complete blueprint of an Object
// interface --->  incomplete blueprint of behaviour(since it does not tell how the method operates)

//The Intent Contract: It explicitly defines what an object can do,
// completely omitting the implementation detail of how it executes that action.

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Carable c = new FuelCar();
      c.start();
      c.accelerate();
      c.brake();
      
      // Dynamically swapping the underlying concrete instance(Dynamic Polymorphism).
      c = new ElectricCar();
      c.start();
      c.accelerate();
      c.brake();

      System.out.println(Carable.pi);  // Directly accessing constants without instantiating objects
      
      D d = new D();
      d.fun();
    
      O o = new O();
      o.wins();



    } 
}

interface Carable {
  // Any variable inside an interface is treated as public static final by the JVM. 
  // They have to be static because interfaces cannot be instantiated to produce object states
  double pi = 3.14;  
  void start();
  void accelerate();
  void brake();
}
interface Vehicle extends Carable {
  void start();

}
interface Machine extends Carable {
  void start();
}

class FuelCar implements Carable {
  @Override                        //When implementing the contract,you must explicitly declare the overriding methods as public.
  public void start() {               
    System.out.println("f started");

  }
  public void accelerate() {
    System.out.println("f accelerated");

  }
  public void brake() {
    System.out.println("f stopeed");

  }

}
// if a class inherits one or more interfaces, that class must have all the methods declared in the interfaces.
class ElectricCar implements Vehicle,Machine {
  @Override
  public void start() {
    System.out.println("e started");

  }
  public void accelerate() {
    System.out.println("e accelerated");

  }
  public void brake() {
    System.out.println("e stopeed");

  }
}



//Use of super keyword inside a class: when two different interfaces provide a default method with the exact same name, and Java doesn't know which one you want to use.
// DIAMOND NAMING conflict solution
interface A {
  void fun();
}

interface B extends A {
  default void fun() {
    System.out.println("B");
  }
}

interface C extends A {
  default void fun() {
    System.out.println("C");
  }
}

class D implements B,C {
  @Override
  public void fun() {
    System.out.println("Default implementation");
    // "Go up to Interface B and run its default fun method"
    B.super.fun();
  }
}

//-----------------------------------------------------------------------------

class M {
  public void wins() { System.out.println("class M wins");}
}
interface N {
   default void wins() { System.out.println("interface N wins");}
}// to define mehod in an interface we need default keyword 


class O extends M implements N {

}

//A functional interface is a specialized design pattern containing exactly one single abstract method .
//It acts as a gateway to transition Java from strict object-oriented logic into Functional Programming and optimized Lambda Expressions. 
interface FunctionalDemo { // examples: Comparable ,Runnable,Predicate
    void fun(); 
}
//A marker interface contains absolutely zero method parameters or declarations.
//It acts as a  metadata tag.
interface MarkerDemo {} // examples: Cloneable, Serializable, RandomAccess