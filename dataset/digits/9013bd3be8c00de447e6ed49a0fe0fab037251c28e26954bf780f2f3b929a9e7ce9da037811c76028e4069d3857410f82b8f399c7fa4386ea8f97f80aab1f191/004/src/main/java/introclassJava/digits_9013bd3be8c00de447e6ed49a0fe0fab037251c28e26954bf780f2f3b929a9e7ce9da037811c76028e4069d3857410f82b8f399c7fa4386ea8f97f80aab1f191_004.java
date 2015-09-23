package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_004 mainClass = new digits_9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_004();
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
        IntObj number = new IntObj(), digit = new IntObj(), j = new IntObj(), digit1 = new IntObj();
        output += (String.format("Enter an integer > "));
        number.value = scanner.nextInt();
        output += (String.format("\n"));
        j.value = 10;
        if(number.value == 0){
            output += (String.format("0\n"));
        }
        while(number.value!=0){
            digit.value = number.value % j.value;
            if(digit.value < 0 && Math.abs(number.value*10) < 100){
                output += (String.format("%d\n", digit.value));
                break;
            } else {
                digit1.value = Math.abs(digit.value);
            }
            output += (String.format("%d\n", digit1.value));
            number.value = number.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}