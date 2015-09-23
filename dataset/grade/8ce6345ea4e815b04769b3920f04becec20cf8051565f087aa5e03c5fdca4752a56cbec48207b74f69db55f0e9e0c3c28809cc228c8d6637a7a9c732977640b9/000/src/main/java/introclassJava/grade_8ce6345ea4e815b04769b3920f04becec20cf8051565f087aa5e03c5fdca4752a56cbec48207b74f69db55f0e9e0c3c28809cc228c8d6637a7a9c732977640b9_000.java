package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000 mainClass = new grade_8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public CharObj find_grade (FloatObj student_score, FloatObj a, FloatObj b, FloatObj c, FloatObj d) throws Exception {
        CharObj grade = new CharObj();
        if(student_score.value >= a.value){
            grade.value = 'A';
        } else if(student_score.value >= b.value){
            grade.value = 'B';
        }         else if(student_score.value >= c.value){
            grade.value = 'C';
        }         else {
            grade.value = 'D';
        }
        return (grade.value);
    }
    public void exec () throws Exception {
        FloatObj a = new FloatObj();
        FloatObj b = new FloatObj();
        FloatObj c = new FloatObj();
        FloatObj d = new FloatObj();
        FloatObj student_score = new FloatObj();
        CharObj grade = new CharObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        student_score.value = scanner.nextFloat();
        grade.value = find_grade(student_score, a, b, c, d);
        output += (String.format("Student has an %c grade\n", grade.value));
        if(true)return;;
    }
}