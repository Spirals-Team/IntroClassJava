package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003 mainClass = new checksum_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void scan_data (CharObj char1) throws Exception {
        try {
            &*char1.value = scanner.findInLine(".").charAt(0);
        } catch (java.lang.NullPointerException e) {
            &*char1.value = '\n';
        };
    }
    public void sum_data (CharObj char1, IntObj accumulator) throws Exception {
        accumulator.value = *accumulator.value + (int)char1.value;
    }
    public void conversion (IntObj accumulator, IntObj remainder) throws Exception {
        IntObj i = new IntObj();
        i.value = accumulator.value / 64;
        remainder.value = accumulator.value - (64*i.value);
    }
    public void exec () throws Exception {
        IntObj accumulator = new IntObj(0);
        IntObj remainder = new IntObj();
        CharObj input = new CharObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        while(true){
            scan_data(input);
            sum_data(input, accumulator);
            if(input.value == '\n'){
                break;
            }
        }
        conversion(accumulator, remainder);
        remainder.value = remainder.value + 22;
        input.value = (char)remainder.value;
        output += (String.format("Check sum is %c\n", input.value));
        if(true)return;;
    }
}