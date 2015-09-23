package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_000 mainClass = new median_d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_000();
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
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces  > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if((a.value < c.value) && (a.value > b.value)){
            output += (String.format("%d is the median\n", a.value));
        } else if((a.value < b.value) && (a.value > c.value)){
            output += (String.format("%d is the median\n", a.value));
        }
        if((b.value < a.value) && (b.value > c.value)){
            output += (String.format("%d is the median\n", b.value));
        } else if((b.value > a.value) && (b.value < c.value)){
            output += (String.format("%d is the median\n", b.value));
        }
        if((c.value > a.value) && (c.value < b.value)){
            output += (String.format("%d is the median\n", c.value));
        } else if((c.value < a.value) && (c.value > b.value)){
            output += (String.format("%d is the median\n", c.value));
        }
        if(true)return;;
    }
}