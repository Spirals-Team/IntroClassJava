package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_003 mainClass = new checksum_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_003();
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
        CharObj stuff = new CharObj();
        IntObj sum = new IntObj(0);
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        try {
            stuff.value = scanner.findInLine(".").charAt(0);
        } catch (java.lang.NullPointerException e) {
            stuff.value = '\n';
        };
        while(stuff.value!='\n'){
            sum.value+=(int)stuff.value;
            try {
                stuff.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                stuff.value = '\n';
            };
        }
        sum.value = sum.value % 64 + (int)' ';
        output += (String.format("Check sum is %c\n", (char)sum.value));
        if(true)return;;
    }
}