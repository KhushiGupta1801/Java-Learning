### ***#basic maths lecture***

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;

&#x20;       System.out.println("Start small. Ship something.");

&#x20;

&#x20;       int num = 153;

&#x20;       int count = 0;

&#x20;       int sum = 0;

&#x20;       int ans = 0;

&#x20;       int factorCount = 0;

&#x20;       int a = 18;

&#x20;       int b = 12;

&#x20;       int cubeSum = 0;

&#x20;       int ognum = num;

&#x20;



&#x20;       while(num > 0) {

&#x20;           int digit = num % 10;

&#x20;           System.out.println(digit);

&#x20;           num = num / 10;

&#x20;           count++;

&#x20;           sum += digit;

&#x20;           ans \*= 10;

&#x20;           ans += digit;

&#x20;       }



&#x20;

&#x20;       num = ognum;

&#x20;       while(num > 0) {

&#x20;           int ndigit = num % 10;

&#x20;           int cube = ndigit \* ndigit \* ndigit;

&#x20;           cubeSum = cubeSum + cube;

&#x20;           num = num / 10;

&#x20;       }

&#x20;

&#x20;

// printng all prime numbers from 1 to  num

&#x20;       for(int i=1; i<= 10; i++) {

&#x20;           if(i <=1) {

&#x20;               continue;// this only leaves current value for this loop and moove sto next loop

&#x20;           }

&#x20;           boolean isPrime=true;

&#x20;           for(int j=2; j < i; j++) {

&#x20;               if(i % j == 0) {

&#x20;                   isPrime=false;

&#x20;                   break;

&#x20;               }

&#x20;           }

&#x20;           if(isPrime) {

&#x20;               System.out.println(i+ " ");

&#x20;           }

&#x20;       }

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;       System.out.println("cubesum of this number is " + cubeSum);

&#x20;

&#x20;   // code help method to count the digits of a number

&#x20;       System.out.println("The number of digits in num: " + count);

&#x20;

&#x20;   // my and code help method to calc the sum of digits of the number

&#x20;       System.out.println("The sums of digits in num: " + sum);

&#x20;

&#x20;   //codehelp method of reversing a string

&#x20;       System.out.println("The reverse of digits in num: " + ans);

&#x20;

// my method to check if number is palindrome

&#x20;       if(ognum == ans) {

&#x20;           System.out.println("The number is palindrome.");

&#x20;       } else {

&#x20;           System.out.println("The number is not palindrome");

&#x20;       }



//my methode to check if a number is prime number

&#x20;       for (int i = 1; i <= ognum; i++) {

&#x20;           if (ognum % i == 0) {

&#x20;               factorCount++;

&#x20;           }

&#x20;       }

&#x20;       if(factorCount > 2) {

&#x20;           System.out.println("This is not a prime number.");

&#x20;       } else {

&#x20;           System.out.println("This is a prime number.");

&#x20;       }











// codehelp method to find gcd(hcf) of two numbers

&#x20;       System.out.println("The gcd of " + a + " and " + b + " : " + getgcd(a, b));

// codehelp method to find lcm

&#x20;       System.out.println("The lcm of " + a + " and " + b + " : " + getlcm(a, b));









// checking if a number is armstrong or not

&#x20;       if(ognum == cubeSum) {

&#x20;           System.out.println("This is a armstrong number.");

&#x20;       } else {

&#x20;           System.out.println("This is a not armstrong number.");

&#x20;       }

&#x20;

&#x20;

&#x20;        if(factorPrime) {

&#x20;           System.out.println();

&#x20;       } else {

&#x20;           System.out.println("This is a not armstrong number.");

&#x20;       }

&#x20;

&#x20;   }













// codehelp method to find gcd(hcf) of two numbers

&#x20;   public static int getgcd(int a, int b) {

&#x20;       while(b != 0) {

&#x20;           int oldb = b;

&#x20;           b = a % b;

&#x20;           a = oldb;

&#x20;       }

&#x20;   // loop completes when b becomes 0

&#x20;       int ans = a; // this is the gcd

&#x20;       return ans;

&#x20;   }



// codehelp method to find lcm

&#x20;   public static int getlcm(int a, int b) {

&#x20;       int product = a \* b;

&#x20;       int gcd = getgcd(a, b);

&#x20;       int lcm = product / gcd;

&#x20;       return lcm;

&#x20;   }

&#x20;

}

