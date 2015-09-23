package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003 mainClass = new syllables_15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int STR_LEN = 20;
    public void exec () throws Exception {
        char[] input = new char[STR_LEN];
        IntObj size = new IntObj(), num_vows = new IntObj(), i = new IntObj();
        output += (String.format("Please enter a string > "));
        input = (scanner.nextLine() + "\n").toCharArray();
        size.value = input.length - 1;
        num_vows.value = 0;
        for(i.value = 0; i.value < size.value; i.value++) {
            if(input[i.value] == 'a' || input[i.value] == 'A'){
                ++num_vows.value;
            } else if(input[i.value] == 'e' || input[i.value] == 'E'){
                ++num_vows.value;
            }             else if(input[i.value] == 'i' || input[i.value] == 'I'){
                ++num_vows.value;
            }             else if(input[i.value] == 'o' || input[i.value] == 'O'){
                ++num_vows.value;
            }             else if(input[i.value] == 'u' || input[i.value] == 'U'){
                ++num_vows.value;
            }             else if(input[i.value] == 'y' || input[i.value] == 'Y'){
                ++num_vows.value;
            }
        }
        output += (String.format("The number of syllables is %d.\n", num_vows.value));
        if(true)return;;
    }
}