package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_2af3c4163b40679ef94bbbbc863c4fa3785c6e164281f5e8850d9e4ffa387e5b162ceb37449ecca33961ff162d861c8d98ff702e723755b6c37c95d5cfaf1c40_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_2af3c4163b40679ef94bbbbc863c4fa3785c6e164281f5e8850d9e4ffa387e5b162ceb37449ecca33961ff162d861c8d98ff702e723755b6c37c95d5cfaf1c40_000 mainClass = new digits_2af3c4163b40679ef94bbbbc863c4fa3785c6e164281f5e8850d9e4ffa387e5b162ceb37449ecca33961ff162d861c8d98ff702e723755b6c37c95d5cfaf1c40_000();
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
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        output += (String.format("\n"));
        while(num.value > 0){
            digit.value = num.value % 10;
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}