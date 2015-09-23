package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000 mainClass = new median_d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000();
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
        if((int1.value < int2.value && int1.value > int3.value) || (int1.value > int2.value && int1.value < int3.value)){
            output += (String.format("%d is the median\n", int1.value));
        } else if((int2.value < int3.value && int2.value > int1.value) || (int2.value > int3.value && int2.value < int1.value)){
            output += (String.format("%d is the median\n", int2.value));
        }         else {
            output += (String.format("%d is the median\n", int3.value));
        }
        if(true)return;;
    }
}