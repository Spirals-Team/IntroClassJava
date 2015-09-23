package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is -";
		mainClass.scanner = new java.util.Scanner("1234567890");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is I";
		mainClass.scanner = new java.util.Scanner("abcefghi");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is K";
		mainClass.scanner = new java.util.Scanner(")(*&^%$#");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is E";
		mainClass.scanner = new java.util.Scanner("abc 123 %^&");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is 2";
		mainClass.scanner = new java.util.Scanner("~+{\"s1213skane");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is '";
		mainClass.scanner = new java.util.Scanner("ASDF_1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}