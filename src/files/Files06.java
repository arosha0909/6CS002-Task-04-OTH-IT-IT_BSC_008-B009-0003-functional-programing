package files;

import java.io.*;

public class Files06 {

  public static void main(String[] args) throws Exception {
    BufferedReader r  = 
       new BufferedReader(new FileReader("data/Cat-Tiger.txt"));

    System.out.println(r.lines().reduce("", String::concat));
    
    r.close();
  }

}
