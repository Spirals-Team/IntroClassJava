package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004 mainClass = new digits_bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_004();
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
        num.value = (int) (num.value);
        digit.value = num.value % 10;
        while(num.value!=0){
            if((digit.value < 0) && ((num.value / 10)!=0)){
                digit.value = digit.value* - 1;
            }
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
            digit.value = num.value % 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}