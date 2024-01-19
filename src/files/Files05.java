package files;

import java.io.*;

public class Files05 {

  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new FileReader("data/Cat-Tiger.txt"));

    r.lines().sorted((a, b) -> {
      if (a.length() == b.length())
        return 0;
      if (a.length() < b.length())
        return 1;
      return -1;
    }).forEach(l -> System.out.println(l));

    r.close();
  }

}
