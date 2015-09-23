package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001 mainClass = new digits_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_001();
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
        IntObj input = new IntObj(), digits = new IntObj();
        output += (String.format("Enter an integer > "));
        input.value = scanner.nextInt();
        if(input.value < 0){
            input.value = Math.abs(input.value);
            while(input.value / 10!=0){
                digits.value = input.value % 10;
                output += (String.format("\n%d", digits.value));
                input.value = input.value / 10;
                if(input.value <= 9){
                    input.value = ( - 1)*input.value;
                }
            }
        } else {
            while(input.value / 10!=0){
                digits.value = input.value % 10;
                output += (String.format("\n%d", digits.value));
                input.value = input.value / 10;
            }
        }
        output += (String.format("\n%d\nThat's all, have a nice day!", input.value));
        if(true)return;;
    }
}