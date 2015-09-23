package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_006 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_006 mainClass = new checksum_cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_006();
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
        IntObj num = new IntObj();
        CharObj i = new CharObj();
        CharObj finall = new CharObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        try {
            i.value = scanner.findInLine(".").charAt(0);
        } catch (java.lang.NullPointerException e) {
            i.value = '\n';
        };
        num.value = i.value;
        while(i.value!='\n'){
            try {
                i.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                i.value = '\n';
            };
            if(i.value!='\n'){
                num.value+=i.value;
            }
        }
        finall = num.value % 64;
        finall+=' ';
        output += (String.format("Check sum is %c\n", finall));
        if(true)return;;
    }
}