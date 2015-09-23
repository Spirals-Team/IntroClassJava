package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int MAX = 20;
    public void exec () throws Exception {
        char[] input = new char[MAX];
        IntObj i = new IntObj(), s = new IntObj(), len = new IntObj();
        output += (String.format("Please enter a string > "));
        input = scanner.next().toCharArray();
        len.value = input.length;
        s.value = 0;
        for(i.value = 0; i.value < len.value; i.value++) {
            switch(input[i.value]) {
                case 'a':
                s.value++;
                break;
                case 'e':
                s.value++;
                break;
                case 'i':
                s.value++;
                break;
                case 'o':
                s.value++;
                break;
                case 'u':
                s.value++;
                break;
                case 'y':
                s.value++;
                break;
                default:

                break;
            }
        }
        output += (String.format("The number of syllables is %d.\n", s.value));
        if(true)return;;
    }
}