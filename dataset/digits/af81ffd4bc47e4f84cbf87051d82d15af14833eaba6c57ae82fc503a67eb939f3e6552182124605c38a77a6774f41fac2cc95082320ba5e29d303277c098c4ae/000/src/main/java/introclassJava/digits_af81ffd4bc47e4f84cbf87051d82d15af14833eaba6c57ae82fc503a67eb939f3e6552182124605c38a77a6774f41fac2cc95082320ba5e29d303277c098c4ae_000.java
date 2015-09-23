package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_000 mainClass = new digits_af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_000();
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
        IntObj num = new IntObj(), dig = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        if(num.value > 0){
            while((num.value % 10)!=0){
                sep(num, dig);
                output += (String.format("\n%d", dig.value));
            }
        } else if(num.value < 0){
            while((num.value % 10)!=0){
                sep(num, dig);
                if(num.value == 0){
                    output += (String.format("\n-%d", dig.value));
                } else {
                    output += (String.format("\n%d", dig.value));
                }
            }
        }         else if(Math.ceil(num.value) == 0){
            output += (String.format("\n0"));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
    public void sep (IntObj num, IntObj digp) throws Exception {
        if(num.value > 0){
            digp.value = *num.value % 10;
            num.value = (*num.value - *digp.value) / 10;
        } else if(num.value < 0){
            digp.value = Math.abs((*num.value % 10));
            num.value = ((*num.value + *digp.value) / 10);
        }
    }
}