package generics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		
		for (Integer n : nums) {
			System.out.println(n);
		}
		
		System.out.println("-------------------");
		
		nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
	}
}
