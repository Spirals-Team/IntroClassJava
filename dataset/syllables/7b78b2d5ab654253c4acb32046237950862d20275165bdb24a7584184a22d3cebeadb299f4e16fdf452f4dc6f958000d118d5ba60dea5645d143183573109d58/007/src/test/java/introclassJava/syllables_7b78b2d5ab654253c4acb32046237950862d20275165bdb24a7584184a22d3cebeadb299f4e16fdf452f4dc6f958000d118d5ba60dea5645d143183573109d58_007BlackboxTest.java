package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}