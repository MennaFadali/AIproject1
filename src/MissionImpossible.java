
public class MissionImpossible {

	public Grid genGrid() {
		int n, m, c, k, sx, sy, ex, ey;
		n = getRandom(5, 15);
		m = getRandom(5, 15);
		k = getRandom(5, 10);
		c = getRandom(1, k);
		boolean [][] taken = new boolean [n][m];
		int [] e = getRandomPos(taken);
		ex = e[0];
		ey = e[1];
		taken[ex][ey] = true;
		int [] s = getRandomPos(taken);
		sx = s[0];
		sy = s[1];
		taken[sx][sy] = true;
		int [] x = new int [k] , y = new int [k] , h = new int [k];
		for (int i = 0 ; i< k ; i++) {
			int [] tmp = getRandomPos(taken);
			x[i] = tmp[0];
			y[i] = tmp[1];
			h[i] = getRandom(1, 99);
			taken[x[i]][y[i]] = true;
		}
		return new Grid(c, k, n, m, ex, ey, sx, sy, x, y, h);
	}
	
	public static int[] getRandomPos (boolean [][] taken) {
		int x = getRandom(0, taken.length) , y = getRandom(0, taken[0].length);
		while(taken[x][y]) 
		 x = getRandom(0, taken.length) ; y = getRandom(0, taken[0].length);	
		return new int [] {x,y};
	}

	public static int getRandom(int from, int to) {
		return from + (int) (Math.random() * (to + 1));
	}

	public String solve(String grid, String strategy, boolean visualize) {
		Grid g = Grid.unparse(grid);
		return "";
	}
}
