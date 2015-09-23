package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_68ea5d3466c7a9fb4a9219015d32f37de45f50df920793d79bc6028242a1913e9fa55a6da8262f1bc1f64b15e481dcd74d30dc36a54704a8abeac07d06f0f591_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_68ea5d3466c7a9fb4a9219015d32f37de45f50df920793d79bc6028242a1913e9fa55a6da8262f1bc1f64b15e481dcd74d30dc36a54704a8abeac07d06f0f591_000 mainClass = new digits_68ea5d3466c7a9fb4a9219015d32f37de45f50df920793d79bc6028242a1913e9fa55a6da8262f1bc1f64b15e481dcd74d30dc36a54704a8abeac07d06f0f591_000();
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
        IntObj input = new IntObj(), rem = new IntObj(), absinput = new IntObj(), adummy = new IntObj(), bdummy = new IntObj(), D = new IntObj(), cdummy = new IntObj();
        output += (String.format("Enter an integer > "));
        input.value = scanner.nextInt();
        adummy.value = 0;
        cdummy.value = 1;
        while(cdummy.value == 1){
            bdummy.value = input.value % (int) (Math.pow(10, ((float)adummy.value)));
            if(bdummy.value == input.value){
                D.value = adummy.value;
                cdummy.value = 0;
            }
            adummy.value++;
        }
        adummy.value = 0;
        absinput.value = Math.abs(input.value);
        while(adummy.value < (D.value - 1)){
            rem.value = (absinput.value / ((int) (Math.pow(10, ((float)adummy.value))))) % 10;
            output += (String.format("%d\n", rem.value));
            adummy.value++;
        }
        rem.value = (input.value / ((int) (Math.pow(10, ((float) (D.value - 1)))))) % 10;
        output += (String.format("%d\n", rem.value));
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}