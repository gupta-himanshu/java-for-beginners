package p1;

import p1.Protection;

class Derived extends Protection {
  Derived() {
    System.out.println("Derived Constructor");
    System.out.println("n = " + n);
    System.out.println("n_pro = " + n_pro);
    System.out.println("n_pub = " + n_pub);
  }
}
