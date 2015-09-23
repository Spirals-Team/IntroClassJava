package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_000 mainClass = new grade_1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_000();
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
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c = new DoubleObj(), d = new DoubleObj(), e = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > Thank you. "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output += (String.format("Now enter student score (percent) >"));
        e.value = scanner.nextDouble();
        if(e.value >= a.value){
            output += (String.format("Student has an A grade\n"));
        } else if(e.value >= b.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(e.value >= c.value){
            output += (String.format("Student has an C grade\n"));
        }         else {
            output += (String.format("Student has an D grade\n"));
        }
        if(true)return;;
    }
}