package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000 mainClass = new grade_0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000();
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
        FloatObj a = new FloatObj(), b = new FloatObj(), c = new FloatObj(), d = new FloatObj();
        output += (String.format("Enter threshold for grades A,B,C,D\n"));
        output += (String.format("in this order, decreasing persentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        if(a.value > b.value && b.value > c.value && c.value > d.value){
            output += (String.format("Thank you. Now enter student score (percent) > "));
            FloatObj num = new FloatObj();
            num.value = scanner.nextFloat();
            if(num.value >= a.value){
                output += (String.format("Student has an A grade\n"));
            } else if(num.value < a.value && num.value >= b.value){
                output += (String.format("Student has a B grade\n"));
            }             else if(num.value < b.value && num.value >= c.value){
                output += (String.format("Student has a C grade\n"));
            }             else if(num.value < c.value && num.value >= d.value){
                output += (String.format("Student has a D grade\n"));
            }             else if(num.value < d.value){
                output += (String.format("Student has failed the course\n"));
            }             else {
                output += (String.format("there is some missunderstanding in threshold \n Please try again\n"));
            }
        }
        if(true)return;;
    }
}