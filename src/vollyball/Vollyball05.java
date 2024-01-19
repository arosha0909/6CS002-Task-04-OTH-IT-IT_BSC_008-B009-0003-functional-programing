package vollyball;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Vollyball05 {
  public static void main(String[] args) {
    List<VollyBallClub> table = Arrays.asList(
    		new VollyBallClub(1, "D. S. Senanayake College", 	22, 16, 1, 5, 621, 400, 221, 75, 41,
    	            8, 2, 76),
	        new VollyBallClub(2, "Royal College", 				22, 16, 0, 6, 625, 414, 211, 72, 43, 9, 2, 75),
	        new VollyBallClub(3, "Ananda College", 				22, 15, 1, 6, 453, 421, 32, 37, 39, 4,
	            2, 68),
	        new VollyBallClub(4, "Nalanda College", 			22, 14, 1, 7, 664, 418, 246, 70, 40, 5, 5, 68),
	        new VollyBallClub(5, "Hameed Al Husseinie College", 22, 14, 0, 8, 663, 437, 226, 70, 46, 5, 7,
	            68),
	        new VollyBallClub(6, "Vivekananda College", 		22, 11, 2, 9, 672, 527, 145, 77, 54, 9, 4, 61),
	        new VollyBallClub(7, "Lumbini College", 			22, 11, 0, 11, 497, 482, 15, 62, 54, 6, 4,
	            54),
	        new VollyBallClub(8, "Visakha Vidyalaya", 			22, 10, 0, 12, 444, 514, -70, 45, 50, 4, 5,
	            49),	
	        new VollyBallClub(9, "Muslim Ladies College", 		22, 9, 1, 12, 553, 575, -22, 53, 61, 4, 6,
	            48),
	        new VollyBallClub(10, "Ramanathan Hindu Ladies College", 22, 7, 1, 14, 442, 578, -136, 46, 57, 4, 6,
	            40),
	        new VollyBallClub(11, "Defence Services School", 	22, 5, 1, 16, 475, 545, -70, 57, 61,
	            4, 8, 34),
	        new VollyBallClub(12, "Sri Subhuthi National School", 22, 0, 0, 22, 223, 1021, -798, 29, 147, 1,
	            0, 1));

    System.out.println("Sorted by Comparator in Club class");
    table.stream().sorted().forEach(System.out::println);

    System.out.println();
    System.out.println("Sorted by lambda");
    table.stream()
         .sorted((c1, c2) -> 
            ((Integer) c1.getPointsAgainst()).compareTo(c2.getPointsAgainst()))
         .forEach(System.out::println);

  }

}
