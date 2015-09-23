package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000 mainClass = new syllables_fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int MAX_LEN = 20;
    public void exec () throws Exception {
        char[] word = new char[MAX_LEN];
        IntObj vow = new IntObj(0), i = new IntObj();
        output += (String.format("\nPlease enter a string > "));
        word = (scanner.nextLine() + "\n").toCharArray();
        for(i.value = 0; i.value < MAX_LEN; i.value++) {
            while(word[i.value]!=(char) -1){
                if(word[i.value] == 'a'){
                    vow.value = vow.value + 1;
                } else if(word[i.value] == 'e'){
                    vow.value = vow.value + 1;
                }                 else if(word[i.value] == 'i'){
                    vow.value = vow.value + 1;
                }                 else if(word[i.value] == 'o'){
                    vow.value = vow.value + 1;
                }                 else if(word[i.value] == 'u'){
                    vow.value = vow.value + 1;
                }                 else if(word[i.value] == 'y'){
                    vow.value = vow.value + 1;
                }                 else {
                    break;
                }
            }
            output += (String.format("\nThe numbers of syllables is %d.\n", vow.value));
            if(true)return;;
        }
    }
}