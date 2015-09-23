package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_000 mainClass = new digits_d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_000();
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
        IntObj input = new IntObj(), display = new IntObj();
        output += (String.format("Enter an integer > "));
        input.value = scanner.nextInt();
        output += (String.format("\n"));
        if(input.value < 0){
            input.value = input.value*( - 1);
            while((input.value / 10) >= 1){
                display.value = input.value % 10;
                output += (String.format("%d\n", display.value));
                input.value = input.value / 10;
            }
            output += (String.format("-%d\n", input.value % 10));
            output += (String.format("That's all, have a nice day!\n"));
            if(true)return;;
        }
        while((input.value % 10) >= 1){
            display.value = input.value % 10;
            output += (String.format("%d\n", display.value));
            input.value = input.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}