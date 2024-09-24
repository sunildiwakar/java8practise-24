package a.b.c;

import java.util.stream.Collectors;
 import java.util.stream.Stream;
 import java.util.*;  

 public class students {
  
 public static void main(String[] args)
  {
  Stream<String[]> myStr = Stream.of(new String[][] { { "std-001", "Sam Wilson" },
                                          { "std-002", "Kate Moore" },
                                         { "std-001", "Jim Martin" } });  
      LinkedHashMap<String, String>
      myMap = myStr.collect(Collectors.toMap(x -> x[0], x -> x[1], (a, b) -> a + ", " + b, LinkedHashMap::new));

      // Printing the returning Map
      System.out.println("My Linked Hash Map:" + myMap);
    }
 
 
 List<List<String>> namesNested = Arrays.asList( 
	      Arrays.asList("Jeff", "Bezos"), 
	      Arrays.asList("Bill", "Gates"), 
	      Arrays.asList("Mark", "Zuckerberg"));

	    List<String> namesFlatStream = namesNested.stream()
	      .flatMap(Collection::stream)
	      .collect(Collectors.toList());

 
 
 
 
 
 
 
 
 
 
 
 }