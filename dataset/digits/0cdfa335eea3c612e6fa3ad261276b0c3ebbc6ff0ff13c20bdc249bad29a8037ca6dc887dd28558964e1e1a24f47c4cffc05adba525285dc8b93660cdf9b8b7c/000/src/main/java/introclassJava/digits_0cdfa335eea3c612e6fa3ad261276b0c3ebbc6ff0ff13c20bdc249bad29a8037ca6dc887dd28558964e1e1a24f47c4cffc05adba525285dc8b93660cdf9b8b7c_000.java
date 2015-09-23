package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_000 mainClass = new digits_0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_000();
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
        IntObj c = new IntObj(), i = new IntObj(), flag1 = new IntObj(), flag2 = new IntObj(0);
        char[] digit = new char[11];
        output += (String.format("\nEnter an integer > "));
        &digit = scanner.next().toCharArray();
        c.value = digit.length;
        output += (String.format("\n"));
        for(i.value = 1; i.value < c.value; i.value++) {
            if(digit[i.value] == '-'){
                flag1.value = i.value;
                break;
            } else {
                flag1.value = c.value;
            }
        }
        if(digit[0] == '-'){
            flag2.value = 1;
        }
        for(i.value = flag1.value - 1; i.value >= flag2.value; i.value--) {
            if(flag2.value == 1 && i.value == 1){
                output += (String.format("-"));
            }
            output += (String.format("%c\n", digit[i.value]));
        }
        output += (String.format("That's all, have a nice day!"));
        if(true)return;;
    }
}