class Box {
  double width, height, depth;

  Box() {
    System.out.println("Constructing Box");
    width = 10;
    height = 10;
    depth = 10;
  }

  double volume() {
    return width * height * depth;
  }
}

class BoxDemo6 {
  public static void main(String args[]) {
    Box myBox1 = new Box();
    Box myBox2 = new Box();
    double vol;

    vol = myBox1.volume();
    System.out.println("Volume is " + vol);

    vol = myBox2.volume();
    System.out.println("Volume is " + vol);
  }
}
