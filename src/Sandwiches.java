import java.util.ArrayList;
import java.util.List;

public class Sandwiches {

	public static void main(String[] args) {
		List<String> sandwiches = new ArrayList<>();
		sandwiches.add("bread sandwich");
		sandwiches.add("pop tart");
		sandwiches.add("hot dog");

		System.out.println(sandwiches);
		sandwiches.set(0,"burger");
		System.out.println(sandwiches.get(0));
		
		for (int i = 0; i<sandwiches.size(); i++) {
			System.out.println(sandwiches.get(i));
		}
		
		
		
	}

}
