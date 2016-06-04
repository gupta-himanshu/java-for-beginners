class AssertDemo1 {
  static int val = 3;

  static int getNum() {
    return val--;
  }

  public static void main(String args[]) {
    int n = 0;

    for(int i=0; i<10; i++) {
      assert (n = getNum()) > 0;

      System.out.println("n is " + n);
    }
  }
}
