package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is -";
		mainClass.scanner = new java.util.Scanner("1234567890");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is I";
		mainClass.scanner = new java.util.Scanner("abcefghi");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is K";
		mainClass.scanner = new java.util.Scanner(")(*&^%$#");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is E";
		mainClass.scanner = new java.util.Scanner("abc 123 %^&");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is 2";
		mainClass.scanner = new java.util.Scanner("~+{\"s1213skane");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_003();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is '";
		mainClass.scanner = new java.util.Scanner("ASDF_1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}