package org.ip2027.tema01.printf;

/**
 * Ver en https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
 */

public class FormatOutputJavaPrintf {
	/* Simple Java printf String example. */
	public static void main(String[] args) {
		String name = "Cameron";
		String site = "TechTarget";
		System.out.printf("I like the stuff %s writes on %S. %n", name, site);
		/* Printf output: I like the stuff Cameron writes on TECHTARGET. */
	}
}