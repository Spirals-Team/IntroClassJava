package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_001 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_001 mainClass = new syllables_38eb99ca5f527278e523bc9e14ee447c514f13c29f3b7f61282f1698d96b6f45a55f77275f23f8d1e6b23527e590dd9c11b290a9c04121720fb31a1405e19022_001();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int sizeA = 22;
    public void exec () throws Exception {
        char[] string = new char[sizeA];
        IntObj i = new IntObj();
        IntObj count = new IntObj(0);
        output += (String.format("Please enter a string >"));
        string = (scanner.nextLine() + "\n").toCharArray();
        for(i.value = 0; i.value <= string.length; i.value++) {
            if(string[i.value] == 'a' || string[i.value] == 'e' || string[i.value] == 'o' || string[i.value] == 'u' || string[i.value] == 'y'){
                count.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}