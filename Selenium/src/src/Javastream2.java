package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Javastream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(3,2,2,1,5,7,8,9,8);
		//list.stream().distinct().sorted().limit(3).forEach(s->System.out.println(s));
		//list.stream().sorted().limit(3).forEach(s->System.out.println(s));
		//3rd index
		List<Integer> ls=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls.get(2));

	}

}
