package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
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
        char[] myString = new char[21];
        IntObj letter = new IntObj(), counter = new IntObj(0);
        output += (String.format("Please enter a string > "));
        myString = scanner.next().toCharArray();
        for(letter.value = 0; myString[letter.value]!='\0'; letter.value++) {
            if((myString[letter.value] == 'a') || (myString[letter.value] == 'e') || (myString[letter.value] == 'i') || (myString[letter.value] == 'o') || (myString[letter.value] == 'u') || (myString[letter.value] == 'y')){
                counter.value = counter.value + 1;
            }
        }
        output += (String.format("The number of syllables is %d.\n", counter.value));
        if(true)return;;
    }
}