package searchandsort;

public class BinarySearch {
	public static void main(String args[]){
		int[] a = new int[10];
		
		/*
		 * We have an array of sorted elements.
		 * 
		 *  We are going to split the array to middle and 
		 *  
		 *  start to search the left half and then the right half. 
		 *  
		 *  If the element is found then return the element. 
		 *  
		 *  If not throw an error message
		 */
		
		int n = 4;
		
		int length = a.length;
		
		for(int i = 0 ; i < 10 ; i = i+1){
			
			a[i] = i;
			
		}
		
		binarySearch(a, 0, length-1, n);
	}
	
	public static void binarySearch(int[] x, int left, int right, int n){
				
		left = 0;
		
		right = x.length-1;
		
		if(right >= 1){
			
			int mid =  (left + (right-1))/2;
			
			if(x[mid] == n){
				
				System.out.println("Element Found: "+ x[mid]);
				
			}
			
			else if(x[mid] < n){
				
				binarySearch(x, left, mid-1, n);
				
			}
			
			else{
				
				binarySearch(x, mid+1, right, n);
			}
		}
		
		
	}
}
