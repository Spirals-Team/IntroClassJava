package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}