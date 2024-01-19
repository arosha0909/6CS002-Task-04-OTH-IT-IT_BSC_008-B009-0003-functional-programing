package files;

import java.io.*;

public class Files01 {

  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new FileReader("data/Cat-Tiger.txt"));

    r.lines().forEach(l -> System.out.println(l));

    r.close();
  }

}
