package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_002 mainClass = new checksum_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_002();
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
        CharObj letter = new CharObj();
        IntObj sumsofar = new IntObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        sumsofar.value = 0;
        while(letter.value!='\n'){
            try {
                letter.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                letter.value = '\n';
            };
            findsum(letter, sumsofar);
        }
        addspace(sumsofar);
        output += (String.format("Check sum is %c\n", (char) (sumsofar.value)));
        if(true)return;;
    }
    public void findsum (CharObj letter, IntObj sum) throws Exception {
        sum.value = ((int)letter.value) + *sum.value;
    }
    public void addspace (IntObj finalresult) throws Exception {
        IntObj mod = new IntObj();
        mod.value = *finalresult.value % 64;
        finalresult.value = ((int)' ') + (mod.value - 10);
    }
}