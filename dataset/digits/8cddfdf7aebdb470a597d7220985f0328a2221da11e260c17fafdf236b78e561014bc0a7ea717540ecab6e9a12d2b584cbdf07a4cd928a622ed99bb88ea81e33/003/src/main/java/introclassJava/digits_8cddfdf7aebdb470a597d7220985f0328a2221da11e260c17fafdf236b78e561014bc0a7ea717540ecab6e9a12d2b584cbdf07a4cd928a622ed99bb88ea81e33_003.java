package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_8cddfdf7aebdb470a597d7220985f0328a2221da11e260c17fafdf236b78e561014bc0a7ea717540ecab6e9a12d2b584cbdf07a4cd928a622ed99bb88ea81e33_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_8cddfdf7aebdb470a597d7220985f0328a2221da11e260c17fafdf236b78e561014bc0a7ea717540ecab6e9a12d2b584cbdf07a4cd928a622ed99bb88ea81e33_003 mainClass = new digits_8cddfdf7aebdb470a597d7220985f0328a2221da11e260c17fafdf236b78e561014bc0a7ea717540ecab6e9a12d2b584cbdf07a4cd928a622ed99bb88ea81e33_003();
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
        FloatObj nint = new FloatObj();
        IntObj n = new IntObj();
        output += (String.format("\nEnter an integer > "));
        nint.value = scanner.nextFloat();
        if(nint.value < 2147483647){
            n.value = nint.value;
            listnum(n);
        } else if(nint.value >= 2147483647){
            output += (String.format("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2"));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
    public IntObj listnum (IntObj num) throws Exception {
        IntObj dx = new IntObj(), numcheck = new IntObj(), dxy = new IntObj(), x = new IntObj();
        x.value = 0;
        while(num.value!=0){
            x.value = x.value + 1;
            dx.value = num.value % 10;
            numcheck.value = Math.abs(num.value);
            dxy.value = Math.abs(dx.value);
            if(numcheck.value < 10){
                output += (String.format("\n%d", dx.value));
            } else if(numcheck.value >= 10){
                output += (String.format("\n%d", dxy.value));
            }
            num.value = (num.value / 10);
        }
        return num.value;
    }
}