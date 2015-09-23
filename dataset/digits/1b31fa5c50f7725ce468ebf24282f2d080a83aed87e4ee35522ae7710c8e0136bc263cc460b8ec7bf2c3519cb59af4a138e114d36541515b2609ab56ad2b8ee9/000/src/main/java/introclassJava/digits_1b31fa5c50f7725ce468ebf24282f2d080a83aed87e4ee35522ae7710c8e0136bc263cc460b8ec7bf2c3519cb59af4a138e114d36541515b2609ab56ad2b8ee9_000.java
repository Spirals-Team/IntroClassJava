package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_000 mainClass = new digits_1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_000();
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
        IntObj test = new IntObj(), remainder = new IntObj(), status = new IntObj(), n = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        status.value = n.value;
        test.value = status.value;
        output += (String.format("\n"));
        if(n.value < 0){
            n.value = n.value* - 1;
        }
        while(test.value!=0){
            remainder.value = n.value % 10;
            n.value = n.value / 10;
            test.value = n.value;
            if((status.value < 0) && (n.value == 0)){
                remainder.value =  - 1*remainder.value;
            }
            output += (String.format("%d\n", remainder.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}