class Client implements Callback {
  public void callback(int p) {
    System.out.println("callback called with " + p);
  }

  void nonIfaceMeth() {
    System.out.println("Classes that implements interfaces may also define other members, too");
  }
}
