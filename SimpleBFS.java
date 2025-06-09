package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> house=new HashMap<String,List<String>>();
		house.put("Living Room",Arrays.asList("Kitchen","BedRoom","Study Room"));
		house.put("Kitchen",Arrays.asList("BathRoom"));
		house.put("BedRoom",Arrays.asList("Balcony"));
		house.put("Study Room",new ArrayList<String>());
		house.put("BathRoom",new ArrayList<String>());
		house.put("Balcony",new ArrayList<String>());
		System.out.println("Exploring the house using BFS starting from living room");
		bfs(house,"Living Room");
	}

	public static void bfs(Map<String, List<String>> house, String startRoom) {
		Queue<String> queue=new LinkedList<>();
		Set<String> visited=new HashSet<>();
		queue.add(startRoom);
		visited.add(startRoom);
		while(!queue.isEmpty()) {
			String currentRoom=queue.poll();
			System.out.println("Visited"+currentRoom);
			for(String neighbor:house.get(currentRoom)) {
				 if (!visited.contains(neighbor)) {
	                    queue.add(neighbor);
	                    visited.add(neighbor);
	                }
			}
		}
		
	}
}