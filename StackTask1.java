package hello;

import java.util.Stack;

public class StackTask1 {

	public static void main(String[] args) {
		      Stack<String> plates=new Stack<String>();
			plates.push("plates 1");
			plates.push("plates 2");
			plates.push("plates 3");
			plates.push("plates 4");
			plates.push("plates 5");
			System.out.println("To plate is "+plates.peek());
		
			String removed=plates.pop();
			System.out.println("removed plates:"+removed);
			System.out.println("Remaining plates:"+plates);
			

	}

}

