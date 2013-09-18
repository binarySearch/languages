
public class Node {

	Edge left;
	Edge right;
	int type;
	String name;
	
	public Node(int type, String name){
		left = null;
		right = null;
		this.name = name;
		this.type = type;
		
	}
	
	public void setEdge(Edge edge, Node destination){
		edge.node = destination;
	}
	
	

}
