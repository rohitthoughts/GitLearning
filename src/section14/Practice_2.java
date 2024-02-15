package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Practice_2 {

	public static void main(String[] args) {


		// Merging two different ArrayLists by using streams
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("rohit");
		arr.add("aman");
		arr.add("abhishek");
		arr.add("kiran");
		List<String> names = Arrays.asList("Tom", "Harry", "John", "Katie");
		Stream<String> NewStream=Stream.concat(arr.stream(),names.stream());
		NewStream.sorted().forEach(s->System.out.println(s));
		
		
		//If you have to check "rohit" is present or not, then use Anymatch method,
		boolean present = Stream.of("red","yellow","black").anyMatch(s->s.equalsIgnoreCase("red"));
		System.out.println(present);
		Assert.assertTrue(present);
		
		
		//Collect method- used to convert stream again into list or map or anything else
		List<String> list=Stream.of("Pune","Mumbai","Delhi","Chennai","Hydrabad").filter(s->s.endsWith("i")).collect(Collectors.toList());
		System.out.println(list.get(1));
		
		
		//Print unique number from Integer array
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,6,7,7,8,9);
		values.stream().distinct().forEach(s->System.out.println(s));
		
		
		//Sort the array, get 3rd index
		List<Integer> values2=Arrays.asList(11,12,15,13,12,14);
		List<Integer> inn = values2.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(inn.get(2));

	}

}
