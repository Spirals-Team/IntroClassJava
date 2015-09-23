package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000 mainClass = new digits_d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000();
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
        IntObj n = new IntObj(), digit = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        while(n.value!=0){
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if((digit.value < 0) && (n.value == 0)){
                output += (String.format("%d\n", digit.value));
            } else {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
        }
        if(true)return;;
    }
}