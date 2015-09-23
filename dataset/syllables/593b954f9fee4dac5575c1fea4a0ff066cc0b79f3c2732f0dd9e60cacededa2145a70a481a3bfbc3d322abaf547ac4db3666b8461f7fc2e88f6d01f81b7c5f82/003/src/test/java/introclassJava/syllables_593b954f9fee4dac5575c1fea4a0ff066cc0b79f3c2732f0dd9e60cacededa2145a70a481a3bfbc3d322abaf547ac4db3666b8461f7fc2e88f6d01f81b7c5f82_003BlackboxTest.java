package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003 mainClass = new syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003 mainClass = new syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003 mainClass = new syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003 mainClass = new syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003 mainClass = new syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003 mainClass = new syllables_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}