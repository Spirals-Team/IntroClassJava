package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_531924c0915a9fa7b02951d5de7cc2b0da19d57a6be3b667c064bec1d5db14b955c30483b24273dd8d11a609a81726c4e6ab964009eb716f8b60adcf5f6fd7e8_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_531924c0915a9fa7b02951d5de7cc2b0da19d57a6be3b667c064bec1d5db14b955c30483b24273dd8d11a609a81726c4e6ab964009eb716f8b60adcf5f6fd7e8_000 mainClass = new grade_531924c0915a9fa7b02951d5de7cc2b0da19d57a6be3b667c064bec1d5db14b955c30483b24273dd8d11a609a81726c4e6ab964009eb716f8b60adcf5f6fd7e8_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public CharObj user_grade (FloatObj percent, FloatObj a, FloatObj b, FloatObj c, FloatObj d) throws Exception {
        if(percent.value < d.value){
            return 'F';
        } else if((percent.value > d.value) && (percent.value < c.value)){
            return 'D';
        }         else if((percent.value > c.value) && (percent.value < b.value)){
            return 'C';
        }         else if((percent.value > b.value) && (percent.value < a.value)){
            return 'B';
        }         else {
            return 'A';
        }
    }
    public void exec () throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c = new FloatObj(), d = new FloatObj();
        FloatObj percent = new FloatObj();
        CharObj grade = new CharObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        grade.value = user_grade(percent, a, b, c, d);
        if(grade.value == 'F'){
            output += (String.format("Student has failed the course\n"));
        }
        output += (String.format("Student has an %c grade\n", grade.value));
        if(true)return;;
    }
}