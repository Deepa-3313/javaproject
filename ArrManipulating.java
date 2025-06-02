package hello;
import java.util.ArrayList;
import java.util.Collections;
public class ArrManipulating {
	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<String>();
		students.add("kamal");
		students.add("charlie");
		students.add("Alice");
		students.add("bob");
		students.add("teja");
		students.add("sarayu");
		Collections.sort(students);
		students.remove(3);
		students.remove("Alice");
		Collections.reverse(students);
		String searchName="teja";
		 if (students.contains(searchName)) {
	            int index = students.indexOf(searchName);
	            System.out.println(searchName + " exists at index: " + index);
	        } else {
	            System.out.println(searchName + " does not exist in the list.");
	        }

	        for (int i = 0; i < students.size(); i++) {
	            System.out.println(students.get(i));
			
		}
			
			}
		}
