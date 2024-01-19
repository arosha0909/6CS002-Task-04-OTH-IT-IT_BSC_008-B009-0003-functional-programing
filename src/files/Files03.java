package files;

import java.io.*;

public class Files03 {

  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new FileReader("data/Cat-Tiger.txt"));

    r.lines().filter(l -> l.contains("his"))
        .forEach(l -> System.out.println(l));

    r.close();
  }

}
