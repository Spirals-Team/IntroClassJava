package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000 mainClass = new syllables_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int SIZE = 20;
    public void exec () throws Exception {
        char[] s1 = new char[SIZE];
        IntObj syll = new IntObj();
        output += (String.format("Please enter a string > "));
        s1 = (scanner.nextLine() + "\n").toCharArray();
        vowelcounter(s1, syll);
        output += (String.format("The number of syllables is %d.\n", syll.value));
        if(true)return;;
    }
    public void vowelcounter (char[] s1, IntObj syllp) throws Exception {
        IntObj i = new IntObj();
        for(i.value = 0; i.value < s1.length; ++i.value) {
            if(s1[i.value] == 'a' || s1[i.value] == 'e' || s1[i.value] == 'i' || s1[i.value] == 'o' || s1[i.value] == 'u'){
                ++*syllp.value;
            }
        }
    }
}