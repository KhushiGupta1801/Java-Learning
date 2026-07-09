// Using "this" keyword in java

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Student s = new Student("Krishna");
      s.print();

      Student a = new Student("khushi",17);
      a.print();
      Student a2 = new Student("krishna",26);
      a2.print();

      Friend fd = new Friend();
      fd.activate();

      Edit ed = new Edit();
      ed.EF();
      
      Build b = new Build();
      b.size = 20;
      b.display();
    }
}

class Student {
  String name;
  int age;
  int dob;

  Student(){

  }

  Student(String name) {              //1--> SOLVES SHADOWING
    this.name = name;                // this.name is the class variable
  } 

  Student(String name, int age){     //2--> CONSTRUCTOR CHAINING
    this(name,age,2009);            // <--- calls the below ctor automatically
  }
  Student(String name, int age, int dob) {
    this.name= name;
    this.age = age;
    this.dob = dob;
  }


  void method() {                //3-->CALLING METHODS IN SAME CLASS
    System.out.println("This is the method...");
  }
  void print() {
    this.method();
    System.out.println(name+","+age+","+dob);
  }


  void print(Friend f) {  // this method receives a Friend object inside ()
    System.out.println("This is print with parameter method"+f);
    // f holds the memory address of the Friend.
    // printing f will show the raw address(Friend@4f5656b89)
  }

  
}



class Friend {                 //4--> PASSING CURRENT OBJ AS AN ARG IN A METHOD
  void activate() {
    // creates a new student object in memory
    Student st = new Student();
    st.print(this);  //'this' simply means: "Send MY current memory address to the driver."
                    // this holds Friend current address
                    // we pass that Friend address into the Student's print method
  }
}
// Note:this always points to whatever class it is currently typed inside of.


//-------------------------------------------------------------------------------------

class Edit {                //5--> PASSING CURRENT OBJ AS AN ARG IN A CTOR
  File handler;
  Edit() {
    this.handler = new File(this);  //new File(this)--> creates the object
                                 // this.handler--> assigns the new object into empty slot(handler) 
                                  // here handler and this.handler are the same thing
  }
  void EF() {
    System.out.println("Edit address is "+ handler);
  }
}


class File {
  Edit window;
  File( Edit window) {
    this.window = window;
  }
} 

// ----------------------------------------------------------------------------------

class Build {              //6--> METHOD CHAINING
  int size;
  Build setSize(int size) {
    this.size = size;
    return this;
  }
  void display() {
    System.out.println("The size is "+ size);
  }
}
