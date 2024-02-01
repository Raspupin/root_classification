package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import grade_for_chars.App;

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion1A() 
	{
		//(0,1,2)
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
    public void testPartion1AAtMinimumBoundary() {
       
    }

    @Test
    public void testPartion1AJustAboveMinimumBoundary() {
        assertEquals("D", App.returnAGrade(61), "Grade just above the minimum boundary should be D");
    }

    @Test
    public void testPartion1AAtNominalValue() {
        assertEquals("D", App.returnAGrade(65), "Grade at the nominal value should be D");
    }

    @Test
    public void testPartion1AJustBelowMaximumBoundary() {
        assertEquals("D", App.returnAGrade(68), "Grade just below the maximum boundary should be D");
    }

    @Test
    public void ttestPartion1AAtMaximumBoundary() {
        assertEquals("D", App.returnAGrade(69), "Grade at the maximum boundary should be D");
    }
	
}
