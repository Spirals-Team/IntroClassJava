package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003 mainClass = new digits_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_003();
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
        IntObj in = new IntObj();
        output += (String.format("Enter an integer > "));
        in.value = scanner.nextInt();
        if(in.value < 0){
            in.value = in.value*( - 1);
        }
        while(in.value / 10!=0){
            output += (String.format("%d\n", in.value % 10));
            in.value = in.value / 10;
        }
        output += (String.format("%d\n", in.value));
        output += (String.format("That's all, have a nice day!"));
        if(true)return;;
    }
}