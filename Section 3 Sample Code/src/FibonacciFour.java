import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FibonacciFour {
	public static void main(String[] args) {
		//Using the Fibonacci sequence print out sequence values under 400 that are divisible by 4.
		List<Integer> fibs = new ArrayList<Integer>();
		fibs.add(0);
		
		int pre = 0;
		int num = 1;
		do { 
			fibs.add(num);
			num = fibs.get(pre) + fibs.get(pre + 1);
			pre++;
		} while (num < 400);
		
		Collections.sort(fibs.parallelStream().collect(Collectors.toList()));
		fibs.stream().filter(x -> x % 4 == 0).forEach(x -> System.out.println(x));
	}
}