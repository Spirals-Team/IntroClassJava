package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_000 mainClass = new median_c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_000();
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
        IntObj A = new IntObj(), B = new IntObj(), C = new IntObj();
        output += (String.format("Pleaes enter 3 numbers seperated by spaces > "));
        A.value = scanner.nextInt();
        B.value = scanner.nextInt();
        C.value = scanner.nextInt();
        if(A.value > B.value && A.value < C.value){
            output += (String.format("%d is the median\n", A.value));
        }
        if(A.value > C.value && A.value < B.value){
            output += (String.format("%d is the median\n", A.value));
        }
        if(B.value > C.value && B.value < A.value){
            output += (String.format("%d is the median\n", B.value));
        }
        if(B.value > A.value && B.value < C.value){
            output += (String.format("%d is the median\n", B.value));
        }
        if(C.value > A.value && C.value < B.value){
            output += (String.format("%d is the median\n", C.value));
        }
        if(C.value > B.value && C.value < A.value){
            output += (String.format("%d is the median\n", C.value));
        }
        if(true)return;;
    }
}