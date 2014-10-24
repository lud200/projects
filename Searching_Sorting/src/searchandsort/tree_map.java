package searchandsort;
import javax.swing.tree.*;
public class tree_map {
	
	public static void main(String[] args){
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("ann");
		
		DefaultMutableTreeNode pchildNode1 = new DefaultMutableTreeNode("betty");
		
		DefaultMutableTreeNode pchildNode2 = new DefaultMutableTreeNode("clare");
		
		root.add(pchildNode1);
		
		root.add(pchildNode2);
		
		DefaultMutableTreeNode childNode1 = new DefaultMutableTreeNode("dona");
		DefaultMutableTreeNode childNode2 = new DefaultMutableTreeNode("eliz");
		DefaultMutableTreeNode childNode3 = new DefaultMutableTreeNode("flora");
		
		pchildNode1.add(childNode1);
		pchildNode1.add(childNode2);
		pchildNode1.add(childNode3);
		
		DefaultMutableTreeNode childN1 = new DefaultMutableTreeNode("glora");
		DefaultMutableTreeNode childN2 = new DefaultMutableTreeNode("hazel");
		
		pchildNode2.add(childN1);
		pchildNode2.add(childN2);
		
		String child1="clare";
		String child2="hazel";
		String r=root.toString();
		String p1=pchildNode1.toString();
		String p2=pchildNode2.toString();
		String p2c1=childN1.toString();
		String p2c2=childN2.toString();
		
		//System.out.println(r);
		if(r.equals(child1) || r.equals(child2)){
			
			System.out.println(r);
			
		}
		
		else if(p2.equals(child1) || p2.equals(child2)){
			
			
			
		}
		
		else if(p1.equals(child1) || p1.equals(child2)){
			
			System.out.println(p1);
		}
		
		
	}

}
