package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002 mainClass = new syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002 mainClass = new syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002 mainClass = new syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002 mainClass = new syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002 mainClass = new syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002 mainClass = new syllables_f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_002();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}