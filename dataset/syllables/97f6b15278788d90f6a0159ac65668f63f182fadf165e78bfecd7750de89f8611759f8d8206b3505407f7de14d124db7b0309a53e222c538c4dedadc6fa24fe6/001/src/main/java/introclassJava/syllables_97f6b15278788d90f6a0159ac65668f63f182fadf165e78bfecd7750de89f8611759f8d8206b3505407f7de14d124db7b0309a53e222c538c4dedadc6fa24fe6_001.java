package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_001 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_001 mainClass = new syllables_97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_001();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int max = 20;
    public void exec () throws Exception {
        char[] str = new char[max];
        IntObj num = new IntObj(0), i = new IntObj();
        output += (String.format("Please enter a string > "));
        str = (scanner.nextLine() + "\n").toCharArray();
        for(i.value = 0; str[i.value]!='\0'; i.value++) {
            switch(str[i.value]) {
                case 'a':
                num.value = num.value + 1;
                break;
                case 'e':
                num.value = num.value + 1;
                break;
                case 'i':
                num.value = num.value + 1;
                break;
                case 'o':
                num.value = num.value + 1;
                break;
                case 'u':
                num.value = num.value + 1;
                break;
                case 'y':
                num.value = num.value + 1;
                break;
                default:

                num.value = num.value;
            }
        }
        output += (String.format("The number of syllables is %d.\n", num.value));
        if(true)return;;
    }
}