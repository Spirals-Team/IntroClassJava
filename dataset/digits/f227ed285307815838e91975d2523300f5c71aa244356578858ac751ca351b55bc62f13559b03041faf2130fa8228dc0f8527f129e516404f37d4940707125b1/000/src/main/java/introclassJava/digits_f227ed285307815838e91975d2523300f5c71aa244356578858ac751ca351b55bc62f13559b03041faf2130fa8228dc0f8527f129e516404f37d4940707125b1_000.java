package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_f227ed285307815838e91975d2523300f5c71aa244356578858ac751ca351b55bc62f13559b03041faf2130fa8228dc0f8527f129e516404f37d4940707125b1_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_f227ed285307815838e91975d2523300f5c71aa244356578858ac751ca351b55bc62f13559b03041faf2130fa8228dc0f8527f129e516404f37d4940707125b1_000 mainClass = new digits_f227ed285307815838e91975d2523300f5c71aa244356578858ac751ca351b55bc62f13559b03041faf2130fa8228dc0f8527f129e516404f37d4940707125b1_000();
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
        IntObj num = new IntObj(), rem = new IntObj(0), count = new IntObj(1);
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        output += (String.format("The digits for the %d are: \n", num.value));
        while(count.value <= 10 && num.value > 0){
            rem.value = num.value % 10;
            num.value = num.value - rem.value;
            num.value = num.value / 10;
            count.value++;
            output += (String.format("%d\n", rem.value));
        }
        if(num.value <= 0 && count.value == 1){
            output += (String.format("%d\n", num.value));
        }
        if(true)return;;
    }
}