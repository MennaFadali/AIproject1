import java.util.ArrayList;
import java.util.PriorityQueue;

public interface QngFn {
	
	public PriorityQueue<Node> makeQueue(Node initState);
	
	public PriorityQueue<Node> enqueue(ArrayList<Node> nodes);
}
