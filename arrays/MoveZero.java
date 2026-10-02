package arrays;

public class MoveZero {
	public static void main(String[] args) {
		int[] arr = {0,2,12,0,43,44}; 
		
		int j=0;
		for(int i = 0 ; i<arr.length ;i++) {
			if(arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while(j < arr.length) {
			arr[j] = 0;
			j++;
		}
		
		for(int arry : arr) {
			System.out.println(arry);
		}
	}
}
