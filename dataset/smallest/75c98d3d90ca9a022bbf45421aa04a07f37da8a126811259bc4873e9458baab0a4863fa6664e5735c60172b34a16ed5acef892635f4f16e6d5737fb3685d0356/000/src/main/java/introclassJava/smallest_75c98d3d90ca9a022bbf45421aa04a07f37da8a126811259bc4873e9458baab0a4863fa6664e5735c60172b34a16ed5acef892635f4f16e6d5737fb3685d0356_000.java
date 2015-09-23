package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_75c98d3d90ca9a022bbf45421aa04a07f37da8a126811259bc4873e9458baab0a4863fa6664e5735c60172b34a16ed5acef892635f4f16e6d5737fb3685d0356_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_75c98d3d90ca9a022bbf45421aa04a07f37da8a126811259bc4873e9458baab0a4863fa6664e5735c60172b34a16ed5acef892635f4f16e6d5737fb3685d0356_000 mainClass = new smallest_75c98d3d90ca9a022bbf45421aa04a07f37da8a126811259bc4873e9458baab0a4863fa6664e5735c60172b34a16ed5acef892635f4f16e6d5737fb3685d0356_000();
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
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 = new IntObj(), num4 = new IntObj(), smallest = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if(num1.value < num2.value && num1.value < num3.value && num1.value < num4.value){
            smallest.value = num1.value;
        } else if(num2.value < num1.value && num2.value < num3.value && num2.value < num4.value){
            smallest.value = num2.value;
        }         else if(num3.value < num1.value && num3.value < num2.value && num3.value < num4.value){
            smallest.value = num3.value;
        }         else if(num4.value < num1.value && num4.value < num2.value && num4.value < num3.value){
            smallest.value = num4.value;
        }
        output += (String.format("%d is the smallest\n", smallest.value));
        if(true)return;;
    }
}