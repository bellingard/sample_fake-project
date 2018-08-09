package bar;

/**
 * Simple class
 * TODO
 */
public class Simplest {
    
    public int i;

    public static int add(int a, int b) {
    	// introduce a variable that is not needed - just to get a violation
    	int result = a + b;

    	System.out.println("");

        return result;
    }

}
