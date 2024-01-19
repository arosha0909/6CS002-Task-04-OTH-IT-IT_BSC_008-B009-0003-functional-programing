package files;

import java.io.*;
import java.util.*;

public class Files07 {

  public static void main(String[] args) throws Exception {
    BufferedReader r  = 
      new BufferedReader(new FileReader("data/Cat-Tiger.txt"));

    Optional <String >result = 
      r.lines()
       .reduce((left, right) -> left.concat(" ".concat(right)));
    
    if(result.isPresent())
      System.out.println("result is " + result.get());
    else
      System.out.println("result not present");
    r.close();
  }

}
