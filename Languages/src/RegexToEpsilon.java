import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class RegexToEpsilon {

	/**
	 * @param args
	 */
	public static Stack<Integer> STACK = new Stack<Integer>(); 
	public static List<DepthOfComma> LIST = new ArrayList<DepthOfComma>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringAnalizer("(hola,hey),(gane,perdi)");
		//printStack(STACK);
		//printList(LIST);
		
		Node root = new Node(0,"q0");
		Node one = new Node(1,"q1");
		Node two = new Node(2,"f");
		
		root.setEdge(root.left,one);
		root.setEdge(root.right,two);
		

	}
	
	public static void printList(List<DepthOfComma> listOfObjects){ // Prints the array

        for(int i=0; i<listOfObjects.size(); i++){
            System.out.print("Depth: " + listOfObjects.get(i).getDepth() + " ");
            System.out.print("Position: " + listOfObjects.get(i).getPosition() + " ");
            System.out.println();
        }
        
    }
	
	public static void printCharList(List<Character> charList){ // Prints the array

        for(int i=0; i<charList.size(); i++){
            System.out.print(charList.get(i));
        }
        System.out.println();
    }
	
	public static void printIntList(List<Integer> intList){ // Prints the array

        for(int i=0; i<intList.size(); i++){
            System.out.print(intList.get(i));
        }
        System.out.println();
    }
	
	public static void printStack(Stack<Integer> stack){
		List<Integer> list = new ArrayList<Integer>();
		
		while(stack.isEmpty() == false){
			list.add((Integer) stack.pop());
		}
		
		printIntList(list);
	}
	
	public static void createObjects(int position, int depth){
		DepthOfComma temp = new DepthOfComma(position,depth);
		LIST.add(temp);
		
	}
	
	public static void stringAnalizer(String regex){
		List<Character> charList = new ArrayList<Character>();
		int counter = 0;
		
		for(char a : regex.toCharArray()){
			charList.add(a);
		}
		
		STACK.push(0);
		
		for(int i = 0 ; i < charList.size(); i++){
			
			if(charList.get(i) == '(')
				STACK.push(++counter);
			if(charList.get(i) == ')'){
				STACK.pop(); counter--;}
			if(charList.get(i) == ',' && STACK.isEmpty()==false){
				createObjects(i,STACK.peek());
			}
				
		}
		
		printCharList(charList);//Imprime la lista de caracteres obtenida de la cadena que se mando como parametro
		
		
	}

}
