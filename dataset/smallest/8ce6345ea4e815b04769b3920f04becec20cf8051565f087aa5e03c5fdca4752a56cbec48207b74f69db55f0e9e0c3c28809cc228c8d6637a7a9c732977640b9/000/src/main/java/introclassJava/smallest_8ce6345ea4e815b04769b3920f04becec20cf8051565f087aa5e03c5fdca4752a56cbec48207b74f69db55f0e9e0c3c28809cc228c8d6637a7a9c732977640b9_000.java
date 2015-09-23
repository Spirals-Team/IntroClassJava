package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000 mainClass = new smallest_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000();
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
        IntObj num1 = new IntObj();
        IntObj num2 = new IntObj();
        IntObj num3 = new IntObj();
        IntObj num4 = new IntObj();
        IntObj smallest = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if(num1.value < num2.value && num1.value < num3.value && num1.value < num4.value){
            smallest.value = num1.value;
        } else if(num2.value < num1.value && num2.value < num3.value && num2.value < num4.value){
            smallest.value = num2.value;
        }         else if(num3.value < num1.value && num3.value < num2.value && num3.value < num4.value){
            smallest.value = num3.value;
        }         else if(num4.value < num1.value && num4.value < num2.value && num4.value < num3.value){
            smallest.value = num4.value;
        }
        output += (String.format("%d is the smallest\n", smallest.value));
        if(true)return;;
    }
}