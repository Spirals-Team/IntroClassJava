package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_346b1d3c1cdc3032d07222a8a5e0027a2abf95bb1697b9d367d7cca7db1af769d8298e232c56471a122f05e87e79f4bd965855c9c0f8b173ebc0ef5d0abebc7b_005 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_346b1d3c1cdc3032d07222a8a5e0027a2abf95bb1697b9d367d7cca7db1af769d8298e232c56471a122f05e87e79f4bd965855c9c0f8b173ebc0ef5d0abebc7b_005 mainClass = new digits_346b1d3c1cdc3032d07222a8a5e0027a2abf95bb1697b9d367d7cca7db1af769d8298e232c56471a122f05e87e79f4bd965855c9c0f8b173ebc0ef5d0abebc7b_005();
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
        IntObj n = new IntObj(), rem = new IntObj(), digit = new IntObj(), neww = new IntObj(), x = new IntObj();
        output += (String.format("\nEnter an integer > "));
        x.value = scanner.nextInt();
        if(x.value == 0){
            output += (String.format("\n0"));
        }
        for(n.value = x.value; n.value > 0; n.value = n.value / 10) {
            digit.value = (n.value % 10);
            output += (String.format("\n%d", digit.value));
        }
        for(n.value = x.value; n.value < 0; n.value = n.value / 10) {
            neww = n.value % 10;
            digit.value = Math.abs(neww);
            rem.value = Math.abs(n.value);
            if(rem.value >= 10){
                output += (String.format("\n%d", digit.value));
            }
            if(rem.value < 10){
                output += (String.format("\n-%d", rem.value));
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}