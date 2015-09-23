package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_007 mainClass = new digits_ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_007();
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
        IntObj x = new IntObj(), y = new IntObj();
        IntObj temp = new IntObj();
        output += (String.format("\nEnter an integer > "));
        y.value = scanner.nextInt();
        while(true){
            x.value = y.value % 10;
            if(Math.abs(y.value) > 10){
                output += (String.format("\n%d", Math.abs(x.value)));
            } else if(Math.abs(y.value) >= 0 && Math.abs(y.value) < 10){
                output += (String.format("\n%d", x.value));
                output += (String.format("\nThat's all, have a nice day!\n"));
                if(true)return;;
            }
            x.value = y.value / 10;
            temp.value = x.value;
            x.value = y.value;
            y.value = temp.value;
        }
        if(true)return;;
    }
}