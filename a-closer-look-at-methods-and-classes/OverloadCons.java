class Box {
  double width, height, depth;

  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  Box() {
    width = -1;
    height = -1;
    depth = -1;
  }

  Box(double len) {
    width = height = depth = len;
  }

  double volume() {
    return width * height * depth;
  }
}

class OverloadCons {
  public static void main(String args[]) {
    Box myBox1 = new Box(10, 20, 15);
    Box myBox2 = new Box();
    Box myCube = new Box(7);
    double vol;

    vol = myBox1.volume();
    System.out.println("Volume of myBox1 is " + vol);

    vol = myBox2.volume();
    System.out.println("Volume of myBox2 is " + vol);

    vol = myCube.volume();
    System.out.println("Volume of myCube is " + vol);
  }
}
