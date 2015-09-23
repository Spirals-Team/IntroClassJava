package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002 mainClass = new checksum_d5cc7acaad4f01271abd8e5e7aecd52ad0fd82b2ea0c14dec8df934c2339b522dd2ed9549605a6405048bcbd89256e7ec818001899fecaa1ec147265783608f9_002();
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
        char[] a = new char[4095];
        IntObj n = new IntObj(0), sum = new IntObj(0), checksum = new IntObj();
        n.value = 0;
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        a = scanner.next().toCharArray();
        while(a[n.value]!='\0'){
            sum.value+=(int) (a[n.value]);
            n.value++;
        }
        checksum.value = (sum.value % 64) + 32;
        output += (String.format("Check sum is %c\n", (char)checksum.value));
        if(true)return;;
    }
}