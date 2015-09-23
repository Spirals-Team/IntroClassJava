package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_007 mainClass = new digits_f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_007();
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
        LongObj in = new LongObj(), num = new LongObj(), digit = new LongObj(), temp = new LongObj(), lost = new LongObj(), value = new LongObj();
        IntObj a = new IntObj(0);
        output += (String.format("\nEnter an ingteger > "));
        in.value = scanner.nextLong();
        output += (String.format("\n"));
        if(in.value > 0){
            num.value = 10;
            while(a.value <= 12){
                value.value = in.value % num.value;
                if(lost.value == value.value){
                    digit.value = 0;
                } else {
                    digit.value = check(value, (num / 10));
                }
                lost.value = value.value;
                num.value = num.value*10;
                temp.value = in.value % num.value;
                temp.value = check(temp, (num / 10));
                if(temp.value == in.value){
                    output += (String.format("%d\n", digit.value));
                    break;
                } else {
                    output += (String.format("%d\n", digit.value));
                }
                a.value++;
            }
        } else if(in.value == 0){
            output += (String.format("0\n"));
        }         else {
            num.value = ( - 10);
            while(a.value <= 12){
                value.value = in.value % (num.value);
                if(lost.value == value.value){
                    digit.value = 0;
                } else {
                    digit.value = check(( - value), ( - (num / 10)));
                }
                lost.value = value.value;
                num.value = num.value*10;
                temp.value = in.value % num.value;
                temp.value = check(( - temp), ( - (num / 10)));
                if(temp.value == ( - in.value)){
                    output += (String.format("-%d\n", digit.value));
                    break;
                } else {
                    output += (String.format("%d\n", digit.value));
                }
                a.value++;
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