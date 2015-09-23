package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_003 mainClass = new syllables_30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int LINE_LEN = 19;
    public void exec () throws Exception {
        IntObj i = new IntObj(), len = new IntObj(), count = new IntObj();
        char[] line = new char[LINE_LEN];
        count.value = 0;
        output += (String.format("Please enter a string > "));
        line = (scanner.nextLine() + "\n").toCharArray();
        len.value = line.length;
        for(i.value = 0; i.value < len.value; i.value++) {
            if(line[i.value] == 'a' || line[i.value] == 'e' || line[i.value] == 'i' || line[i.value] == 'o' || line[i.value] == 'u' || line[i.value] == 'y'){
                count.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}