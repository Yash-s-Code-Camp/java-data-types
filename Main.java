/*
 * primitive - 
 * byte(1 byte)[-128 to 127], 
 * short(2 bytes) [-32,768 to 32,767], 
 * int(4 bytes) [-2,14,74,83,648 to 2147483647],
 * long(8 bytes) [-9223372036854775808 to 9223372036854775807], 
 * float(4 bytes), [6 to 7 decimal didgits]
 *  double(8 bytes) [15 decimal didgits],
 *  char(2 bytes) [ASCII Character], 
 * boolean (1 bit) [0,1]
 * 
 * non-primitive - Array, Class, String
 */

/*
data type conversion/casting
Widening Casting / Impicit casting (Automatically done by JVM)
 byte < short < char < int < long < float < double

Narrowing Casting / Explicit casting (Manually)
double > float > long > int > char > short byte
*/

class Main {
  public static void main(String[] args) {
    int x;
    float y = 3.5f;
    x = (int) y; // Widening Casting / Impicit casting
    System.out.println(x);
    System.out.println(y);

    int a;
    float b = 3.5f;
    a = (int) b; // Narrowing Casting / Explicit casting
    System.out.println(a);
    System.out.println(b);

  }
}