package searchandsort;
import java.util.*;
public class anagramsort {
	public static void main(String args[]){
		String s="aaaabcdefghia";
		//longestString(s);
		//printCases("abc");
		//String[] s={"def", "abc", "aac", "cab", "cba", "fed", "dog", "god", "apple"};
		//anagramSort(s);
		//pascalTriangle(6);
		//intervals();
		String str="ab";
		//permutations(str);
		printPermutations("abc");
	}
	public static void printPermutations(String text) {
		  char[] chars = text.toCharArray();
		  for (int i = 0, n = (int) Math.pow(2, chars.length); i < n; i++) {
		    char[] permutation = new char[chars.length];
		    for (int j =0; j < chars.length; j++) {
		      permutation[j] = (isBitSet(i, j)) ? Character.toUpperCase(chars[j]) : chars[j];
		    }
		    System.out.println(permutation);
		  }
		}

	public static boolean isBitSet(int n, int offset) {
		  return (n >> offset & 1) != 0;
		}
	public static void permutations(String str){
		permutations("", str);
	}
	public static void permutations(String prefix, String str){
		int n=str.length();
		if(n==0){
			System.out.println(prefix);
		}
		else{
			for(int i=0;i<n;i++){
				permutations(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, n));
			}
		}
	}
	public static void intervals(){
		int[] a={5, 6, 7, 8, 2, 3};
		int[] b={5, 6, 8, 2, 3};
		int sum1=0, sum2=0;
		for(int i=0;i<a.length;i++){
			sum1=sum1+a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			sum2=sum2+b[i];
		}
		System.out.println("The number missing is:"+(sum1-sum2));
	}
	public static void pascalTriangle(int a){
		for(int i=1;i<=a;i++){
			int c=1;
			for(int j=1;j<=i;j++){
				System.out.print(c+" ");
				c=c*(i-j)/j;
			}
			System.out.println();
		}
	}
	
	public static void anagramSort(String[] s){
		
		HashMap<String, Set<String>> h=new HashMap<String, Set<String>>();
		String temp[]=new String[s.length];
		for(int i=0;i<s.length;i++){	
			
			char[] c=s[i].toCharArray();
			Arrays.sort(c);
			temp[i]=new String(c);
						
			if(h.containsKey(temp[i])){
				Set<String> s1=new TreeSet<String>();
				s1.addAll(h.get(temp[i]));
				s1.add(s[i]);
				h.put(temp[i], s1);
			}
			else{
				Set<String> s2=new TreeSet<String>();
				s2.add(s[i]);
				h.put(temp[i], s2);
			}
		}
		
		List<String> list=new LinkedList<String>();
		for(Set<String> a:h.values()){
			list.addAll(a);
		}
		
		System.out.println(list);
	}
	public static void longestString(String s){
		char[] c=s.toCharArray();
		String temp="";
		String longest="";
		for(int i=0;i<s.length();i++){
			if(temp.indexOf(c[i]+"")!=-1){
				temp="";				
			}
			temp=temp+c[i];
			if(temp.length()>longest.length()){
				longest=temp;
			}
			}
		System.out.println(longest);
		}
}
