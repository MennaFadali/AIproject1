import java.util.ArrayList;
import java.util.PriorityQueue;

 class GenericSearchProblem {
// This is an abstract class for any search problem and search strategy
	
	public Node generalSearch (Problem problem, QngFn fn ) {
		PriorityQueue<Node> nodes = fn.makeQueue(new Node(problem.getInitState()));
		
		while(!nodes.isEmpty()) {
			Node cur = nodes.poll();
			if(problem.isGoal(cur.getState())) 
				return cur;
			nodes.addAll(expand(cur, problem.getOperators()));
		}
		return null;
	}
	
	public ArrayList<Node> expand(Node node, ArrayList<Operator> operators) {
		ArrayList<Node> next = new ArrayList<Node>();
		for (Operator op: operators) 
			next.add(op.operate(node));
		return null;
	}
	
}
