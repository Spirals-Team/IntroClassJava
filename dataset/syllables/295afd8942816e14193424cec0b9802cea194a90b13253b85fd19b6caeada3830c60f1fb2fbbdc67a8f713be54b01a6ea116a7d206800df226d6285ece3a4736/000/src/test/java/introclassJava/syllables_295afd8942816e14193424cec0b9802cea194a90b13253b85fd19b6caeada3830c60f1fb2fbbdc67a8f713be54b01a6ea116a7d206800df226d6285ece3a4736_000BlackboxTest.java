package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new syllables_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}