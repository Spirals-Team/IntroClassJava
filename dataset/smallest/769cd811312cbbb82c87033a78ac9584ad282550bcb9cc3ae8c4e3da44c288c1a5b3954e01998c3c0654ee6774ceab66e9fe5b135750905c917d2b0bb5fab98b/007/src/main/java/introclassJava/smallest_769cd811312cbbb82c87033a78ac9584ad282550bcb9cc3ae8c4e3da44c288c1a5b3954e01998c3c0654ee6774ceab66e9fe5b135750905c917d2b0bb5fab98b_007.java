package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_007 mainClass = new smallest_769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_007();
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
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj(), t = new IntObj(), a = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        t.value = scanner.nextInt();
        if(x.value > y.value){
            a.value = y.value;
        } else {
            a.value = x.value;
        }
        if(y.value > z.value){
            a.value = z.value;
        }
        if(z.value > t.value){
            a.value = t.value;
        }
        output += (String.format("%d is the smallest\n", a.value));
        if(true)return;;
    }
}