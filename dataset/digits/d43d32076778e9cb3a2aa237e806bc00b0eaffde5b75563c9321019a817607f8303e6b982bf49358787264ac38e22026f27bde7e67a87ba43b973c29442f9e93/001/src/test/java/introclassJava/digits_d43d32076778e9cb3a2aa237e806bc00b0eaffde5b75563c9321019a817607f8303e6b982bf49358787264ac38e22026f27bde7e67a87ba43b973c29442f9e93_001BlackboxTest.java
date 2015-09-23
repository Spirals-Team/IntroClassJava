package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}