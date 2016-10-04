import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortingArrayList {
	public static void main(String[] args) {
		List<Integer> randos = new ArrayList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			Random rng = new Random();
			int num = rng.nextInt(100);
			while (num < 10) {
				num = rng.nextInt(100);
			}
			randos.add(num);
		}

		randos.stream().forEach(x -> System.out.print(x + ", "));
		System.out.println("\n");
		Collections.sort(randos, (x,y) -> y.compareTo(x));
		randos.stream().forEach(x -> System.out.print(x + ", "));
	}
}
