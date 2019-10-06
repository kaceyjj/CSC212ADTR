package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	@Test
	public void testPut() {
		MapADT<String, String> shoes = new JavaMap<>();
		shoes.put("raspberry", "fruit");
		shoes.put("orange", "fruit");
		shoes.put("carrot", "vegetable"); 
		
		//replace fruit with vegetable
		assertEquals(shoes.get("orange"), "fruit"); 
		assertEquals(shoes.get("carrot"), "vegetable");
		
	}
	@Test
	public void testNumGet() {
		MapADT<Integer, Integer> squares = new JavaMap<>();
		squares.put(1, 1);
		squares.put(2, 4);
		squares.put(3, 9);
		// ambiguous
		//assertEquals (int, int)
		// assertEquals (Object, Object)
		// assertEquals(squares.get(2), 4)
		
		//solutions
		assertIntEq(squares.get(2), 4);
		assertEquals(squares.get(2), (Integer) 4);
		assertIntEq(squares.get(2), 4);
		
	}
	@Test
	public void testSize() {
		MapADT<String, String> single = new JavaMap<>();
		single.put("0", "1");
		assertEquals(1, single.size());
		assertEquals(single.size(), 1);
		
	}
	@Test
	public void testRemove() {
		MapADT<String, String> list = new JavaMap<>();
		list.put("8", "18");
		list.put("4", "14");
		list.put("5", "15");
		list.remove("4"); //only need to remove the key
		assertEquals(3, list.size());
		
		
		
	}
}
