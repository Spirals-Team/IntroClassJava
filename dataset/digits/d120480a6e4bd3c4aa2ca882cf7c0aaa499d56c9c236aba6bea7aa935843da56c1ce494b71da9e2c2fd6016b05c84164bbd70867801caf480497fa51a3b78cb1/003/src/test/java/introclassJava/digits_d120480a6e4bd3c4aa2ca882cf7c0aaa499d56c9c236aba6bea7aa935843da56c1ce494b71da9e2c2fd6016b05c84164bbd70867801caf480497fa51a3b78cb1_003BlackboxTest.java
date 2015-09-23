package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_003();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}