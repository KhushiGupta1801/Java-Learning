// Enumerations
public class Main {
    public static void main(String[] args) {
      

      //The variable(pay) can only hold references to the
      // explicit fields(SUCCESS,PENDING,FAILED) configured inside the declared Enum
      Payment pay = Payment.SUCCESS;
      Payment pay2 = Payment.CASH;     
      Payment pay3 = Payment.PENDING;

      // Payment pay = 10;--->error(type mismatch)
      System.out.println(pay.name());
      System.out.println(pay2.getAmount()); //--> prints 100000
      pay3.move();
      


    }
}

enum Payment {
  // SUCCESS,FAILED,PENDING, CASH(100000);   or 
  SUCCESS,
  FAILED,
  PENDING {
    @Override 
    public void move() {
      System.out.println("Move down(Y+1)");
    }
  },
  CASH(100000);

  private int amount;
  public void move() {} // if we add abstract here than all the 4 enum values above have to override move()
// public abstract void move();



  Payment(int amount) {   //If you define a constructor that requires a parameter,
    this.amount = amount;  //all constants in that enum must match it. 
  }                        // (if there is only one ctor then)

  Payment() {               // this is for those ctors with no bracket values.
    // java secretly adds   this.amount = 0;
  }

  public int getAmount() { // getter functions are not stored with object
    return this.amount;
  }
}

/* What the compilers generate internally

public final class Payment extends Enum<Payment> {
  // Each constant item is transformed into a public static final object instance
  public static final Payment SUCCESS = new Payment();
  public static final Payment FAILED = new Payment();
  public static final Payment PENDING Pending = new Payment() {
    @Override
    public void move()
  };
  public static final Payment CASH = new Payment();

  private int amount;
  public void move() {}

  // A mandatory private constructor prevents external sources from building instances.
  private Payment(int amount) {
    this.amount = amount;
  }
   privare Payment() {}

  public int getAmount() {
    return this.amount;
  }
}
*/
