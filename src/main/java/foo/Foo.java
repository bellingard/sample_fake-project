package foo;

import bar.Simplest;

/**
 * Foo class
 */
public class Foo {

    public static int times(int a, int b) {
    	// Use Simplest to introduce a dependency
    	int i = Simplest.add(5, 6);
      return a * b;
    }

    public static int boum() {
    	// Use Simplest to introduce a dependency
    	int i = Simplest.add(5, 6);
      // TODO not really good, is it?
      return i;
    }

}
