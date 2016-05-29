class TestIface2 {
  public static void main(String args[]) {
    Callback c1 = new Client();
    c1.callback(42);

    Callback c2 = new AnotherClient();
    c2.callback(42);
  }
}
