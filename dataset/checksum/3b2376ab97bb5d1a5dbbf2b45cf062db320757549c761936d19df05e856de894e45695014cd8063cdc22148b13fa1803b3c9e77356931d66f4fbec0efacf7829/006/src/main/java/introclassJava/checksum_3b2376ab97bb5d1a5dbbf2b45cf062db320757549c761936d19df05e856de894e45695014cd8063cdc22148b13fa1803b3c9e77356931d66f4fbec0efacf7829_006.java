package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void scan_data (CharObj c) throws Exception {
        try {
            c.value = scanner.findInLine(".").charAt(0);
        } catch (java.lang.NullPointerException e) {
            c.value = '\n';
        };
    }
    public void add (IntObj i, CharObj c) throws Exception {
        i.value = *i.value + *c.value;
        if(i.value >= 256){
            i.value = 0;
        }
    }
    public void exec () throws Exception {
        IntObj i = new IntObj(0);
        CharObj c = new CharObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        scan_data(c);
        while(c.value!='\n'){
            add(i, c);
            scan_data(c);
        }
        i.value = (i.value % 64) + 32;
        output += (String.format("Check sum is %c\n", i.value));
        if(true)return;;
    }
}