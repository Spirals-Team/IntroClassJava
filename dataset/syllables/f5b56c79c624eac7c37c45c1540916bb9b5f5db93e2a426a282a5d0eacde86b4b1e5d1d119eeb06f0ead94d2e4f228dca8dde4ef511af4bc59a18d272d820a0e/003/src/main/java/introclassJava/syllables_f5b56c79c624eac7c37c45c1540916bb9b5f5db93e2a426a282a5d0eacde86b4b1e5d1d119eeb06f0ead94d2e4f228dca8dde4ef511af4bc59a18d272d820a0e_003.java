package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_003 mainClass = new syllables_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int LENGTH = 20;
    public void exec () throws Exception {
        char[] in = new char[LENGTH];
        IntObj len = new IntObj(), vowels = new IntObj(0), i = new IntObj();
        output += (String.format("Please enter a string > "));
        in = scanner.next().toCharArray();
        len.value = in.length;
        for(i.value = 0; i.value < len.value; i.value++) {
            if(in[i.value] == *("a") || in[i.value] == *("e") || in[i.value] == *("i") || in[i.value] == *("o") || in[i.value] == *("u") || in[i.value] == *("y")){
                vowels.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", vowels.value));
        if(true)return;;
    }
}