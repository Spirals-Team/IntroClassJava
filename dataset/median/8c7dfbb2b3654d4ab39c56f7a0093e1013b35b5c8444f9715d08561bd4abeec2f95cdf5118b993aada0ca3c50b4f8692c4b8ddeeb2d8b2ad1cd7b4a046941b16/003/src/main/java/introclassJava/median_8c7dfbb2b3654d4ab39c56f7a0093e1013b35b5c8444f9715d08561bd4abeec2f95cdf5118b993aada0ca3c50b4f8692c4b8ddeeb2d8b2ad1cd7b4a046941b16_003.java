package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_003 mainClass = new median_8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_003();
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
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if((a.value < b.value && b.value < c.value) || (c.value < b.value && b.value < a.value)){
            d.value = b.value;
        }
        if((c.value < a.value && a.value < b.value) || (b.value < a.value && a.value < c.value)){
            d.value = a.value;
        }
        if((b.value < c.value && c.value < a.value) || (a.value < c.value && c.value < b.value)){
            d.value = c.value;
        }
        output += (String.format("%d is the median\n", d.value));
        if(true)return;;
    }
}