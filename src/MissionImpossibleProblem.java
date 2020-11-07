import java.util.ArrayList;

public class MissionImpossibleProblem implements Problem {
	
	Grid grid;
	boolean [][][][][] memo;
	int n , m;
	
	public  MissionImpossibleProblem(Grid grid) {
		// TODO Auto-generated constructor stub
		this.grid = grid;
		this.n  = grid.n;
		this.m = grid.m;
		memo = new boolean[grid.c+1][grid.n][grid.m][600][1<<grid.k];
	}
	
	@Override
	public ArrayList<Operator> getOperators() {
		// TODO Auto-generated method stub
		ArrayList<Operator> operators = new ArrayList<Operator>();
		// left
		operators.add(new Operator() {
			
			@Override
			public Node operate(Node n) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Left";
			}
			
		
		});
		// right
		operators.add(new Operator() {
			
			@Override
			public Node operate(Node n) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Right";
			}
		});
		// up
		operators.add(new Operator() {
			
			@Override
			public Node operate(Node n) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Up";
			}
		});
		// down
		operators.add(new Operator() {
			
			@Override
			public Node operate(Node n) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Down";
			}
		});
		// carry
		operators.add(new Operator() {
			
			@Override
			public Node operate(Node n) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Carry";
			}
		});
		// drop
		operators.add(new Operator() {
			
			@Override
			public Node operate(Node n) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Drop";
			}
		});

		return operators;
	}

	@Override
	public State getInitState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<State> getStateSpace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGoal(State state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pathCost(ArrayList<Node> path) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
