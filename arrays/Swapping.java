package arrays;

public class Swapping {

	public static void main(String[] args) {
		int[] arr = {0,12,2,0,323,32,444,0};
		
		int j = 0;
		
		for(int i = 0 ; i<arr.length ;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j++;
			}
		}
		
		for(int arry : arr) {
			System.out.println(arry);
		}

	}

}
