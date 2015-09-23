package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003 mainClass = new syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003 mainClass = new syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003 mainClass = new syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003 mainClass = new syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003 mainClass = new syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003 mainClass = new syllables_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_003();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}