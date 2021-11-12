package Exo3;

public class Circle {
	private Point center; 
	private int radius; 
	
	public Circle(Point p, int r) {
	       this.center=p; 
	       this.radius=r; 
		
	
	}
	
	public void translate(int dx, int dy) {
	
        this.center.setX(dx*this.center.getX()); 
		this.center.setY(dy*this.center.getY()); 
	
	}
	
	
	
	public Point getCenter() {
		Point p = new Point(this.center);
		return p;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "un cercle de centre: " +this.center.toString()+ "le rayon est de: "+this.radius;
		
		
	}

}