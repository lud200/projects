package searchandsort;

public class reverseSentecne {
	
	public static void main(String args[]){
		String str = "Hello World";
		reverse("hello world");
		System.out.println(recursivereverse("hello"));
	}
	
	public static void reverse(String s){
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++){
			s2=s.substring(i, i+1);
			s1=s2+s1;
		}
		System.out.println(s1);
	}
	public static String s1="";
	public static String recursivereverse(String s){
		//char[] c=s.toCharArray();
		
		int i=0;
		if(s=="\0"){
			return s;
		}
		else{
			if(i<s.length()){	
			s1=recursivereverse(s.substring(1))+s.charAt(0);
			}
		}
		return s1;
	}

}
