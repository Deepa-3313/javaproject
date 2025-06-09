package hello;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphStructureExample {

	public static void main(String[] args) {
		 Map<String, List<String>> zooMap = new HashMap<>();

	        zooMap.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
	        zooMap.put("Reptile House", Arrays.asList("Snake Pit"));
	        zooMap.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
	        zooMap.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));

	        zooMap.put("Snake Pit", Collections.emptyList());
	        zooMap.put("Parrot Pavilion", Collections.emptyList());
	        zooMap.put("Lion Den", Collections.emptyList());
	        zooMap.put("Elephant Enclosure", Collections.emptyList());

	        for (String zone : zooMap.keySet()) {
	            System.out.println(zone + " connects to: " + zooMap.get(zone));
	        }
			

	}

}
