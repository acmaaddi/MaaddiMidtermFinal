package pkgShape;

public class Rectangle extends Shape implements Comparable {
		
	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int L, int W) throws IllegalArgumentException {
		super();
		
			if (W<=0) {
			throw new IllegalArgumentException ("Width must be a positive number");
			}
			else {
				iWidth=W;
		}
		
		if (L<=0) {
			throw new IllegalArgumentException ("Length must be positive");
			}
		
		else
		{
			iLength=L;
		}
		
				
	}
	public int getiWidth() {
		return iWidth;
		
	}
	
	
	public void setiWidth(int W) throws IllegalArgumentException {
		if (iWidth>0) {
		iWidth=W;
		}
		else {
			throw new IllegalArgumentException ("IllegalArgumentException"); //double check this!!! 
		}
		
	}
	public int getiLength() {
		return iLength;
		
	}
	public void setiLength(int L) throws IllegalArgumentException { 
		if (iLength>0) {
			iLength=L;
			}
			else {
				throw new IllegalArgumentException ("IllegalArgumentException"); 
			}
		
	}
	public double area() {
		return this.getiLength() * this.getiWidth();
	}
	public double perimeter() {
		return (this.getiLength() *2) + (this.getiWidth()*2); 
	}
	
		
	@Override
	public int compareTo(Object o) {
		
		Rectangle r = (Rectangle) o;
		return  (int) (this.area() - (int) r.area()); //I DONT LIKE CASTING TO INT HERE--ASK ON PIAZZA.
				
				
	}
}
