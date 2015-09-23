package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003 mainClass = new digits_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003();
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
        IntObj digit = new IntObj(), n = new IntObj(), power = new IntObj(0), i = new IntObj();
        output += (String.format("\nEnter an integer > "));
        digit.value = scanner.nextInt();
        output += (String.format("\n"));
        if(digit.value >= 0){
            for(i.value = 1; i.value <= 10 && power.value <= digit.value; i.value++) {
                power.value = Math.pow(10.0, i.value);
                n.value = (digit.value % power.value) / (power.value / 10);
                output += (String.format("%d\n", n.value));
            }
        } else if(digit.value < 0){
            for(i.value = 1; i.value <= 10 && power.value <= Math.abs(digit.value); i.value++) {
                power.value = Math.pow(10.0, i.value);
                n.value = (digit.value % power.value);
                if(n.value <= digit.value){
                    n.value = n.value;
                } else {
                    n.value = Math.abs(n.value);
                }
                n.value = n.value / (power.value / 10);
                output += (String.format("%d\n", n.value));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}