package searchandsort;

public class Bubble_Sort {
	
	public static void main(String[] args){
		
		int[] a = {2, 1, 44, 22, 13, 6, 11, 9};
		
		int temp=0;
		
		for(int i = 0; i < a.length-1;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]);
			
		}
		
	}
}
