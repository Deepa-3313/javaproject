package hello;

public class DetectCycleArray {

	public static void main(String[] args) {
		 int[] next = {1, 2, 0}; // 0 → 1 → 2 → 0 → (cycle)

	        boolean[] visited = new boolean[next.length];
	        int i = 0;
	        boolean hasCycle = false;

	        while (i >= 0 && i < next.length) {
	            if (visited[i]) {
	                hasCycle = true;
	                break;
	            }
	            visited[i] = true;
	            i = next[i];
	        }

	        System.out.println("Cycle present: " + hasCycle);

	}

}
