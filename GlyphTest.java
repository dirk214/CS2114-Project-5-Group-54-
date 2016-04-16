package prj5;

import student.TestCase;

public class GlyphTest extends TestCase
{
    /**
     * test Glyph
     */
    private Glyph glyph;
    
    /**
     * sets up all the tests for glyph
     */
    public void setUp()
    {
        glyph = new Glyph(200, 200);
    }
    
    /**
     * tests the getX() method
     */
    public void testGetX()
    {
        assertEquals(glyph.getX(), 200);
    }
    
    /**
     * tests the getY() method
     */
    public void testGetY()
    {
        assertEquals(glyph.getY(), 200);
    }
}
