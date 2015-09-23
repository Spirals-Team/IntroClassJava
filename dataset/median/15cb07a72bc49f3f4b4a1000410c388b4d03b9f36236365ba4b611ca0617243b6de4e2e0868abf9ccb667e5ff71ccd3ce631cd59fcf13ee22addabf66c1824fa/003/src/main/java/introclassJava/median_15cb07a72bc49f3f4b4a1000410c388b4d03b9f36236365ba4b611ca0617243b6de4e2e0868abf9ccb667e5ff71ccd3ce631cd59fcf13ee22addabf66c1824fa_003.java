package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003 mainClass = new median_15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003();
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
        IntObj frst = new IntObj(), scnd = new IntObj(), thrd = new IntObj(), cmp1 = new IntObj(), cmp2 = new IntObj(), med = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        frst.value = scanner.nextInt();
        scnd.value = scanner.nextInt();
        thrd.value = scanner.nextInt();
        if(frst.value <= scnd.value){
            cmp1.value = frst.value;
        } else {
            cmp1.value = scnd.value;
        }
        if(scnd.value <= thrd.value){
            cmp2.value = scnd.value;
        } else {
            cmp2.value = thrd.value;
        }
        if(cmp1.value >= cmp2.value){
            med.value = cmp1.value;
        } else {
            med.value = cmp2.value;
        }
        output += (String.format("%d is lesser of first 2\n%d is lesser of second 2\n", cmp1.value, cmp2.value));
        output += (String.format("%d is the median\n", med.value));
        if(true)return;;
    }
}