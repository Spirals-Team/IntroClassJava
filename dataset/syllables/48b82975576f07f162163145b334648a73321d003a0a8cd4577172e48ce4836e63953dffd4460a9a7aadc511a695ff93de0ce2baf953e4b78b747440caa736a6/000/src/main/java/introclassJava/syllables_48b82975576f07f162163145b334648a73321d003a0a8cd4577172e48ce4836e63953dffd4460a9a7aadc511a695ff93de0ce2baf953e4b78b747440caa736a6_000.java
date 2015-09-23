package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_000 mainClass = new syllables_48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int leng = 20;
    public void exec () throws Exception {
        char[] word = new char[leng];
        IntObj i = new IntObj(), sy = new IntObj();
        sy.value = 0;
        output += (String.format("Please enter a string > "));
        word = (scanner.nextLine() + "\n").toCharArray();
        for(i.value = 0; i.value < word.length; ++i.value) {
            if((word[i.value] == 'a') || (word[i.value] == 'e') || (word[i.value] == 'i') || (word[i.value] == 'o') || (word[i.value] == 'u') || (word[i.value] == 'y')){
                sy.value+=1;
            }
        }
        output += (String.format("The number of syllables is %d.\n", sy.value));
        if(true)return;;
    }
}