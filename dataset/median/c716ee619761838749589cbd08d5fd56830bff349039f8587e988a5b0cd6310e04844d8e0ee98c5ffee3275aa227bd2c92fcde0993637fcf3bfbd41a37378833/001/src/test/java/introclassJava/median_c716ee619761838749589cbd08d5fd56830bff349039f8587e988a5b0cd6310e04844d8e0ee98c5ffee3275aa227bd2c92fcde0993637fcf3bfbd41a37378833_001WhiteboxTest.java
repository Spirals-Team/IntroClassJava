package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001WhiteboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001();
		String expected = "Please enter 3 numbers separated by spaces > 0 is the median";
		mainClass.scanner = new java.util.Scanner("0 0 0");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001();
		String expected = "Please enter 3 numbers separated by spaces > 1 is the median";
		mainClass.scanner = new java.util.Scanner("2 0 1");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001();
		String expected = "Please enter 3 numbers separated by spaces > 0 is the median";
		mainClass.scanner = new java.util.Scanner("0 0 1");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001();
		String expected = "Please enter 3 numbers separated by spaces > 0 is the median";
		mainClass.scanner = new java.util.Scanner("0 1 0");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001();
		String expected = "Please enter 3 numbers separated by spaces > 1 is the median";
		mainClass.scanner = new java.util.Scanner("0 2 1");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_001();
		String expected = "Please enter 3 numbers separated by spaces > 2 is the median";
		mainClass.scanner = new java.util.Scanner("0 2 3");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}