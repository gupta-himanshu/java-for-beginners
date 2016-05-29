class A {
  int i;
  private int j;

  void setij(int a, int b) {
    i = a;
    j = b;
  }
}

class B extends A {
  int total;

  void sum() {
    total = i + j;
  }
}

class Access {
  public static void main(String args[]) {
    B subOb = new B();

    subOb.setij(10, 12);

    subOb.sum();
    System.out.println("Total is: " + subOb.total);
  }
}
