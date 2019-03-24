package pkgShape_;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import static org.junit.Assert.*;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class testShape {
	
	

	@Test (expected = IllegalArgumentException.class)  
	//tests constructor AND that illegalArgumentEception is thrown
	//because a negative width value should not work 
	public void testBadRectangle()  {
			
		Rectangle r1= new Rectangle(5,-10);
			
	}

	@Test(expected = IllegalArgumentException.class) 
	//tests constructor AND that IllegalArgumentException is thrown because
	//a zero value as a length should not work 
	public void testBadRectangle2() { 
		
			Rectangle r1= new Rectangle(10,0);

	}
		
	@Test
	//tests constructor; two positive values should work
	public void testGoodRectangle3()  {
		try {
			Rectangle r1= new Rectangle(10,10);
		} catch (Exception e) {
			fail ("IllegalArgumentException");
		}

	}
		
	@Test
	//ensures getters and setters work properly
	public void testGettersSetters() {
		int length1= 75;
		int width1= 32;
		Rectangle r2= new Rectangle(length1,width1);
		assertEquals(r2.getiWidth(),32);
		assertEquals(r2.getiLength(),75);
		
	}
		
	@Test
	//tests area for a rectangle
	public void RecAreaTest() {
		int length1= 8;
		int width1= 9;
		Rectangle r3= new Rectangle(length1,width1);
		assertEquals( r3.area(),72,0);
		
		
	}
	@Test
	//tests perimeter method for a rectangle
	public void RecPerimeterTest() {
		int length1= 5;
		int width1= 4;
		Rectangle r3= new Rectangle(length1,width1);
		assertEquals( r3.perimeter(),18,0);
	}
	
	@Test
	public void compareToTest() {
		//the area of r8 is 24 and the area of r9 is 108. compareTo should show that r8 is smaller than
		//r9 by -84 units.
		Rectangle r8=new Rectangle(8,3);
		Rectangle r9=new Rectangle(9,12); 
		assertEquals("comparable", -84, r8.compareTo(r9));
	
	}
	
	@Test
	public void compareToTest2() {
		
		//the area of r8 is 24 and the area of r9 is 108. compareTo should show that r9 is greater than
		//r8 by 84 units.
		Rectangle r8=new Rectangle(8,3);
		Rectangle r9=new Rectangle(9,12); 
		assertEquals("comparable", 84, r9.compareTo(r8));
	
	}
	@Test(expected = IllegalArgumentException.class) 
	//tests that negative depth values will not work
	public void testCuboid()  {
		
			Cuboid c1= new Cuboid(5,10,-8);
		
	}
	@Test
	//tests the constructor; three positive values should work
	public void testGoodCuboid() {
		try {
			Cuboid c2= new Cuboid(10,10,10);
		} catch (Exception e) {
			fail ("IllegalArgumentException");
		}

	}
		
	@Test
	public void CuboidAreaTest() {
		//surface area of an 8x9x2 Cuboid should be 212
		int length1= 8;
		int width1= 9;
		int depth1=2;
		Cuboid c3= new Cuboid(length1,width1,depth1);
		assertEquals( c3.area(),212,0);
	}
	@Test
	//ensures getters and setters work properly
	public void testGettersSettersCuboid() throws Exception {
		int length1= 75;
		int width1= 32;
		int depth1=93;
		Cuboid c9= new Cuboid(length1,width1,depth1);
		assertEquals(c9.getiWidth(),width1);
		assertEquals(c9.getiLength(),length1);
		assertEquals(c9.getiDepth(),depth1);
	}
	
	
	@Test (expected = UnsupportedOperationException.class)
	//checks that calling perimeter for cuboid results in an unsupported operation exception
	public void perimeterException() throws UnsupportedOperationException{
	  	
		Cuboid c9= new Cuboid(75,3,32);
		c9.perimeter();
	 
	}
	
	@Test (expected = IllegalArgumentException.class)
	//tests illegal argument exception for cuboid if a negative number is used
	public void testCuboidException() {
		
			Cuboid c8= new Cuboid(10,9,-18);
		
	}
	@Test
	public void sortAreaTest() throws Exception {
		//I created 7 cuboids, and this test should show that they will be sorted by area in ascending order
	ArrayList<Cuboid> cuboid_list= new ArrayList<Cuboid>();
		Cuboid c1= new Cuboid(1,2,3);
		Cuboid c2= new Cuboid (8,4,3);
		Cuboid c3=new Cuboid (1,4,3);
		Cuboid c4=new Cuboid (8,2,9);
		Cuboid c5=new Cuboid (8,10,9);
		Cuboid c6=new Cuboid (32,1,1);
		Cuboid c7= new Cuboid (1,2,5);
		cuboid_list.add(c1);
		cuboid_list.add(c2);
		cuboid_list.add(c3);
		cuboid_list.add(c4);
		cuboid_list.add(c5);
		cuboid_list.add(c6);
		cuboid_list.add(c7);
		
		System.out.println("Unordered Areas");
		printAreaCuboid(cuboid_list);
		Collections.sort(cuboid_list);
		
		System.out.println("After being sorted by area");
		printAreaCuboid(cuboid_list);
		
	}
	private static void printAreaCuboid(ArrayList<Cuboid> cuboid_list) {
		System.out.println("----------");
		for (Cuboid c:cuboid_list) {
			System.out.println(c.area());
		}
	}
	
	private static void printVolumeCuboid(ArrayList<Cuboid> cuboid_list) {
		System.out.println("----------");
		for (Cuboid c:cuboid_list) {
			System.out.println(c.volume());
		}
	}
	@Test
	public void sortVolumeTest() throws Exception {
		//tests to see if the same cuboids from above will be sorted by volume in ascending order
	ArrayList<Cuboid> cuboid_list= new ArrayList<Cuboid>();
		Cuboid c1= new Cuboid(1,2,3);
		Cuboid c2= new Cuboid (8,4,3);
		Cuboid c3=new Cuboid (1,4,3);
		Cuboid c4=new Cuboid (8,2,9);
		Cuboid c5=new Cuboid (8,10,9);
		Cuboid c6=new Cuboid (32,1,1);
		Cuboid c7= new Cuboid (1,2,5);
		cuboid_list.add(c1);
		cuboid_list.add(c2);
		cuboid_list.add(c3);
		cuboid_list.add(c4);
		cuboid_list.add(c5);
		cuboid_list.add(c6);
		cuboid_list.add(c7);
		
		System.out.println("Unordered Volumes");
		printVolumeCuboid(cuboid_list);
		Collections.sort(cuboid_list);
		
		System.out.println("After being sorted by volume");
		printVolumeCuboid(cuboid_list);
		
	}
}

	

