package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new digits_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}