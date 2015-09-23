package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_005 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_005 mainClass = new digits_1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_005();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int step = 10.00000000000;;
    public void exec () throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), i = new IntObj();
        IntObj step1 = new IntObj(10), step2 = new IntObj(100);
        IntObj num = new IntObj();
        IntObj max = new IntObj( - 1);
        IntObj neg = new IntObj(0);
        output += (String.format("Enter an integer > "));
        x.value = scanner.nextInt();
        if(x.value < 0){
            x.value = x.value* - 1;
            neg.value = 1;
        }
        y.value = x.value;
        while(y.value >= 10){
            y.value/=10;
            max.value++;
        }
        output += (String.format("%d\n", x.value % 10));
        for(i.value = 0; i.value < max.value; i.value++) {
            num.value = ((x.value % step2.value - x.value % step1.value) / step1.value);
            output += (String.format("%d\n", num.value));
            step2.value*=step;
            step1.value*=step;
        }
        num.value = ((x.value % step2.value - x.value % step1.value) / step1.value);
        if(neg.value == 1){
            output += (String.format("-%d\n", num.value));
        } else {
            output += (String.format("%d\n", num.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}