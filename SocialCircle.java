package hello;
import java.util.*;
public class SocialCircle {
		public static List<String> dfsRecursive(Map<String, List<String>> graph, String startPerson) {
	        Set<String> visited = new HashSet<>();
	        List<String> result = new ArrayList<>();
	        dfsHelper(startPerson, graph, visited, result);
	        return result;
	    }

	    private static void dfsHelper(String person, Map<String, List<String>> graph,
	                                  Set<String> visited, List<String> result) {
	        if (visited.contains(person)) return;
	        visited.add(person);
	        result.add(person);

	        for (String neighbor : graph.getOrDefault(person, Collections.emptyList())) {
	            dfsHelper(neighbor, graph, visited, result);
	        }
	    }

	    public static List<String> dfsIterative(Map<String, List<String>> graph, String startPerson) {
	        Set<String> visited = new HashSet<>();
	        Stack<String> stack = new Stack<>();
	        List<String> result = new ArrayList<>();

	        stack.push(startPerson);

	        while (!stack.isEmpty()) {
	            String person = stack.pop();
	            if (!visited.contains(person)) {
	                visited.add(person);
	                result.add(person);

	                for (String neighbor : graph.getOrDefault(person, Collections.emptyList())) {
	                    if (!visited.contains(neighbor)) {
	                        stack.push(neighbor);
	                    }
	                }
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Map<String, List<String>> graph = new HashMap<>();
	        graph.put("Alice", Arrays.asList("Bob", "Charlie"));
	        graph.put("Bob", Arrays.asList("Alice"));
	        graph.put("Charlie", Arrays.asList("Alice"));
	        graph.put("David", Arrays.asList("Eve"));
	        graph.put("Eve", Arrays.asList("David"));
	        graph.put("Frank", new ArrayList<>()); 

	        System.out.println("Recursive DFS from Alice: " + dfsRecursive(graph, "Alice"));
	        System.out.println("Recursive DFS from David: " + dfsRecursive(graph, "David"));
	        System.out.println("Recursive DFS from Frank: " + dfsRecursive(graph, "Frank"));

	        System.out.println("Iterative DFS from Alice: " + dfsIterative(graph, "Alice"));
	        System.out.println("Iterative DFS from David: " + dfsIterative(graph, "David"));
	        System.out.println("Iterative DFS from Frank: " + dfsIterative(graph, "Frank"));
		

	}

}
