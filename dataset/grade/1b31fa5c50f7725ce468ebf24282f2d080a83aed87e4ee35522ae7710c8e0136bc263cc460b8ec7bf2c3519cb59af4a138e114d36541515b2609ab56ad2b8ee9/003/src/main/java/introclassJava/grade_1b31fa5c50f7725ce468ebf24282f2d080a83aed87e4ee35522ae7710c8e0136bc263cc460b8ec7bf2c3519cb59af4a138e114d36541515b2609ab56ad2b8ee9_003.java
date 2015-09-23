package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003 mainClass = new grade_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003();
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
        FloatObj A = new FloatObj(), B = new FloatObj(), C = new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if(grade.value >= A.value){
            output += (String.format("Student has an A grade\n"));
            if(true)return;;
        } else if((grade.value < A.value) && (grade.value >= B.value)){
            output += (String.format("Student has an B grade\n"));
            if(true)return;;
        }         else if((grade.value < B.value) && (grade.value >= D.value)){
            output += (String.format("Student has an C grade\n"));
            if(true)return;;
        }         else if((grade.value < C.value) && (grade.value >= D.value)){
            output += (String.format("Student has an D grade\n"));
            if(true)return;;
        }         else {
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}