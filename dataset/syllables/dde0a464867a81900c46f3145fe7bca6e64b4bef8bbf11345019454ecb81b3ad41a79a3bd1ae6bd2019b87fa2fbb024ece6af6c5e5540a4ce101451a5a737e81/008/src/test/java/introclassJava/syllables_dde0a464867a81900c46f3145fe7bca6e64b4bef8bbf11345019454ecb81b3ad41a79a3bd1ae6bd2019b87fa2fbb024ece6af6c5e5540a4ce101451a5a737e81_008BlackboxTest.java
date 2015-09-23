package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}