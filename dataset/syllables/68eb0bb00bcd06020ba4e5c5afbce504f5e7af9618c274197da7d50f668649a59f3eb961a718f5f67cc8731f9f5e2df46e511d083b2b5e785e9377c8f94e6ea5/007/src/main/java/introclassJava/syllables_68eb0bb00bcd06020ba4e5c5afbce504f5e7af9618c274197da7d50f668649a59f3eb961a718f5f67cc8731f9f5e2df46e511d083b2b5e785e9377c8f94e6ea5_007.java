package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_007 mainClass = new syllables_68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_007();
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
        char[] x = new char[21];
        IntObj count = new IntObj(), vowel = new IntObj();
        count.value = 0;
        output += (String.format("Please enter a string > "));
        x = scanner.next().toCharArray();
        vowel.value = 0;
        while(x[vowel.value]!='\0'){
            if(x[vowel.value] == 'a'){
                count.value++;
            }
            if(x[vowel.value] == 'e'){
                count.value++;
            }
            if(x[vowel.value] == 'i'){
                count.value++;
            }
            if(x[vowel.value] == 'o'){
                count.value++;
            }
            if(x[vowel.value] == 'u'){
                count.value++;
            }
            if(x[vowel.value] == 'y'){
                count.value++;
            }
            vowel.value++;
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}