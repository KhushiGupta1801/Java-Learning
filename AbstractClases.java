//Abstract classes cant be instantiated.
//can have abstract and normal method.
//meant to be extended.

//can have constructors via ctor chaining whenever a child class-
//-is instantiated(new ElectriCar()) using super() keyword.

// cannot be marked final as it prevents inheritance.

// can have static methods and variables. static things are directly-
// -associated with class blueprint hence can be executed safely using 
//------>   className.staticMethodName();   OR   className.staticVariable;

// can have private and final methods but not with keyword abstract.

// can have zero abstract classes This is a strategic design choice used- 
//-purely to prevent developers from instantiating that base class directly



public class Abstract {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      //Car car = new FuelCar();
       Car car = new FuelCar("Love");
      car.start();
      car.accelerate();
      car.brake();
      car.getName();
      car.Final();
      


      Car c = new ElectricCar("hello motto");           
      c.start();
      c.accelerate();      
      c.brake();
      c.getName();
      
      // Call static method using Class name
      Car.displayTotalCount(); // prints=2   since two child classes hence 
                               //totalVehiclesCreated++ is executed twice
      // Car m = new Car(); XX abstract class cannot be instantiated
      
    }
}


abstract class Car {
  abstract void accelerate(); // Must be implemented by child classes
  String name;                // Instance variable unique to each car object
  static int totalVehiclesCreated = 0;// Static variable shared by ALL car objects (lives in central memory)

  static void displayTotalCount() {
        System.out.println("Total vehicles: " + totalVehiclesCreated);
    }

  Car(String name) {  
    this.name = name;
    totalVehiclesCreated++;  // Increments the shared count every time a car is made
  }

  final void Final() {
    System.out.println("Final methods are allowed.");
  }
  
  private void Private() { //  to print this we have to call it in another method
    System.out.println("Private methods are allowed.");
  }
  

  void start() {
    System.out.println("car started,");
    Private();
  }

  void brake() {
    System.out.println("car stopped.");
  }
  void getName() {
    System.out.println(name);
  }
}

class FuelCar extends Car {

  FuelCar(String name) {                 
    super(name);   // Constructor chaining: passes name to parent Car constructor
  }
  @Override
  void accelerate() {
    System.out.print("fuel car is accelerating-");

  }

}

class ElectricCar extends Car {

   ElectricCar(String name) {
    super(name);  // ctor chaining : calls parent car class
  }

  @Override
  void accelerate() {
    System.out.print("Electric  car is accelerating-");
  }
}
