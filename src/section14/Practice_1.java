package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice_1 {

	public static void main(String[] args) {
		
		//Basic stream -To get count of letters in arraylist starts with M
		ArrayList<String> str = new ArrayList<String>();
		str.add("January");
		str.add("February");
		str.add("March");
		str.add("May");
		str.add("June");
		long c = str.stream().filter(s->s.startsWith("M")).count();
		System.out.println(c);
		
		
		//Basic stream -To get count of letters in arraylist ends with r
		long l=Stream.of("Jan","Feb","Mar","Apr").filter(s->s.endsWith("r")).count();
		System.out.println(l);
		
		
		//Print names greater than 4 letters from the ArrayList by using stream
		ArrayList<String> str2 = new ArrayList<String>();
		str2.add("January");
		str2.add("February");
		str2.add("March");
		str2.add("May");
		str2.add("June");
		str2.stream().filter(s->s.length() > 4).forEach(s->System.out.println(s));
		
		
		// We can also limit the result set:
		str2.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
		// Print names which have last letter as "y" and convert that names into uppercase by using Stream MAP
		Stream.of("Sunday","Monday","Tuesday","Wednesday").filter(s->s.endsWith("y")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//Print names which have first letter as "T" with uppercase and sorted
		List<String> arr=Arrays.asList("Thursday","Friday","Tuesday");
		arr.stream().filter(s->s.startsWith("T")).sorted().forEach(s->System.out.println(s));

	}

}
