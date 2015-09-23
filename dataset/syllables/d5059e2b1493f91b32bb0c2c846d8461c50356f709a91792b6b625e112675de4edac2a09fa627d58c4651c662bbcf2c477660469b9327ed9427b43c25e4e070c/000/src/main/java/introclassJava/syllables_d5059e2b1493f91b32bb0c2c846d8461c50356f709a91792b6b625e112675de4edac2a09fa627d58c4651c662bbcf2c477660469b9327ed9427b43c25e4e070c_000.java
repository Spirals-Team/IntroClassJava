package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000 mainClass = new syllables_d5059e2b1493f91b32bb0c2c846d8461c50356f709a91792b6b625e112675de4edac2a09fa627d58c4651c662bbcf2c477660469b9327ed9427b43c25e4e070c_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        char[] list = new char[21];
        IntObj i = new IntObj(0), counter = new IntObj(0), totChar = new IntObj();
        output += (String.format("Please enter a string > "));
        list = scanner.next().toCharArray();
        totChar.value = list.length;
        while(i.value < totChar.value){
            if((list[i.value] == 'i') || (list[i.value] == 'a') || (list[i.value] == 'e') || (list[i.value] == 'o') || (list[i.value] == 'u') || (list[i.value] == 'y')){
                counter.value = counter.value + 1;
            }
            i.value++;
        }
        output += (String.format("The number of syllables is %d.\n", counter.value));
        if(true)return;;
    }
}