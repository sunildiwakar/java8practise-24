package a.b.c;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Test1 {

	public static void main(String[] args) {

		
		
		String[] strArr = {"welcome" , "to", "java"};
		int[] intarr = {1,2,3,4,5};
		String concatString=Arrays.stream(strArr).reduce("----", (a,b)->(a+b));
		int sum=Arrays.stream(intarr).reduce(10, (a,b)->(a+b));
		System.out.println(concatString);
		System.out.println(sum);
		
		
		OptionalInt oi=Arrays.stream(intarr).min();
		oi.getAsInt();
		
		
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		Optional<Integer> maxNumber = list.stream() 
		      .max((i, j) -> i.compareTo(j));
		System.out.println(maxNumber.get());
		
//		Comparator<Integer> maxComparator = new Comparator<Integer>() {
//			  @Override
//			  public int compare(Integer n1, Integer n2) {
//			    return n1.compareTo(n2);
//			  }
//			};
//			Optional<Integer> maxNumber = list.stream().max(maxComparator);
			
		Integer var = list.stream().max(Integer::compare).get();
		
		//Integer.compare(x, y);
		
		String[] strArr1 = {"welcome" , "to", "java"};
//		Optional<String> max = strArr1.stream()
//			      .max((i, j) -> i.compareTo(j));
		
		Optional<String> max=Arrays.stream(strArr1).max((i, j) -> i.compareTo(j));
		System.out.println(max);
		
		
		//String var1 = Arrays.stream(strArr1).max(String::compare).get();
		
		String maxString = Arrays.stream(strArr1)
                .max(Comparator.naturalOrder())
                .get();
		
		
		//Comparator<Person> byLastName = Comparator.comparing(Person::getLastName);

		List<Elt> res = Arrays.asList(new Elt(), new Elt());
	    res.sort(Comparator.comparing(Elt::getA)); // elt -> elt.getA()
	    res.sort(Comparator.comparing(Elt::getB)); // elt -> elt.getB()
	    res.sort(Comparator.comparing(Elt::getC)); // elt -> elt.getC()
		
		
	    res.sort(Comparator.comparing(Elt::getC).thenComparing(Elt::getA));
	   // res.sort(Comparator.comparing(Elt::getC).compare(o1, o2);
	    
	    
	    
	    
	    
	}
	
}
class Elt {
    int a, b;
    float c;
    public int getA() { return a; }
    public int getB() { return b; }
    public float getC() { return c; }
}