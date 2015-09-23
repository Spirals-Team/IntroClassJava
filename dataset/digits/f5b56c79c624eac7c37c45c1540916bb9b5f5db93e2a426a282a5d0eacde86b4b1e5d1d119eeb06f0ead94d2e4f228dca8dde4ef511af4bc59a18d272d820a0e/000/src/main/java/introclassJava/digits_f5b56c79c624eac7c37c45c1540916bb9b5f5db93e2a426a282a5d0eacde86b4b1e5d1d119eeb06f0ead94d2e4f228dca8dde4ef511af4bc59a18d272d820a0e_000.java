package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_000 mainClass = new digits_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_000();
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
        LongObj in = new LongObj(), num = new LongObj(), digit = new LongObj(), temp = new LongObj();
        IntObj a = new IntObj(0);
        output += (String.format("\nEnter an ingteger > "));
        in.value = scanner.nextLong();
        if(in.value > 0){
            num.value = 10;
            while(a.value <= 11){
                digit.value = in.value % num.value;
                digit.value = check(digit, (num / 10));
                if(digit.value == in.value){
                    break;
                }
                output += (String.format("%d\n", digit.value));
                num.value = num.value*10;
                a.value++;
            }
        } else if(in.value == 0){
            output += (String.format("0\n"));
        }         else {
            num.value = ( - 10);
            while(a.value <= 11){
                digit.value = in.value % (num.value);
                digit.value = check(( - digit), (num / 10));
                digit.value = digit.value*( - 1);
                num.value = num.value*10;
                a.value++;
                temp.value = in.value % num.value;
                temp.value = check(( - temp), (num / 10));
                temp.value = temp.value*( - 1);
                if(digit.value == 0){
                    break;
                }
                if(temp.value == 0){
                    output += (String.format("-%d\n", digit.value));
                } else {
                    output += (String.format("%d\n", digit.value));
                }
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
    public LongObj check (LongObj a, LongObj b) throws Exception {
        if(a.value >= b.value){
            a.value = a.value / b.value;
            return a.value;
        } else {
            return a.value;
        }
    }
}