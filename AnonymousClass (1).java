import java.util.*;

// anonyomous class ----> Lambda

public class Anonoymous {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      /*
      Person p1 = new Person();
      p1.introduce();
      child c1 = new child();
      c1.introduce();
      */

      Person p2 = new Person() {   // anonoyomous class

        String name = "khushi";

        @Override
        void introduce() {
          greet(); //  we can only call greet method like this.
          System.out.println("this is anonymous class.");
        }

        void greet() {
          System.out.println("hi i am "+ name);
        }
      };

      p2.introduce();
     // p2.greet();since this method is not present in Person class we cannot call this individually.

    }
}

class Person {
  void introduce() {
    System.out.println("hi this is a Person.");
  }
}

/*
class child extends Person {
  @Override
  void introduce() {
    System.out.println("this is one time Person.");
  }
}
*/