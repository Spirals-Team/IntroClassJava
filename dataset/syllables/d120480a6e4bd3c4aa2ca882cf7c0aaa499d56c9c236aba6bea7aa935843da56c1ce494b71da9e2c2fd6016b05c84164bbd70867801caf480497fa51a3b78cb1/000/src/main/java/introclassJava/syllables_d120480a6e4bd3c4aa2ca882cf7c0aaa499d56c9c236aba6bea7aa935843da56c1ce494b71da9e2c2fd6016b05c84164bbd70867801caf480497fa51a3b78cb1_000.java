package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000 mainClass = new syllables_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int STR_LEN = 21;
    public void exec () throws Exception {
        char[] word = new char[STR_LEN];
        IntObj i = new IntObj(), count = new IntObj();
        count.value = 0;
        output += (String.format("Please enter a string > "));
        word = scanner.next().toCharArray();
        for(i.value = 0; i.value <= STR_LEN - 1; i.value++) {
            if(word[i.value] == 'a' || word[i.value] == 'e' || word[i.value] == 'i' || word[i.value] == 'o' || word[i.value] == 'u' || word[i.value] == 'y'){
                count.value = count.value + 1;
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}