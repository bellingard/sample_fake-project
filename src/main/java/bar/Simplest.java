package bar;

/**
 * Simple class
 */
public class Simplest {

    public int FOO = 2;
    
    public static int add(int a, int b) {
    	// introduce a variable that is not needed - just to get a violation
    	int result = a + b;

    	System.out.println("");

        return result;
    }

}
