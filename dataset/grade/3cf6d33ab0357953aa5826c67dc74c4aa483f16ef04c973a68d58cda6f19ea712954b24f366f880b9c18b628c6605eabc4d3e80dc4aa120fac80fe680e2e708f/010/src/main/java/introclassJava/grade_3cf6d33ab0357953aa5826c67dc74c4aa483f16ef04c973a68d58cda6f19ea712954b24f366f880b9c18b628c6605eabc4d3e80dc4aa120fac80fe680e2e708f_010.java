package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_010 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_010 mainClass = new grade_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_010();
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
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C = new DoubleObj(), D = new DoubleObj(), score = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output += (String.format("\nThank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if(score.value >= A.value){
            output += (String.format("Student has an A grade\n"));
        } else if(score.value >= B.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(score.value >= C.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(score.value < D.value){
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}