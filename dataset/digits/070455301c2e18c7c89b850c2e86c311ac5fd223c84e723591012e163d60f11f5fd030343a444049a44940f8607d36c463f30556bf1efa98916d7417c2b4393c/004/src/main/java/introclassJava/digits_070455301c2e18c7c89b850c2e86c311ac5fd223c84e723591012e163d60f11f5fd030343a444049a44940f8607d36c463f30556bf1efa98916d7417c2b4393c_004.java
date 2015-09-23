package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_004 mainClass = new digits_070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_004();
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
        IntObj n = new IntObj(), r = new IntObj(), nn = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        if(n.value == 0){
            output += (String.format("\n0"));
        }
        while(n.value != 0){
            if(n.value < 0){
                n.value =  - n.value;
                while(n.value != 0){
                    r.value = n.value % 10;
                    nn.value = n.value / 10;
                    if(n.value < 10){
                        output += (String.format("\n-%d", r.value));
                    } else if(n.value >= 10){
                        output += (String.format("\n%d", r.value));
                    }
                    n.value = nn.value;
                }
            } else {
                r.value = n.value % 10;
                nn.value = n.value / 10;
                n.value = nn.value;
                output += (String.format("\n%d", r.value));
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}