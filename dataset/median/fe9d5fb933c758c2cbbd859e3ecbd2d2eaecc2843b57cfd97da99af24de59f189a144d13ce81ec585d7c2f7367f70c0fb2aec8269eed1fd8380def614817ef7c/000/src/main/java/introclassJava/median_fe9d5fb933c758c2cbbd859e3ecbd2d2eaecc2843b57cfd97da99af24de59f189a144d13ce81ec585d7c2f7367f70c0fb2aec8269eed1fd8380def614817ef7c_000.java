package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000 mainClass = new median_fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000();
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
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 = new IntObj(), median = new IntObj(), big = new IntObj(), small = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        if(num1.value > num2.value){
            small.value = num2.value;
            big.value = num1.value;
        } else {
            big.value = num2.value;
            small.value = num2.value;
        }
        if(num3.value > big.value){
            median.value = big.value;
        } else if(num3.value < small.value){
            median.value = small.value;
        }         else {
            median.value = num3.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if(true)return;;
    }
}