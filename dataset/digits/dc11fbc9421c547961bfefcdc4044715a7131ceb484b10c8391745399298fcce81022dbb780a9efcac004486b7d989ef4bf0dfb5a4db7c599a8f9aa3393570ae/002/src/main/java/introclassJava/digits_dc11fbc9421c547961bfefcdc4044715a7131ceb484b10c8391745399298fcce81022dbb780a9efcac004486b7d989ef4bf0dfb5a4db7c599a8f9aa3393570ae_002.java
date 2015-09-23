package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_002 mainClass = new digits_dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_002();
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
        IntObj n = new IntObj();
        int[] d = new int[9];
        IntObj negative = new IntObj(0);
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        IntObj size = new IntObj(0);
        while(Math.abs(n.value) >= Math.pow(10, size.value)){
            size.value++;
        }
        if(n.value == 0){
            size.value++;
        }
        if(n.value < 0){
            negative.value = 1;
        }
        IntObj i = new IntObj();
        for(i.value = 0; i.value < 10; i.value++) {
            IntObj remainder = new IntObj(n.value % (int)Math.pow(10, i.value + 1));
            IntObj multiplier = new IntObj(Math.pow(10, i.value));
            d[i.value] = remainder.value / multiplier.value;
            n.value-=remainder.value;
        }
        if(negative.value != 0){
            for(i.value = 0; i.value < size.value - 1; i.value++) {
                output += (String.format("%d\n", d[i.value]* - 1));
            }
            output += (String.format("%d\n", d[size.value - 1]));
        } else {
            for(i.value = 0; i.value < size.value; i.value++) {
                output += (String.format("%d\n", d[i.value]));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}