package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_007 mainClass = new digits_d767ad3b58111a0515c8a380d3bf376038066f24de65f5f88606f956c354f1750f5dc2e8fd647dfbbdae7a8dd70f3d8b3345ba7075534b8ed3aa344789cf73c2_007();
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
        IntObj num = new IntObj();
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        if(num.value == 0){
            output += (String.format("\n0\nThat's all, have a nice day!\n"));
        }
        while(num.value < 0){
            num.value =  - num.value;
            output += (String.format("\n%d", num.value % 10));
            num.value = num.value / 10;
            if(num.value < 10){
                output += (String.format("\n%dThat's all, have a nice day!\n",  - num.value));
            }
        }
        while((num.value <= 9999999999L) && (num.value > 0)){
            output += (String.format("\n%d", num.value % 10));
            num.value = num.value / 10;
            if(num.value == 0){
                output += (String.format("\nThat's all, have a nice day!\n"));
                break;
            }
        }
        if(true)return;;
    }
}