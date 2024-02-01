package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;
import org.junit.Test;


public class RootsTest 
{
	Roots root;


	@Test
    public void testPartion1AAtMinimumBoundary() {
		Roots.calculate_roots(0, 2, 2);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void testPartion1AJustAboveMinimumBoundary() {
    	Roots.calculate_roots(1, 2, 10);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void testPartion1ANominalValue() {
    	Roots.calculate_roots(40, 80, 1);
		
		String  root_expected = Root_Types.Equal_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void testPartion1AJustBelowMaximumBoundary() {
    	Roots.calculate_roots(99, 2, -1);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
    }

    @Test
    public void ttestPartion1AAtMaximumBoundary() {
    	Roots.calculate_roots(100, 200, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
    }
	
}
