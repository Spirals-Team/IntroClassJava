package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new syllables_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int smax = 20;
    public void exec () throws Exception {
        IntObj i = new IntObj(0), scount = new IntObj(0);
        char[] word = new char[smax];
        output += (String.format("Please enter a string > "));
        word = (scanner.nextLine() + "\n").toCharArray();
        while(i.value < 18){
            if((word[i.value] == 'a') || (word[i.value] == 'e') || (word[i.value] == 'i') || (word[i.value] == 'o') || (word[i.value] == 'u') || (word[i.value] == 'y')){
                scount.value = scount.value + 1;
            }
            i.value = i.value + 1;
        }
        output += (String.format("The number of syllables is %d.\n", scount.value));
        if(true)return;;
    }
}