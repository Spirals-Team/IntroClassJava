package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_012 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_012 mainClass = new median_93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_012();
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
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        if(((int1.value <= int2.value) && (int1.value >= int3.value)) || ((int1.value <= int2.value) && (int1.value >= int3.value))){
            output += (String.format("%d is the median\n", int1.value));
        } else if((((int2.value <= int1.value)) && (int2.value >= int3.value)) || ((int2.value <= int3.value) && (int2.value >= int1.value))){
            output += (String.format("%d is the median\n", int2.value));
        }         else if(((int3.value <= int1.value) && (int3.value >= int2.value)) || ((int3.value <= int2.value) && (int3.value >= int1.value))){
            output += (String.format("%d is the median\n", int3.value));
        }
        if(true)return;;
    }
}