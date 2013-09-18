
public class Tree {

	Node root;
	
	public Tree(){
		root = null;
	}
	
	public static Tree concatenar(Tree a, Tree b){
		return null;
	}
	
	public static Tree union(Tree a, Tree b){
		return null;
	}
	
	public static void recorrer(Node root){
		
		if(root == null)
			return;
		
		recorrer(root.left);
		recorrer(root.right);

	}
	
	public static void recorrer(Edge edge){
		recorrer(edge.node);
	}

}
