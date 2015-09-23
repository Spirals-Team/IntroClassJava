package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_003 mainClass = new digits_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public IntObj list_digits (IntObj num) throws Exception {
        IntObj i = new IntObj(), j = new IntObj();
        IntObj digit = new IntObj();
        j.value = 10;
        if(num.value == 0){
            output += (String.format("\n0"));
        }
        for(i.value = 10; Math.abs(num.value) > (i.value / 10); i.value*=10) {
            digit.value = num.value % i.value;
            if(Math.abs(digit.value) < 10){
                output += (String.format("\n%d", Math.abs(digit.value)));
            } else {
                digit.value = digit.value / j.value;
                digit.value = Math.floor(digit.value);
                if(Math.abs(num.value) == num.value){
                    output += (String.format("\n%d", digit.value));
                    j.value = j.value*10;
                } else {
                    if(Math.abs(num.value / 10) > (i.value / 10)){
                        output += (String.format("\n%d", Math.abs(digit.value)));
                        j.value = j.value*10;
                    } else {
                        output += (String.format("\n%d", digit.value));
                    }
                }
            }
        }
        return (0);
    }
    public void exec () throws Exception {
        IntObj num = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        list_digits(num);
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}