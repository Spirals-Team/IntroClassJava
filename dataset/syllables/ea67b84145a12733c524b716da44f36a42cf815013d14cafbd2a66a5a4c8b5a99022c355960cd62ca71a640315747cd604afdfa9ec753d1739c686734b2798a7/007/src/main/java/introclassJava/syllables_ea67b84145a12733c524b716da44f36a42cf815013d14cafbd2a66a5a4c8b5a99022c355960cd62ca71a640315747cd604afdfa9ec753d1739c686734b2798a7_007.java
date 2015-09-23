package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_ea67b84145a12733c524b716da44f36a42cf815013d14cafbd2a66a5a4c8b5a99022c355960cd62ca71a640315747cd604afdfa9ec753d1739c686734b2798a7_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_ea67b84145a12733c524b716da44f36a42cf815013d14cafbd2a66a5a4c8b5a99022c355960cd62ca71a640315747cd604afdfa9ec753d1739c686734b2798a7_007 mainClass = new syllables_ea67b84145a12733c524b716da44f36a42cf815013d14cafbd2a66a5a4c8b5a99022c355960cd62ca71a640315747cd604afdfa9ec753d1739c686734b2798a7_007();
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
        char[] ch = new char[21];
        IntObj k = new IntObj(), syll = new IntObj();
        output += (String.format("Please enter a string > "));
        ch = (scanner.nextLine() + "\n").toCharArray();
        syll.value = 0;
        for(k.value = 0; k.value < (ch.length + 1); k.value++) {
            if(ch[k.value] == 'a' || ch[k.value] == 'e' || ch[k.value] == 'i' || ch[k.value] == 'o' || ch[k.value] == 'u' || ch[k.value] == 'y'){
                syll.value = syll.value + 1;
            }
        }
        output += (String.format("The number of syllables is %d.\n", syll.value));
        if(true)return;;
    }
}