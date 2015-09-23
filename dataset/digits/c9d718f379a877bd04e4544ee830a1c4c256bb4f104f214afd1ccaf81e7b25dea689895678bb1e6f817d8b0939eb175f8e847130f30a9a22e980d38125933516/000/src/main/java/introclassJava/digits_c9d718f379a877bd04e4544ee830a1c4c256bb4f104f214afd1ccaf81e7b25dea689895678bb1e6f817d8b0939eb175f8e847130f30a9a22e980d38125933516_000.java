package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_000 mainClass = new digits_c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_000();
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
        IntObj value = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        value.value = scanner.nextInt();
        output += (String.format("\n"));
        if(value.value >= 0){
            while(value.value!=0){
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
        }
        if(value.value < 0){
            value.value = Math.abs(value.value);
            while(value.value > 10){
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
            digit.value = value.value % 10;
            output += (String.format("-%d\n", digit.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}