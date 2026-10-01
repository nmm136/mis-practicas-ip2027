package org.ip2027.tema01.printf;
/**
 * Ver en https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
 */
public class PrintfCharBooleanExample {
  /* Boolean char Java printf example. */
  public static void main(String[] args) {
    boolean flag = false;
    char coal = (char) 1234.12345f;
    System.out.printf("%B :: %c :: %C", flag, coal, '\u0077');
    /* Example prints: FALSE :: a :: W */
  }
}