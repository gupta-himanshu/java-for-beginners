class NestTry {
  public static void main(String args[]) {
    try {
      int a = args.length;
      System.out.println("a = " + a);
      int b = 42 / a;
      try {
        if (a == 1) a = a / (a-a);
        if (a == 2) {
          int c[] = { 1 };
          c[42] = 99;
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index oob: " + e);
      }

    } catch (ArithmeticException e) {
      System.out.println("Division by 0: " + e);
    }
  }
}
