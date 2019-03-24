package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	
	public Cuboid(int L, int W, int D) throws IllegalArgumentException {
		super(L, W);
		
		if (D<=0) {
			throw new IllegalArgumentException ("Depth must be positive"); 
		}
		else {
			iDepth=D;
		}
		
	}
	public int getiDepth() {
		return iDepth;
		
	}
	public void setiDepth(int D) throws IllegalArgumentException {
		if (iDepth>0) {
			iDepth=D;
			}
			else {
				throw new IllegalArgumentException ("IllegalArgumentException"); //double check this!!! 
			}
		
	}
	@Override 
	public double area() {
		return (2* super.getiLength() * super.getiWidth()) +(2* this.getiDepth() * super.getiWidth())+(2* super.getiLength() * this.getiDepth());
		
		
	}
	public double volume(){
		return super.getiLength() * super.getiWidth() *this.getiDepth();
		
		
	}
	@Override
	 public double perimeter() throws UnsupportedOperationException{ 
		double x=0;
		if (x==0) {
		
			throw new UnsupportedOperationException ("Cannot take perimeter of a rectangle.");
		}
		else {
			
			return x;
		}
	}	

public class SortByArea implements Comparator<Cuboid> {
	
	 SortByArea() {
	
	}
	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		
		return (int) (o1.area() - o2.area()); 
}

public class SortByVolume implements Comparator<Cuboid> {

	SortByVolume(){
	
	}
	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		
		return (int) (o1.volume() - o2.volume()); //MAKE SURE HTIS IS ASCENDING 
				
	}
	
	}
	}
}
	

