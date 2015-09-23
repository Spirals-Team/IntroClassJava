package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007 mainClass = new checksum_e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_007();
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
        CharObj letter = new CharObj();
        IntObj sum = new IntObj(0);
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        while(true){
            letter.value = scanner.findInLine(".").charAt(0);;
            if(letter.value == '\n'){
                break;
            } else {
                sum.value+=(int)letter.value;
            }
        }
        sum.value = (sum.value % 64) + 32;
        CharObj output = new CharObj((char)sum.value);
        output += (String.format("Check sum is %c\n", output.value));
        if(true)return;;
    }
}