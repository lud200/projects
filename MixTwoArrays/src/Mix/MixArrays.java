package Mix;

public class MixArrays {
	public static void main(String args[]){
		int[] a=new int[10];
		int[] b=new int[10];
		int[] c=new int[20];
		for(int i=0;i<a.length;i++){
			a[i]=1;
			c[i*2]=a[i];
			System.out.print(a[i]);
			}
		System.out.println();
		for(int i=0;i<b.length;i++){
			b[i]=3;
			c[i*2+1]=b[i];
			System.out.print(b[i]);
			}
		System.out.println();
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		System.out.println();
		
		
	}
}
