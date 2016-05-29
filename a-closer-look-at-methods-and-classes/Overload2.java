class OverloadDemo {
  void test() {
    System.out.println("No parameters");
  }

  void test(int a, int b) {
    System.out.println("a and b: " + a + " " + b);
  }

  void test(double a) {
    System.out.println("Inside test(double) a: " + a);
  }
}

class Overload2 {
  public static void main(String args[]) {
    OverloadDemo ob = new OverloadDemo();
    int i = 88;

    ob.test();
    ob.test(10, 20);

    ob.test(i);
    ob.test(123.25);
  }
}
