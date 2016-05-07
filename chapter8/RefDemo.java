class Box {
  double width, height, depth;

  Box(Box ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

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

class BoxWeight extends Box {
  double weight;

  BoxWeight(double w, double h, double d, double m) {
    width = w;
    height = h;
    depth = d;
    weight = m;
  }
}

class RefDemo {
  public static void main(String args[]) {
    BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
    Box plainBox = new Box();
    double vol;

    vol = weightBox.volume();
    System.out.println("Volume of myBox1 is " + vol);
    System.out.println("Weight of myBox1 is " + weightBox.weight);
    System.out.println();

    plainBox = weightBox;

    vol = plainBox.volume();
    System.out.println("Volume of myBox2 is " + vol);
  }
}
