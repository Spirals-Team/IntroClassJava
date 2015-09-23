package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_007 mainClass = new median_489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_007();
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
        IntObj A = new IntObj(), B = new IntObj(), C = new IntObj(), small = new IntObj(), large = new IntObj(), median = new IntObj();
        output += (String.format("Please enter 3 numberss separated by spaces > "));
        A.value = scanner.nextInt();
        B.value = scanner.nextInt();
        C.value = scanner.nextInt();
        if(A.value > B.value){
            small.value = B.value;
            large.value = A.value;
        } else if(A.value < B.value){
            small.value = A.value;
            large.value = B.value;
        }
        if(C.value > large.value){
            median.value = large.value;
        } else if(C.value < small.value){
            median.value = small.value;
        }         else {
            median.value = C.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if(true)return;;
    }
}