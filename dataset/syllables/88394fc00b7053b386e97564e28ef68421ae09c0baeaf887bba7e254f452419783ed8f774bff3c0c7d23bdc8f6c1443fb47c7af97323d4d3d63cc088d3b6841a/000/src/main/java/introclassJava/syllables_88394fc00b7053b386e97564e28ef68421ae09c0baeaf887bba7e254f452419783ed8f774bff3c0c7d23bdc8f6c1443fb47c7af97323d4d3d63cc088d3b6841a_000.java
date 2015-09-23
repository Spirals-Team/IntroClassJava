package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_000 mainClass = new syllables_88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_000();
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
        char[] str = new char[20];
        IntObj i = new IntObj();
        IntObj syllables = new IntObj(0);
        output += (String.format("Please enter a string > "));
        str = scanner.next().toCharArray();
        for(i.value = 0; i.value < 20; ++i.value) {
            if(str[i.value] == 'a'){
                syllables.value+=1;
            } else if(str[i.value] == 'e'){
                syllables.value+=1;
            }             else if(str[i.value] == 'i'){
                syllables.value+=1;
            }             else if(str[i.value] == 'o'){
                syllables.value+=1;
            }             else if(str[i.value] == 'u'){
                syllables.value+=1;
            }             else if(str[i.value] == 'y'){
                syllables.value+=1;
            }
        }
        output += (String.format("The number of syllables is %d.", syllables.value));
        if(true)return;;
    }
}