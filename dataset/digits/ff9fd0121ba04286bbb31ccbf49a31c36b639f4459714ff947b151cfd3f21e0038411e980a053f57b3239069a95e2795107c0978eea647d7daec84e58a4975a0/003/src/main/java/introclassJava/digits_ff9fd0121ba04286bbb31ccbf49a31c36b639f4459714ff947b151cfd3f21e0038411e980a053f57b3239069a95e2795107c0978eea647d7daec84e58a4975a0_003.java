package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_ff9fd0121ba04286bbb31ccbf49a31c36b639f4459714ff947b151cfd3f21e0038411e980a053f57b3239069a95e2795107c0978eea647d7daec84e58a4975a0_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_ff9fd0121ba04286bbb31ccbf49a31c36b639f4459714ff947b151cfd3f21e0038411e980a053f57b3239069a95e2795107c0978eea647d7daec84e58a4975a0_003 mainClass = new digits_ff9fd0121ba04286bbb31ccbf49a31c36b639f4459714ff947b151cfd3f21e0038411e980a053f57b3239069a95e2795107c0978eea647d7daec84e58a4975a0_003();
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
        IntObj n = new IntObj(), d = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        if(n.value < 0){
            n.value =  - n.value;
            while(n.value >= 10){
                d.value = n.value % 10;
                n.value = n.value / 10;
                output += (String.format("%d\n", d.value));
            }
            output += (String.format("-%d\n", n.value));
            output += (String.format("That's all, have a nice day!\n"));
            if(true)return;;
            ;
        }
        if(n.value == 0){
            output += (String.format("0"));
        }
        if(n.value > 0){
            while(n.value!=0){
                d.value = n.value % 10;
                n.value = n.value / 10;
                output += (String.format("%d\n", d.value));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}