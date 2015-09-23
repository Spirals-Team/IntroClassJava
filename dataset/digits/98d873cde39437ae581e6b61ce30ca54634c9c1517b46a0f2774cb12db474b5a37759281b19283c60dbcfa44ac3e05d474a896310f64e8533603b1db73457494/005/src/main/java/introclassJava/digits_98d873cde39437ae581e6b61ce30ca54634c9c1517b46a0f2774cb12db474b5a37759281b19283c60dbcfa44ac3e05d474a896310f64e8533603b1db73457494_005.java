package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_005 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_005 mainClass = new digits_98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_005();
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
        DoubleObj overflow = new DoubleObj();
        IntObj digit = new IntObj(), n = new IntObj(), m = new IntObj();
        output += (String.format("\nEnter an integer > "));
        overflow.value = scanner.nextDouble();
        digit.value = overflow.value;
        if(overflow.value > 2147483647){
            output += (String.format("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2"));
            output += (String.format("\nThat's all, have a nice day!\n"));
            if(true)return;;
        }
        if(overflow.value <  - 2147483647){
            output += (String.format("\n-2147483647"));
            output += (String.format("\nThat's all, have a nice day!\n"));
            if(true)return;;
        }
        if(digit.value == 0){
            output += (String.format("\n0"));
        }
        while(digit.value!=0){
            n.value = digit.value % 10;
            m.value = n.value;
            if(digit.value <  - 10){
                m.value = n.value* - 1;
            }
            digit.value = (digit.value - n.value) / 10;
            output += (String.format("\n%d", m.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}