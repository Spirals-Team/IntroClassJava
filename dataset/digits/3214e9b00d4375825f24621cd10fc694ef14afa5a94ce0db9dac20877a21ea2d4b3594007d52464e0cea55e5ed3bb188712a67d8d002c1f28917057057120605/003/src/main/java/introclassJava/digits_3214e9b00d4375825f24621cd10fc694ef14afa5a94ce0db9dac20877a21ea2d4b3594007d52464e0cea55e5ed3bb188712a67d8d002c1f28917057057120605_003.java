package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_3214e9b00d4375825f24621cd10fc694ef14afa5a94ce0db9dac20877a21ea2d4b3594007d52464e0cea55e5ed3bb188712a67d8d002c1f28917057057120605_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_3214e9b00d4375825f24621cd10fc694ef14afa5a94ce0db9dac20877a21ea2d4b3594007d52464e0cea55e5ed3bb188712a67d8d002c1f28917057057120605_003 mainClass = new digits_3214e9b00d4375825f24621cd10fc694ef14afa5a94ce0db9dac20877a21ea2d4b3594007d52464e0cea55e5ed3bb188712a67d8d002c1f28917057057120605_003();
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
        IntObj userint = new IntObj(), remainder = new IntObj();
        output += (String.format("Enter an integer > "));
        userint.value = scanner.nextInt();
        output += (String.format("\n"));
        while(userint.value!=0){
            remainder.value = userint.value % 10;
            userint.value = (userint.value - remainder.value) / 10;
            if(userint.value < 0){
                remainder.value = ( - 1)*remainder.value;
            }
            output += (String.format("%d\n", remainder.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}