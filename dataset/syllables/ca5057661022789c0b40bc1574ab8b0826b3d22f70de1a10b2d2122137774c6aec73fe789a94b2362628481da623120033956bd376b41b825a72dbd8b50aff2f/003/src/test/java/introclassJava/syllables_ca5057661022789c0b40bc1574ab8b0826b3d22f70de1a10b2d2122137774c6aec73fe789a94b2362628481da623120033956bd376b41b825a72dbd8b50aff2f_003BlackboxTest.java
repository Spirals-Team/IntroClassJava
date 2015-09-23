package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}