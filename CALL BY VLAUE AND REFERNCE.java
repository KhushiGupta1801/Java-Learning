//                    CALL BY VALUE
public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        
        add10(x, y);        // here we are explicitly storing the return                       values  in a variable if we want to update x and y
        System.out.println(x + " " + y); // Prints: 4 5
    }

    public static int add10(int x, int y) {
        x = x + 10;
        y = y + 10;
        return x;
    }
}
// in this case we print out/share the exact copies of x and y values and here the method updates the duplicate values of x and y not the original x and y





//          CALL BY REFERENCE
class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        
        add10(r1);
        System.out.println(r1.x + " " + r1.y); // Prints: 14 15
    }

    public static void add10(Random r) {     // R1 AND R STORES THE SAME ADDRESS
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}
// in this case we made a duplicate key/shared the exact address of x and y values so here the method accesses the values and updates them.
