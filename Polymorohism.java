import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      IDE ide = new IDE();
      ide.print("hi");
      ide.print(2,4);
      IDE soft = new Software();
      soft.print("hey yo");
    }
}

class IDE {
  String ui;
  int engine;
  int analyzer;
  public void print(String ui) {
    this.ui = ui;
    System.out.println(this.ui);
  }
  public void print(int engine) { // method overloading
    this.engine = engine;
    System.out.println(this.engine);
  }
  public void print(int engine, int analyzer) {
    this.engine = engine;
    this.analyzer = analyzer;
    System.out.println(this.engine + this.analyzer);
  }
}

class Software extends IDE {
  @Override
   public void print(String ui) {  // method overriding
    System.out.println("Software Override");
  }
}