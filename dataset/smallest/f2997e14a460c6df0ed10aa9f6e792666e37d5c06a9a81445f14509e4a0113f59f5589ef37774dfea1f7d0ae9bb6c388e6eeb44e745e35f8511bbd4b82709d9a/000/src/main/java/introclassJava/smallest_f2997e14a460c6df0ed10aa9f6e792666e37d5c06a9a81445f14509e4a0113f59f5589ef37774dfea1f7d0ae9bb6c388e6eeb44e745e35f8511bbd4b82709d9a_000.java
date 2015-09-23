package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_f2997e14a460c6df0ed10aa9f6e792666e37d5c06a9a81445f14509e4a0113f59f5589ef37774dfea1f7d0ae9bb6c388e6eeb44e745e35f8511bbd4b82709d9a_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_f2997e14a460c6df0ed10aa9f6e792666e37d5c06a9a81445f14509e4a0113f59f5589ef37774dfea1f7d0ae9bb6c388e6eeb44e745e35f8511bbd4b82709d9a_000 mainClass = new smallest_f2997e14a460c6df0ed10aa9f6e792666e37d5c06a9a81445f14509e4a0113f59f5589ef37774dfea1f7d0ae9bb6c388e6eeb44e745e35f8511bbd4b82709d9a_000();
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
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 = new IntObj(), num4 = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if(num1.value < num2.value && num1.value < num3.value && num1.value < num4.value){
            output += (String.format("%d is the smallest\n", num1.value));
        } else if(num2.value < num1.value && num2.value < num3.value && num2.value < num4.value){
            output += (String.format("%d is the smallest\n", num2.value));
        }         else if(num3.value < num1.value && num3.value < num2.value && num3.value < num4.value){
            output += (String.format("%d is the smallest\n", num3.value));
        }         else if(num4.value < num1.value && num4.value < num2.value && num4.value < num3.value){
            output += (String.format("%d is the smallest\n", num4.value));
        }
        if(true)return;;
    }
}