package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}