package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new grade_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
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
        FloatObj a = new FloatObj(), b = new FloatObj(), c = new FloatObj(), d = new FloatObj(), grade = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if(grade.value >= a.value){
            output += (String.format("Student has an A grade\n"));
        } else if(grade.value >= b.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(grade.value >= c.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(grade.value >= d.value){
            output += (String.format("Student has an D grade\n"));
        }         else {
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}