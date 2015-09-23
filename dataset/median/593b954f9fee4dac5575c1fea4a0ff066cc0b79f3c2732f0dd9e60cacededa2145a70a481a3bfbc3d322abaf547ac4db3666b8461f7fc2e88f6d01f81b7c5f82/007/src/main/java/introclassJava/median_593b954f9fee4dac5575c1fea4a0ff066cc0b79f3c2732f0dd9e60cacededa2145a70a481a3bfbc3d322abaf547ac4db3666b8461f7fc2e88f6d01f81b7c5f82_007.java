package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_007 mainClass = new median_593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_007();
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
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 = new IntObj(), median = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        if((num1.value > num2.value && num1.value < num3.value) || (num1.value < num2.value && num1.value > num3.value)){
            median.value = num1.value;
        } else if((num2.value > num1.value && num2.value < num3.value) || (num2.value < num1.value && num2.value > num3.value)){
            median.value = num2.value;
        }         else if((num3.value > num1.value && num3.value < num2.value) || (num3.value < num1.value && num3.value > num2.value)){
            median.value = num3.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if(true)return;;
    }
}