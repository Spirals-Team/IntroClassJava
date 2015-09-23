package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_3214e9b00d4375825f24621cd10fc694ef14afa5a94ce0db9dac20877a21ea2d4b3594007d52464e0cea55e5ed3bb188712a67d8d002c1f28917057057120605_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_3214e9b00d4375825f24621cd10fc694ef14afa5a94ce0db9dac20877a21ea2d4b3594007d52464e0cea55e5ed3bb188712a67d8d002c1f28917057057120605_003 mainClass = new checksum_3214e9b00d4375825f24621cd10fc694ef14afa5a94ce0db9dac20877a21ea2d4b3594007d52464e0cea55e5ed3bb188712a67d8d002c1f28917057057120605_003();
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
        IntObj remainder = new IntObj(), intsum = new IntObj(0), i = new IntObj();
        char[] userinput = new char[2000];
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        &userinput = scanner.next().toCharArray();
        for(i.value = 0; userinput[i.value]!=0; i.value++) {
            intsum.value = intsum.value + userinput[i.value];
        }
        remainder.value = intsum.value % 64;
        remainder.value = remainder.value + 32;
        output += (String.format("Check sum is %c\n", remainder.value));
        if(true)return;;
    }
}