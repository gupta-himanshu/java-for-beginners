class Box {
  double width, height, depth;

  void volume() {
    System.out.print("Volume is ");
    System.out.println(width * height * depth);
  }
}

class BoxDemo3 {
  public static void main(String args[]) {
    Box myBox1 = new Box();
    Box myBox2 = new Box();
    double vol;

    myBox1.width = 10;
    myBox1.height = 20;
    myBox1.depth = 15;

    myBox2.width = 3;
    myBox2.height = 6;
    myBox2.depth = 9;

    myBox1.volume();

    myBox2.volume();
  }
}
