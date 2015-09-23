package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_010 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_010 mainClass = new digits_d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_010();
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
        IntObj n = new IntObj(), digit = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        if(n.value == 0){
            output += (String.format("\n0"));
            output += (String.format("\nThat's all, have a nice day!\n"));
            if(true)return;;
        }
        while(Math.abs(n.value) > 0){
            if(n.value > 0){
                digit.value = n.value % 10;
                output += (String.format("\n%d", digit.value));
                n.value = n.value / 10.0;
            } else if(n.value < 0 && (n.value / 10.0) < ( - 1.0)){
                digit.value = Math.abs(n.value % 10);
                output += (String.format("\n%d", digit.value));
                n.value = n.value / 10.0;
            }             else if(n.value < 0 && (n.value / 10.0) > ( - 1.0)){
                digit.value = n.value % 10;
                output += (String.format("\n%d", digit.value));
                n.value = (n.value) / 10.0;
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}