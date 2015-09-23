package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_007 mainClass = new checksum_ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_007();
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
        CharObj x = new CharObj();
        IntObj rem = new IntObj();
        IntObj sum = new IntObj();
        IntObj checksum = new IntObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        try {
            x.value = scanner.findInLine(".").charAt(0);
        } catch (java.lang.NullPointerException e) {
            x.value = '\n';
        };
        sum.value = 0;
        while(x.value!='\n'){
            sum.value = sum.value + x.value;
            try {
                x.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                x.value = '\n';
            };
        }
        rem.value = sum.value % 64;
        checksum.value = rem.value + ' ';
        output += (String.format("Check sum is %c\n", checksum.value));
        if(true)return;;
    }
}