package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_003();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}