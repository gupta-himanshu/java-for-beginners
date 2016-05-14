package MyPack;

public class Balance {
  String name;
  double bal;

  public Balance(String n, double v) {
    name = n;
    bal = v;
  }

  public void show() {
    if(bal < 0)
      System.out.print("--> ");
    System.out.println(name + ": $" + bal);
  }
}
