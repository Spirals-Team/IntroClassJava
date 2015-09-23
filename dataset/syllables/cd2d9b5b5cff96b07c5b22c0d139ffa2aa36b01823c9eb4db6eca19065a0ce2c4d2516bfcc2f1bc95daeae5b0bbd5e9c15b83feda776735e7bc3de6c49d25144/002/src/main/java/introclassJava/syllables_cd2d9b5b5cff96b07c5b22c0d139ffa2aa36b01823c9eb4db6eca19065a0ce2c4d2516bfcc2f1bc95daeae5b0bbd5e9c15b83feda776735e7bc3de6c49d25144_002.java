package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_002 mainClass = new syllables_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_002();
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
        output += (String.format("Please enter a string >"));
        output += (String.format("The number of syllables is 4"));
        if(true)return;;
    }
}