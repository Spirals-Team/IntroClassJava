package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008 mainClass = new syllables_dde0a464867a81900c46f3145fe7bca6e64b4bef8bbf11345019454ecb81b3ad41a79a3bd1ae6bd2019b87fa2fbb024ece6af6c5e5540a4ce101451a5a737e81_008();
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
        char[] array = new char[21];
        char[] vowels = new char[0] = new char({
'a''e''i''o''u''y'        });
        IntObj i = new IntObj(), count = new IntObj(), d = new IntObj();
        output += (String.format("Please enter a string > "));
        array = (scanner.nextLine() + "\n").toCharArray();
        for(i.value = 0; i.value < array.length - 1; i.value++) {
            for(d.value = 0; d.value <= 5; d.value++) {
                if((char)array[i.value] == (char)vowels[d.value]){
                    count.value++;
                    break;
                }
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}