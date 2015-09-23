package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000 mainClass = new digits_295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_000();
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
        IntObj n = new IntObj();
        IntObj modRes = new IntObj();
        IntObj mod = new IntObj(10);
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        while(n.value!=0){
            modRes.value = n.value % mod.value;
            n.value = n.value / mod.value;
            if(modRes.value!=0){
                output += (String.format("\n%d", modRes.value));
            } else {
                output += (String.format("%d", n.value));
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}