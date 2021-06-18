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
