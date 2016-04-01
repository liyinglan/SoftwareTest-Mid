import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class TriangleTest {

	private Triangle triangle;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		triangle = new Triangle(5, -1, -1);
		assertEquals(false, triangle.isTriangle(triangle));
		
		triangle = new Triangle(1, 2, 3);
		assertEquals(false, triangle.isTriangle(triangle));
		assertThat("Illegal", equalTo(triangle.getType(triangle)));
		
		triangle = new Triangle(2, 3, 1);
		assertEquals(false, triangle.isTriangle(triangle));
		
		triangle = new Triangle(4, 1, 5);
		assertEquals(false, triangle.isTriangle(triangle));
		
		triangle = new Triangle(3, 4, 5);
		assertEquals(true, triangle.isTriangle(triangle));
		assertThat("Scalene", equalTo(triangle.getType(triangle)));
		
		triangle = new Triangle(3, 3, 3);
		assertThat("Regular", equalTo(triangle.getType(triangle)));
		
		triangle = new Triangle(4, 5, 5);
		assertThat("Isosceles", equalTo(triangle.getType(triangle)));
		
		triangle = new Triangle(5, 4, 5);
		assertThat("Isosceles", equalTo(triangle.getType(triangle)));
		
		triangle = new Triangle(4, 4, 5);
		assertThat("Isosceles", equalTo(triangle.getType(triangle)));
		
		long[] borders = {4, 4, 5};
		
		assertThat(borders, equalTo(triangle.getBorders()));
	}

}
