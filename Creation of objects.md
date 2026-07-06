### ***Creation of objects***









***//This code explains default and parameterized constructor,constructor overloading and using -this- keyword for constructor  chaining .***

&#x20;



***class Main {***

&#x20;   ***public static void main(String\[] args) {***

&#x20;       ***System.out.println("Start small. Ship something.");***

&#x20;

&#x20;       ***Student a = new Student();***

&#x20;       ***System.out.println(" default ");***

&#x20;       ***System.out.println(a.name);***

&#x20;

&#x20;       ***Student b = new Student("khunni");***

&#x20;       ***b.print();***

&#x20;

&#x20;       ***Student c = new Student("krishna",26 );***

&#x20;       ***c.print();***

&#x20;

&#x20;       ***Student d = new Student("cash",1,2027);***

&#x20;       ***d.print();***

&#x20;

&#x20;       ***Student e = new Student("e",19,2026,"Haryana");***

&#x20;       ***d.print();***

&#x20;   ***}***

***}***



***class Student {***

&#x20;   ***String name;***

&#x20;   ***int age;***

&#x20;   ***int dob;***

&#x20;   ***String state;***

&#x20;

&#x20;   ***Student() {          // default constructor***

&#x20;       ***name = "khushi";***

&#x20;       ***age = 17;***

&#x20;       ***System.out.println(" In a constructor");***

&#x20;

&#x20;   ***}***

&#x20;   ***Student(String n) {      // parameterized constructor***

&#x20;       ***name = n;***

&#x20;       ***System.out.println(" In b constructor");***

&#x20;   ***}***

&#x20;   ***Student(String n, int a) {     // --Constructor Chaining--***

&#x20;                                  ***//  0 is the default values for integer.***

&#x20;       ***this(n,a,0);            // this c constructor is calling***

&#x20;       ***System.out.println(" In c constructor");      //     d(last constructor).***

&#x20;   ***}***

&#x20;

&#x20;   ***Student(String name,int age, int dob) {    // here since both name variables are same we are using -this- keyword***

&#x20;       ***this(name,age,dob,"unknown");***

&#x20;

&#x20;       ***System.out.println(" In d constructor");***

&#x20;

&#x20;   ***}***

&#x20;   ***Student(String name,int age, int dob, String state) {***

&#x20;       ***//this(name,age,dob,state);***

&#x20;       ***this.name = name;***

&#x20;       ***this.age = age;***

&#x20;       ***this.dob = dob;***

&#x20;       ***this.state = state;***

&#x20;       ***System.out.println(" In e constructor");***

&#x20;   ***}***

&#x20;

&#x20;   ***// since there are two constructors with same name this is called overloading***

&#x20;

&#x20;   ***void mark() {***

&#x20;       ***System.out.println(name+" is present.");***

&#x20;   ***}***

&#x20;

&#x20;   ***void print() {***

&#x20;       ***System.out.println(name+","+age+","+dob);***

&#x20;   ***}***

***}***

***// another thing to keep in mind is that there should be                         no statement before  -this- keyword.***





















// this file must be saved as Main.java



class Main {// outer box



&#x20;   static class Car {  // THE BLUEPRINT (class):defines what a car is

&#x20;       String model;

&#x20;       int year;

&#x20;

&#x20;       //The Constructor: fills in the blueprint details during creation

&#x20;       //This guarantees the car is never blank or broken

&#x20;       public  Car(String model, int year) {

&#x20;       System.out.println("Start small. Ship something.");

&#x20;

&#x20;       //model is the temprorary  "ford", we just passed in

&#x20;       //this.model means " the permanent variable belonging to this specific car object we are building now"

&#x20;       this.model= model;

&#x20;       this.year = year;

&#x20;       }

&#x20;

&#x20;       //The blueprint is now responsible for displaying its own data

&#x20;       public void display() {

&#x20;           System.out.println("Success ! created a "+this.model + " from the year"+this.year);

&#x20;       }

&#x20;   }

&#x20;

&#x20;

&#x20;

&#x20;   // when we click on run the jvm starts from here

&#x20;   //IGNITION SWITCH : (main method) here the execution starts

&#x20;   public static void main(String\[] args) { // ignition switch

&#x20;                                           // all actions must happen inside here

&#x20;

&#x20;

&#x20;

&#x20;       //the jvm then comes at this line and splits it into three actions moving

&#x20;       //from right to left

&#x20;       // new:is the builder(" Hey!! i need  space")(in heap memory)

&#x20;       //car("ford",2024): jvm jumps to car constructor and passes the ford and 2024 into the constructor(filling that blank memory with actual data)

&#x20;       //Car c1 or c2 : jvm creates a variable named c(on the stack) this variable holds the memory address

&#x20;

&#x20;

&#x20;       //OBJECT : built inside the main method using the blueprint

&#x20;       Car c1 = new Car("ford",2024);

&#x20;       Car c2 = new Car("lamborgini",2026);

&#x20;

&#x20;       // action that the objects need to perform

&#x20;      c1.display();

&#x20;      c2.display();

&#x20;   }

}













#### ***Copy constructor***



**public class Main{**

&#x20;   **public static void main(String\[] args) {**

&#x20;       **//4. create the original student object**

&#x20;       **Student A = new Student(26,1999,"krishna");**

&#x20;

&#x20;       **//pass object a into object b using the copy constructor**

&#x20;       **Student B = new Student(A);**

&#x20;

&#x20;       **//print the copied info**

&#x20;       **B.printinfo();**

&#x20;   **}**

&#x20;

**}**



**class Student{**

&#x20;   **int age;**

&#x20;   **int id;**

&#x20;   **String name;**

&#x20;

&#x20;   **//1. parameterized constructor(needed for student a )**

&#x20;   **Student(int age, int id, String name) {**

&#x20;       **this.age = age;**

&#x20;       **this.id = id;**

&#x20;       **this.name = name;**

&#x20;   **}**

&#x20;

&#x20;   **//2. copy constructor (to copy a to b)**

&#x20;   **Student(Student B) {**

&#x20;       **this.name = B.name;**

&#x20;       **this.age = B.age;**

&#x20;       **this.id = B.id;**

&#x20;   **}**

&#x20;

&#x20;

&#x20;   **public void printinfo() {**

&#x20;       **System.out.println(this.name);**

&#x20;       **System.out.println(this.age);**

&#x20;       **System.out.println(this.id);**

&#x20;   **}**

&#x20;

&#x20;

&#x20;   **//3.default constructor**

&#x20;   **Student() {**

&#x20;

&#x20;   **}**

**}**

