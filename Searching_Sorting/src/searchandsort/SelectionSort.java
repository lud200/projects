package searchandsort;

public class SelectionSort {
	public static void main(String args[]){
		/*
		 * Selection sort sorts the array by repeatedly finding the minimum
		 * element from the unsorted part of an array and putting it in the front of the array.
		 * 
		 * 
		 */
		
		int[] a = {2, 34, 22, 44, 1, 33, 8, 9};
		
		for(int i = 0; i < a.length-1; i++){
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[i]>a[j]){
					
					int temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
					
				}
			}			
		}
		
		for(int i=0; i<a.length ; i++){
			
			System.out.println(a[i]);
			
		}
		
	}
	
}

