package hello;

public class BinarySearchExample {
	public static void main(String[] args) {
		int[] numbers = {1,5,9,15,19,24};
		int tag=24;
		int left=0;
		int right=numbers.length-1;
		boolean found=false;
		while(left<=right) {
			int mid=(left+right)/2;
		if(numbers[mid]==tag) {
			System.out.println("Found"+tag+"at index"+mid);
			found=true;
			break;
		}else if(tag<numbers[mid]){
			right=mid-1;
	}else {
		left=mid+1;
		}

	}
		if(!found) {
			System.out.println("number not found");
		}
	}
}

