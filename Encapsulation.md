### ***ENCAPSULATION***







class bank {

&#x20;   private double balance;  // Fully protected state variable

&#x20;   public void deposit(int amount) {  // Public method to safely handle deposits

&#x20;       balance += amount;

&#x20;   }

&#x20;   public void withdraw(int amount) {//Public method to safely handle withdrawals

&#x20;       balance -= amount;

&#x20;   }

&#x20;   

&#x20;   // getters and setters 

&#x20;   public double getBalance() { 

&#x20;       return balance;  

&#x20;   }

&#x20;   // Getter Method: Allows the world to view data without modifying it directly

}

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       System.out.println("Start small. Ship something.");

&#x20;       bank b = new bank();

&#x20;       

&#x20;       b.deposit(1000); // Adding funds

&#x20;       System.out.println(b.getBalance());

&#x20;       b.withdraw(200); // Removing funds

&#x20;       System.out.println(b.getBalance());

&#x20;       

&#x20;       

&#x20;       Student a = new Student("khushi",15,17,"abc");

&#x20;       System.out.println(a.getname());

&#x20;   }

}



class Student {

&#x20;   private String name;

&#x20;   private int rollNumber;

&#x20;   private int age;

&#x20;   private String college;

&#x20;   

&#x20;   Student(String name, int rollNumber, int age, String college) {

&#x20;       this.name = name;

&#x20;       this.age = age;

&#x20;       this.rollNumber = rollNumber;

&#x20;       this.college = college;

&#x20;   }

&#x20;   

&#x20;   //getters and setters 

&#x20;   public String getname() {

&#x20;       return name;

&#x20;   }

&#x20;   

&#x20;   public void setname( String name) {

&#x20;       this.name = name;

&#x20;   }

}

&#x20;   

&#x20;   

