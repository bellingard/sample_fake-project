package foo;

import bar.Simplest;

/**
 * Foo class :)
 */
public class Foo {

    private static int m;
    
    public static int times(int a, int b) {
    	// Use Simplest to introduce a dependency
    	int i = Simplest.add(5, 6);
        
        // pouet! :)
        float f;
        
        return a * b * m;  
    }

}
