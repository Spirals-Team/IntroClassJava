package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_004 mainClass = new digits_89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_004();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public IntObj find_length (IntObj x) throws Exception {
        IntObj length = new IntObj();
        length.value = 0;
        while(x.value!=0){
            x.value/=10;
            length.value+=1;
        }
        return (length.value);
    }
    public void exec () throws Exception {
        IntObj n = new IntObj(), length = new IntObj(), digits = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        if(n.value == 0){
            output += (String.format("0\n"));
        } else {
            length.value = find_length(n);
            while(length.value!=0){
                if(n.value < 0 && length.value!=1){
                    digits.value = Math.abs(n.value) % 10;
                } else {
                    digits.value = n.value % 10;
                }
                n.value = n.value / 10;
                length.value = length.value - 1;
                output += (String.format("%d\n", digits.value));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}