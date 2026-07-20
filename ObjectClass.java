import java.util.Objects; // needed to access hash() method from Object Class
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {// warning tag added because of clone method
     
      Student s = new Student();
      s.name = "Krishna";
      s.age = 26;
      System.out.println(s.toString()); // prints Student@123db45a6--> className@hashcode
      System.out.println(s); // same as above
      System.out.println(s.name);
    
      Person p = new Person();
      p.habit = "Sleeping";
      p.age = 40;
      System.out.println(p.toString());
      System.out.println(p); // same as above
      System.out.println(p.habit);



      Person2 p2 = new Person2("Eating",22);
      Person2 p3 = new Person2(new String("Eating"),22);
      System.out.println(p2.equals(p3));// p2 calls the method, so p2 becomes 'this'
                                        // p3 is passed in, so p3 becomes 'per'



      System.out.println(p2.hashCode() == p3.hashCode());
      // The default rule creates a hash code based purely on the object's memory address
      // if  we didnt override hashCode method



      System.out.println(p2.getClass().getName()); //provides the exact name of the instantiated class

      Mamals mal = new Mamals();
      Dog dog = new Dog();
      // instanceof --> checks if a object(mal or dog) is the instance of a class(Object) or a subclass(Mamals and Dog) 
      System.out.println(mal instanceof Object);// true
      System.out.println(dog instanceof Mamals);// true
      System.out.println(mal instanceof Dog); // false

      System.out.println(dog.getClass().getName());//  Priints Dog not Mamalsor Object




      // original object copy(has generic mask due to Object returntype)
      Copy copy = new Copy("Street smart", 1000);
      // type casting to remove mask
      //During typecasting, s1.clone() is passed into s2 as a Student object, not an Object object
      //Call clone() and typecast the result.
      Copy c2 = (Copy) copy.clone();
      System.out.println(c2.quality+","+c2.amount);



    }
}

class Student { // secretly extends Object
  String name;
  int age;
  int earn;

}

class Person {
  String habit;
  int age;

  @Override  
  public String toString() { // same method is present in Object class hence Override
    return (habit+","+age);
  }

  
}
//--------------------------------------------------------------------------------

class Person2 {
  String habit;
  int age;

  Person2(String habit,int age) {
    this.habit = habit;
    this.age = age;
  }

  @Override
  public boolean equals(Object per) {  // "If it says Object, you are only allowed to see Object features."
    if (this == per) return true; // this--> the object that called the mehtod  per--> p2
    //if they point to the exact same memory address, it returns true instantly
    // Is p2 at the exact same memory location as p3? No (one is age 21, one is age 23).


    //TypeCasting says : Trust me, I have verified this object's blueprint. Remove the blinders so we can access its true variables."
    //Step 1: Verify the Identity First
    if(per == null || getClass() != per.getClass()) return false; // getClass is the blueprint used to built the actual object(this)
    //Check if the passed object is null to prevent a NullPointerException
    //Check if both objects belong to the exact same class using getClass() to avoid a ClassCastException

   //Step 2: type casting
    Person2  typeper = (Person2) per;
  /* int       x     =  (int)     5.5; example  (int),(Person2) acts as a conversion tool
                                                per , 5.5    original restricted variable 
                                                typeper , x is the new unrestricted variable layout
  */

   // 1. Check age first! If ages don't match, exit with false immediately
    if (this.age != typeper.age) return false;
   // 2. Since ages matched, we can now safely run our habit returns.
    if(this.habit != null) {
      return this.habit.equals(typeper.habit);
    }
    else {
      return typeper.habit == null; //  (Both are null--> They match!--> Returns true).
    } 
  }


  @Override
  public int hashCode() {   // same field values ---> same hashCode
    return Objects.hash(habit,age); // Generates a unique integer based entirely on the field values
  }
}


class Mamals{}

class Dog extends Mamals {}



class Copy implements Cloneable{ 
/* imoplements Cloneable--> Because it is a high-risk operation.
Cloneable is an interface (a file type that contains no code).
A Marker Interface is an interface that is completely empty.
By marking your class with Cloneable, you are pinning a label on it that tells Java: "This class has passed safety inspections. It is allowed to use memory duplication." 
*/
  String quality;
  int amount;
  Copy(String quality,int amount) {
    this.quality = quality;
    this.amount = amount;
  }
  // Step 2: Override the native method(clone()) layout using the mandatory warning tag(CloneNotSupportedException)
  @Override
  protected Object clone()  throws CloneNotSupportedException{
    return super.clone();
    //returns a completely fresh, raw binary copy of your object, but packaged as a generic Object data type.
    //It is lightning-fast because it copies raw data bits directly instead of initializing a new object manually.
  }

}




