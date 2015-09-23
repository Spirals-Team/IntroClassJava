package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_000 mainClass = new smallest_d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_000();
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
        IntObj first = new IntObj(), second = new IntObj(), third = new IntObj(), fourth = new IntObj(), lowest = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        first.value = scanner.nextInt();
        second.value = scanner.nextInt();
        third.value = scanner.nextInt();
        fourth.value = scanner.nextInt();
        if(first.value < second.value){
            lowest.value = first.value;
        } else if(second.value < first.value){
            lowest.value = second.value;
        }
        if(third.value < lowest.value){
            lowest.value = third.value;
        }
        if(fourth.value < lowest.value){
            lowest.value = fourth.value;
        }
        output += (String.format("%d is the smallest\n", lowest.value));
        if(true)return;;
    }
}