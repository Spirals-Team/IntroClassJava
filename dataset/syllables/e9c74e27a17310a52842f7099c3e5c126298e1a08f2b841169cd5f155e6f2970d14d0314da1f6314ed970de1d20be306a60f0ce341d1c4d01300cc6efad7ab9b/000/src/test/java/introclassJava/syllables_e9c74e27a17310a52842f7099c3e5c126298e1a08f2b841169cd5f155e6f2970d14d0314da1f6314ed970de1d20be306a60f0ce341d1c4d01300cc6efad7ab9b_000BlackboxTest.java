package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}