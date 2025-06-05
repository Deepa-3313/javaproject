package hello;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseSort {

	public static void main(String[] args) {
		TreeSet<String> employeeNames = new TreeSet<>(Comparator.reverseOrder());

        employeeNames.add("priya");
        employeeNames.add("neha");
        employeeNames.add("Anjali");
        employeeNames.add("Mohan");
        employeeNames.add("maya");
        System.out.println("Employee names in reverse order:");
        for (String name : employeeNames) {
            System.out.println(name);

	}

  }
}
