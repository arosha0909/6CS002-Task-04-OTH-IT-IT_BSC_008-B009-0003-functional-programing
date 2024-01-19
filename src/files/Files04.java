package files;

import java.io.*;

public class Files04 {

  public static void main(String[] args) throws Exception {
    BufferedReader r  = 
        new BufferedReader(new FileReader("data/Cat-Tiger.txt"));

    r.lines()
     .map(l -> l.toUpperCase())
     .forEach(l -> System.out.println(l));
    
    r.close();
  }

}
