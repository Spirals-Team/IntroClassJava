package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_dedc2a7c919835ade6d92729cfb18fc71addf6dcdf36ce26ca8b1e3d3aea81bad974c61b96fd71537e95a6aac4582d5b08f9fd8057ce40fb18fb5df37d86b70d_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_dedc2a7c919835ade6d92729cfb18fc71addf6dcdf36ce26ca8b1e3d3aea81bad974c61b96fd71537e95a6aac4582d5b08f9fd8057ce40fb18fb5df37d86b70d_000 mainClass = new smallest_dedc2a7c919835ade6d92729cfb18fc71addf6dcdf36ce26ca8b1e3d3aea81bad974c61b96fd71537e95a6aac4582d5b08f9fd8057ce40fb18fb5df37d86b70d_000();
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
        FloatObj a = new FloatObj(), b = new FloatObj(), c = new FloatObj(), d = new FloatObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        if((a.value < b.value) && (a.value < c.value) && (a.value < d.value)){
            output += (String.format("%.0f is the smallest\n", a.value));
        } else if((b.value < a.value) && (b.value < c.value) && (b.value < d.value)){
            output += (String.format("%.0f is the smallest\n", b.value));
        }         else if((c.value < a.value) && (c.value < b.value) && (c.value < d.value)){
            output += (String.format("%.0f is the smallest\n", c.value));
        }         else {
            output += (String.format("%.0f is the smallest\n", d.value));
        }
        if(true)return;;
    }
}