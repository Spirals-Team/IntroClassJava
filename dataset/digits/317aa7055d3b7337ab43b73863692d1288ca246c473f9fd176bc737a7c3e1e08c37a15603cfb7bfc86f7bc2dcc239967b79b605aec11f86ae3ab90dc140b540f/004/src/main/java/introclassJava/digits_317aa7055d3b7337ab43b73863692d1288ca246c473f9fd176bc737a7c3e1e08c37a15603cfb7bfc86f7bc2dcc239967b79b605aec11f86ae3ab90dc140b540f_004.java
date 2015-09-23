package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_004 mainClass = new digits_317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_004();
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
        IntObj integer = new IntObj(), i = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        integer.value = scanner.nextInt();
        digit.value = 0;
        for(i.value = 1; i.value <= 10; i.value+=1) {
            digit.value = integer.value % 10;
            if(integer.value == 0){
                output += (String.format("0\n"));
                break;
            } else if(Math.abs(digit.value) < 10){
                digit.value = Math.abs(digit.value);
                output += (String.format("%d\n", digit.value));
            }
            integer.value = integer.value / 10;
            if(Math.abs(integer.value) < 10 && integer.value!=0){
                output += (String.format("%d\n", integer.value));
                break;
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}