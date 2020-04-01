package bar;

/**
 * Simple class
 */
public class Simplest {

    public int AAA;
    
    public static int add(int a, int b) {
    	System.out.println("");
        
    	// introduce a variable that is not needed - just to get a violation
    	int result = a + b;

    	System.out.println("");

        return result;
    }

}
