import java.util.ArrayList;

public class Node {

	State state;
	Node parent;
	Operator op;
	int depth;
	long cost;
	
	
	public Node() {
		
	}
	
	
	public Node(State state) {
		//makes initial node
		 this.state = state;
		 cost = 0;
		 depth = 0;
	}
	
	public State getState () {
		return state;
	}
	

}
