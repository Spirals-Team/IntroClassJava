package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_003 mainClass = new smallest_a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_003();
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
        IntObj int_1 = new IntObj(), int_2 = new IntObj(), int_3 = new IntObj(), int_4 = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        int_1.value = scanner.nextInt();
        int_2.value = scanner.nextInt();
        int_3.value = scanner.nextInt();
        int_4.value = scanner.nextInt();
        if(int_1.value < int_2.value && int_1.value < int_3.value && int_1.value < int_4.value){
            output += (String.format("%d is the smallest \n", int_1.value));
        } else if(int_2.value < int_1.value && int_2.value < int_3.value && int_2.value < int_4.value){
            output += (String.format("%d is the smallest \n", int_2.value));
        }         else if(int_3.value < int_1.value && int_3.value < int_2.value && int_3.value < int_4.value){
            output += (String.format("%d is the smallest \n", int_3.value));
        }         else {
            (output += (String.format("%d is the smallest \n", int_4.value)));
        }
        if(true)return;;
    }
}