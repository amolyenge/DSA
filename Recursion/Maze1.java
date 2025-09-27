
public class Maze1 {

	public static void main(String[] args) {
       int ans = count(3 , 3);
       System.out.println(ans);
	}
	
	public static int count(int r , int c) {
		if(r == 1 || c == 1) {
			return 1;
		}
		
		int left = count(r - 1, c);
		int right = count(r , c - 1);
		return left + right;
	}

}
