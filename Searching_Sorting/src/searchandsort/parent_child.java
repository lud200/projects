package searchandsort;

import java.util.*;
import java.io.*;

public class parent_child {
	public static void main(String args[]){
		
		String s="{\"A\":[\"b\"], \"C\":[\"d\", \"N\"]}";
		
		String delims="[\\,\"{}\\[\\z]]+";
		
		String tokens[]=s.split(delims);
		
		for(int i=0;i<tokens.length;i++){
			
			System.out.print(tokens[i]+"\t");
			
		}
		
		HashMap<String, List<String>> h=new HashMap<String, List<String>>();
		
		List<String> p=new ArrayList<String>();
		List<String> bchildren=new ArrayList<String>();
		List<String> cchildren=new ArrayList<String>();
		
		p.add("betty");
		p.add("clara");
		
		bchildren.add("dona");
		bchildren.add("elize");
		bchildren.add("flora");
		
		cchildren.add("glora");
		cchildren.add("hazel");
		
		h.put("ann", p);
		h.put("betty", bchildren);
		h.put("clara", cchildren);
		
		
		String test1="elize";
		String test2="flora";
		
		if(bchildren.contains(test1)){
			
			if(bchildren.contains(test2)){
				
				System.out.println(getValue(h, bchildren));
				
			}
		}
		else if(cchildren.contains(test1)){
			
			if(cchildren.contains(test2)){
				
				System.out.println(getValue(h, cchildren));
				
			}
		}
		else if(p.contains(test1)){
			
			if(p.contains(test2)){
				
				System.out.println(getValue(h, p));
				
			}
		}
		
		else if(bchildren.contains(test1) || p.contains(test1)){
			
			if(p.contains(test2) || bchildren.contains(test2)){
				
				System.out.println(getValue(h, bchildren));
				
			}
		}
		
		else if(cchildren.contains(test1) || p.contains(test1)){
			
			if(p.contains(test2) || cchildren.contains(test2)){
				
				System.out.println(getValue(h, cchildren));
				
			}
		}
		
	}
	
	
	
	public static Object getValue(HashMap<String, List<String>> h, List<String> value){
		
		String key=null;
		
		for(Map.Entry entry:h.entrySet()){
			
			if(value.equals(entry.getValue())){
								
				key=(String) entry.getKey();
				
				break;
				
			}
			
		}
		
		return key;
	}
}