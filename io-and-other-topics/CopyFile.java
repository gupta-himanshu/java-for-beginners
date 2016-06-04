import java.io.*;

class CopyFile {
  public static void main(String args[]) throws IOException {
    int i;
    FileInputStream fin;
    FileOutputStream fout;

    try {
      try {
        fin = new FileInputStream(args[0]);
      } catch (FileNotFoundException e) {
        System.out.println("Input File not found");
        return;
      }

      try {
        fout = new FileOutputStream(args[1]);
      } catch (FileNotFoundException e) {
        System.out.println("Error Opening Output File.");
        return;
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Usage: CopyFile From To");
      return;
    }

    try {
      do {
        i = fin.read();
        if(i != -1) fout.write(i);
      } while(i != -1);
    } catch (IOException e) {
      System.out.println("File Error");
    }

    fin.close();
    fout.close();
  }
}
