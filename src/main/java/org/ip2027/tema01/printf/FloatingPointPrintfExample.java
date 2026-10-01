package org.ip2027.tema01.printf;
/**
 * Ver en https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
 */
public class FloatingPointPrintfExample {
  /* Format float and double output with printf. */
  public static void main(String[] args) {
    double top    = 1234.12345;
    float  bottom = 1234.12345f;
    System.out.printf("%+,.3f :: %,.5f", top, bottom);
    /* Example prints: +1,234.123 :: 1234.12345 */
  }
}