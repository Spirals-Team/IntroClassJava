package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_d9e7eab5f82342d78fb20833701c4e9f900e8fcb737038d3a2ad18f664532af4d6332b7d14841c9ac773c52f6590b754f76df1f430a35bc8ca4799a767cdec6d_001 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_d9e7eab5f82342d78fb20833701c4e9f900e8fcb737038d3a2ad18f664532af4d6332b7d14841c9ac773c52f6590b754f76df1f430a35bc8ca4799a767cdec6d_001 mainClass = new syllables_d9e7eab5f82342d78fb20833701c4e9f900e8fcb737038d3a2ad18f664532af4d6332b7d14841c9ac773c52f6590b754f76df1f430a35bc8ca4799a767cdec6d_001();
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
        char[] s = new char[20];
        IntObj lens = new IntObj(), i = new IntObj(), x = new IntObj(), str = new IntObj(), count = new IntObj(0);
        output += (String.format("Please enter a string > "));
        s = (scanner.nextLine() + "\n").toCharArray();
        lens.value = s.length;
        for(i.value = 0; i.value!=lens.value; ++i.value) {
            if(s[i.value] == '\n'){
                continue;
            }
            str.value = s[i.value];
            if(str.value < 91 && str.value > 64){
                str.value = str.value + 32;
            }
            CharObj x = new CharObj((char)str.value);
            if(x.value == 'a' || x.value == 'e' || x.value == 'i' || x.value == 'o' || x.value == 'u' || x.value == 'y'){
                count.value = count.value + 1;
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}