package org.ip2027.tema01.printf;
/**
 * Ver en https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
 */
public class PrintfScientificNotationExample {
  /* Format float and double output with printf. */
  public static void main(String[] args) {
    double top    = 1234.12345;
    float  bottom = 1234.12345f;
    System.out.printf("%+.3e :: %.5e", top, bottom);
    /* Example prints: +1.234e+03 :: 1.23412e+03 */
    System.out.println();
    System.out.printf("Scientific notation:   %e\n", Math.PI);
    System.out.printf("Decimal    notation:   %f\n", Math.PI);
  
  }
}