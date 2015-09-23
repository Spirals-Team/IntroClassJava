package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_011 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_011 mainClass = new median_68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_011();
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
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        if((x.value >= y.value && x.value <= z.value) || (x.value <= y.value && x.value >= z.value)){
            output += (String.format("%d is the median\n", x.value));
        } else if((y.value >= x.value && y.value <= z.value) || (y.value <= x.value && y.value >= z.value)){
            output += (String.format("%d is the median\n", y.value));
        }         else {
            output += (String.format("%d is the median\n", z.value));
        }
        if(true)return;;
    }
}