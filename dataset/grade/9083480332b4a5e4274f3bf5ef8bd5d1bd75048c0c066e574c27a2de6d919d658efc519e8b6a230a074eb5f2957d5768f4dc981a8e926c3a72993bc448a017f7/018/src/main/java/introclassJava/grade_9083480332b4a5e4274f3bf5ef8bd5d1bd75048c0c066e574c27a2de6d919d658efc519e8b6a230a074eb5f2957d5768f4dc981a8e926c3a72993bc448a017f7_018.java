package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_018 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_018 mainClass = new grade_9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_018();
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
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C = new DoubleObj(), D = new DoubleObj(), grade = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextDouble();
        if(grade.value >= A.value){
            output += (String.format("Student has an A grade\n"));
        } else if(grade.value >= B.value && grade.value < A.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(grade.value >= C.value && grade.value < B.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(grade.value >= D.value && grade.value < C.value){
            output += (String.format("Student has an D grade\n"));
        }         else if(grade.value < D.value){
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}