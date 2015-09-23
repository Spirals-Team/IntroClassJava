package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_009 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_009 mainClass = new digits_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_009();
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
        IntObj n = new IntObj(), digit = new IntObj(), neg = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        if(n.value < 1){
            neg.value = 1;
        }
        while(n.value == 0){
            output += (String.format("\n%d", n.value));
            break;
        }
        digit.value = 0;
        while(n.value!=0){
            digit.value = n.value % 10;
{
                if((neg.value) && (Math.abs(n.value) < 10)){
                    output += (String.format("\n%d", digit.value));
                }
                if((neg.value) && (Math.abs(n.value) >= 10)){
                    output += (String.format("\n%d", digit.value / ( - 1)));
                }
                if(!neg.value){
                    output += (String.format("\n%d", digit.value));
                }
            }            n.value = (n.value - digit.value) / 10;
        }
        output += (String.format("\nThat's all, have a nice day!"));
        if(true)return;;
    }
}