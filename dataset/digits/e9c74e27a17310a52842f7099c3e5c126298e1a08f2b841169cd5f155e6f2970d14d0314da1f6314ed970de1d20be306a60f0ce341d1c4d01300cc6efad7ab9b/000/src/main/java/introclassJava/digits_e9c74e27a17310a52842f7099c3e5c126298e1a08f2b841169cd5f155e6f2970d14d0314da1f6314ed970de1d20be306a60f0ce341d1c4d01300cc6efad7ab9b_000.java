package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new digits_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
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
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        if(num.value < 0){
            while(num.value!=0){
                digit.value = num.value % 10;
                if(num.value > ( - 10)){
                    output += (String.format("\n%d", digit.value));
                } else {
                    output += (String.format("\n%d",  - digit.value));
                }
                num.value = num.value / 10;
            }
        } else {
            while(num.value!=0){
                digit.value = num.value % 10;
                output += (String.format("\n%d", digit.value));
                num.value = num.value / 10;
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}