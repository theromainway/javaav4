package Exo3;

public class Point {
	private int x;
	private int y;
	static int nbpts = 0;
	public Point(int x, int y) {
		this.x= x;
		this.y= y;
		nbpts++;
	}
	public Point(Point p2) {
		this.x=p2.x;
		this.y=p2.y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	public static void IndexOf(){
		
	}
	public void setX(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setY(int i) {
		// TODO Auto-generated method stub
		
	}
}
 