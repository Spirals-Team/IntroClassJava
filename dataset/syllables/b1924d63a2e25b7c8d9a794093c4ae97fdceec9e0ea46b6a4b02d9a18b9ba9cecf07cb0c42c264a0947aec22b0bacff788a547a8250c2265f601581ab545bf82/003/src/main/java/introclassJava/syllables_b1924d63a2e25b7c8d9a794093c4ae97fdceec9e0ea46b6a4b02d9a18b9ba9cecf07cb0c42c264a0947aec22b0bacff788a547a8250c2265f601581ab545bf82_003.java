package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_003 mainClass = new syllables_b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int LINE_LEN = 20;
    public void exec () throws Exception {
        char[] string = new char[LINE_LEN];
        IntObj len = new IntObj(), i = new IntObj(), total = new IntObj();
        output += (String.format("\nPlease enter a string > "));
        string = (scanner.nextLine() + "\n").toCharArray();
        total.value = 0;
        len.value = string.length;
        for(i.value = 0; i.value <= len.value - 1; i.value++) {
            if((string[i.value] == 'a') || (string[i.value] == 'e') || (string[i.value] == 'i') || (string[i.value] == 'o') || (string[i.value] == 'u') || (string[i.value] == 'y') || (string[i.value] == 'A') || (string[i.value] == 'E') || (string[i.value] == 'I') || (string[i.value] == 'O') || (string[i.value] == 'U') || (string[i.value] == 'Y')){
                total.value = total.value + 1;
            }
        }
        output += (String.format("The number of syllables is %d\n", total.value));
        if(true)return;;
    }
}