package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is -";
		mainClass.scanner = new java.util.Scanner("1234567890");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is I";
		mainClass.scanner = new java.util.Scanner("abcefghi");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is K";
		mainClass.scanner = new java.util.Scanner(")(*&^%$#");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is E";
		mainClass.scanner = new java.util.Scanner("abc 123 %^&");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is 2";
		mainClass.scanner = new java.util.Scanner("~+{\"s1213skane");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is '";
		mainClass.scanner = new java.util.Scanner("ASDF_1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}