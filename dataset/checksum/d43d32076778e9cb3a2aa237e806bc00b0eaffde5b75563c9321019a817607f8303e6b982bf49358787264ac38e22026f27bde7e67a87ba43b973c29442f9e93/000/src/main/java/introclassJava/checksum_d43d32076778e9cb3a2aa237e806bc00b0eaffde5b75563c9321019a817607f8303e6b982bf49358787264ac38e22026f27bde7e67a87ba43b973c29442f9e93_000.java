package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000 mainClass = new checksum_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000();
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
        CharObj input = new CharObj();
        IntObj a = new IntObj(), checksum = new IntObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        try {
            input.value = scanner.findInLine(".").charAt(0);
        } catch (java.lang.NullPointerException e) {
            input.value = '\n';
        };
        a.value = 0;
        do {
            input.value = (int)input.value + a.value;
            a.value = scanner.nextInt();
        } while(a.value!='\n');
        checksum.value = ((int)input.value % 64) + (int)' ';
        output += (String.format("Check sum is %c\n", checksum.value));
        if(true)return;;
    }
}