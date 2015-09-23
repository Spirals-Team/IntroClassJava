package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
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
        CharObj orig = new CharObj();
        IntObj code = new IntObj(), accum = new IntObj();
        CharObj checksum = new CharObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        accum.value = 0;
        checksum.value = 0;
        code.value = 0;
        orig.value = ' ';
        do {
            try {
                orig.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                orig.value = '\n';
            };
            if(orig.value!='\n'){
                code.value = (int)orig.value;
                accum.value+=code.value;
            }
        } while(orig.value!='\n');
        checksum.value = (char) ((accum.value % 64) + 32);
        output += (String.format("Check sum is %c\n", checksum.value));
        if(true)return;;
    }
}