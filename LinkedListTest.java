package prj5;

import student.TestCase;

public class LinkedListTest extends TestCase
{
    //fields
    private LinkedList<String> list;
    private String string1;
    private String string2;
    private String string3;
    private String string4;

    /**
     * sets up all the test
     */
    public void setUp() 
    {
        list = new LinkedList<String>();
        string1 = "My";
        string2 = "Mother";
        string3 = "is a";
        string4 = "fish.";
    }

    /**
     * tests Size
     */
    public void testSize() 
    {
        assertEquals(0, list.size());
        list.add(string1);
        assertEquals(1, list.size());
        list.add(string2);
        assertEquals(2, list.size());
    }

    /**
     * tests AddWithIndex
     */
    public void testAddWithIndex() 
    {
        assertTrue(list.isEmpty());
        list.add(0, string1);
        assertEquals(1, list.size());

        Exception exception = null;
        try {
            list.add(100, string2);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertNotNull(exception);

        Exception exception2 = null;
        try {
            list.add(0, null);
        }
        catch (IllegalArgumentException e) {
            exception2 = e;
        }
        assertNotNull(exception2);
        
        Exception exception3 = null;
        try {
            list.add(-1, string1);
        }
        catch (IndexOutOfBoundsException e) {
            exception3 = e;
        }
        assertNotNull(exception3);

        list.add(0, string3);
        assertEquals(2, list.size());
        assertEquals("is a", list.get(0));
        list.add(0, string4);
        assertEquals(3, list.size());
        assertEquals("fish.", list.get(0));
        
        list.remove(string1);
        list.remove(string4);
        list.remove(string3);
        
        
        list.add(0, string1);
        list.add(1, string2);
        list.add(2, string1);
        list.add(1, string4);
        assertEquals(4, list.size());
    }

    /**
     * tests Add
     */
    public void testAdd() 
    {
        assertTrue(list.isEmpty());
        list.add(string1);
        assertEquals("My", list.get(0));
        list.add(string2);
        assertEquals("Mother", list.get(1));
        list.add(string3);
        assertEquals("is a", list.get(2));
        list.add(string4);
        assertEquals("fish.", list.get(3));

        Exception exception = null;
        try {
            list.add(null);
        }
        catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);        
    }

    /**
     * tests IsEmpty
     */
    public void testIsEmpty() 
    {
        assertTrue(list.isEmpty());
        list.add(string3);
        assertFalse(list.isEmpty());
    }

    /**
     * tests Remove
     */
    public void testRemove() 
    {
        list.add(string1);
        assertFalse(list.isEmpty());
        assertTrue(list.remove(string1));
        list.add(string2);
        list.add(string3);
        assertFalse(list.remove(string4));
        assertTrue(list.remove(string2));
        assertTrue(list.remove(string3));
        
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        assertTrue(list.remove(string4));
        assertTrue(list.remove(string1));
        assertTrue(list.remove(string3));
        assertTrue(list.remove(string2));
        
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        assertTrue(list.remove(string3));       
    }

    /**
     * tests RemoveWithIndex
     */
    public void testRemoveWithIndex() 
    {
        list.add(string1);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
        list.add(string2);
        list.add(string3);
        list.remove(0);
        assertEquals("is a", list.get(0));
        list.remove(0);
        
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        
        list.remove(2);
        assertEquals(list.size(), 3);
        
        Exception exception = null;
        try {
            list.remove(-1);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertNotNull(exception);
        
        Exception exception1 = null;
        try {
            list.remove(100);
        }
        catch (IndexOutOfBoundsException x) {
            exception1 = x;
        }
        assertNotNull(exception1);
        
        list.remove(2);
        list.remove(1);
        list.remove(0);
        assertEquals(list.size(), 0);
    }

    /**
     * tests Get
     */
    public void testGet() 
    {
        list.add(string1);
        list.add(string2);
        assertEquals("Mother", list.get(1));
        assertEquals("My", list.get(0));
        Exception exception = null;
        try {
            list.get(100);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertNotNull(exception);
        
    }

    /**
     * testsContains
     */
    public void testContains() 
    {
        list.add(string1);
        list.add(string2);
        assertTrue(list.contains("My"));
        assertFalse(list.contains(string4));
    }

    /**
     * tests Clear
     */
    public void testClear() 
    {
        list.clear();
        assertEquals(0, list.size());
        list.add(string1);
        list.add(string2);
        assertEquals(2, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    /**
     * tests lastIndexOf
     */
    public void testLastIndexOf() 
    {
        list.add(string1);
        list.add(string2);
        list.add(string1);
        assertEquals(2, list.lastIndexOf(string1));
        assertEquals(1, list.lastIndexOf(string2));
        assertEquals(-1, list.lastIndexOf(string3));
    }

    /**
     * tests ToString
     */
    public void testToString() 
    {
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        assertEquals("{My, Mother, is a, fish.}", list.toString());
    }
}

