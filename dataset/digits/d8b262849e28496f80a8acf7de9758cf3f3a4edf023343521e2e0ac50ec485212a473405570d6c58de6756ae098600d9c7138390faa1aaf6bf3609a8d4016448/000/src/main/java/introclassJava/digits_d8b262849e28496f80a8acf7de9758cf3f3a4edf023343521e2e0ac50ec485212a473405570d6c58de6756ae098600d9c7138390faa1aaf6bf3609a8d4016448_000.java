package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_000 mainClass = new digits_d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_000();
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
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        do {
            output += (String.format("\n%d", num.value % 10));
            num.value/=10;
        } while(num.value > 0);
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}