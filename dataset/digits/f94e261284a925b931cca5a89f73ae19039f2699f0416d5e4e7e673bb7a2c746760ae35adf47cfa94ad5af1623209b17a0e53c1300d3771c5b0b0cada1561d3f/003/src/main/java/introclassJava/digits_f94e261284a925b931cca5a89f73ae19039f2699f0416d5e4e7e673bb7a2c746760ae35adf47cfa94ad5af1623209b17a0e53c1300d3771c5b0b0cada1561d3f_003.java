package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_f94e261284a925b931cca5a89f73ae19039f2699f0416d5e4e7e673bb7a2c746760ae35adf47cfa94ad5af1623209b17a0e53c1300d3771c5b0b0cada1561d3f_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_f94e261284a925b931cca5a89f73ae19039f2699f0416d5e4e7e673bb7a2c746760ae35adf47cfa94ad5af1623209b17a0e53c1300d3771c5b0b0cada1561d3f_003 mainClass = new digits_f94e261284a925b931cca5a89f73ae19039f2699f0416d5e4e7e673bb7a2c746760ae35adf47cfa94ad5af1623209b17a0e53c1300d3771c5b0b0cada1561d3f_003();
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
        IntObj n = new IntObj(), a = new IntObj(), nn = new IntObj(), nnn = new IntObj(), count = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        nnn.value = n.value;
        n.value = Math.abs(n.value);
        nn.value = n.value;
        a.value = 1;
        count.value = 0;
        if(n.value == 0){
            ;
        }
        output += (String.format("\n0\n"));
        while(nn.value!=0){
            nn.value = nn.value / 10;
            count.value = count.value + 1;
        }
        while(a.value <= count.value){
            digit.value = n.value % (int)Math.pow(10, a.value);
            if((digit.value < 10) && (a.value == 1))
    
    
    
    {
                output += (String.format("\n%d\n", digit.value));
            } else if((digit.value >= 10) || (digit.value == 0)){
                digit.value = digit.value / Math.pow(10, a.value - 1);
                if((((a.value) == count.value)) && (nnn.value < 0)){
                    digit.value = digit.value* - 1;
                    output += (String.format("%d\n", digit.value));
                } else {
                    output += (String.format("%d\n", digit.value));
                }
            }
            n.value = n.value - digit.value;
            a.value = a.value + 1;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}