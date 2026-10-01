package org.ip2027.tema01.printf;
/**
 * Ver en https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
 */
public class JavaPrintfInteger {
	  /* Format integer output with Java printf */
	  public static void main(String[] args) {
	    int  above = -98765;
	    long below =  54321L;
	    System.out.printf("%,d :: %d", above, below);
	    /* Example prints: -00098,765 :: +54,321  */
	  }
	}
