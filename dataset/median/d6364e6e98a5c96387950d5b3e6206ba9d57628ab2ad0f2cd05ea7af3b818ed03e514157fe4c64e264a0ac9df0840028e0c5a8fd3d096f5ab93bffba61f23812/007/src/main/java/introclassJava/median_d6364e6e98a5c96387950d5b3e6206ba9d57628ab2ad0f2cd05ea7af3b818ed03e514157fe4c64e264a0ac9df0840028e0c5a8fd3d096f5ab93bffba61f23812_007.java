package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_007 mainClass = new median_d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_007();
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
        float[] data = new float[3], temp = new FloatObj(0);
        output += (String.format("Please enter three numbers separated by spaces > "));
        ;
        while(!((data[1] <= data[2]) && (data[2] <= data[3]))){
            output += (String.format("Before swaps:  %f, %f, %f\n", data[1], data[2], data[3]));
            if(data[2] < data[1]){
                temp.value = data[2];
                data[2] = data[1];
                data[1] = temp.value;
                output += (String.format("Swap 2 & 1 for %f, %f, %f\n", data[1], data[2], data[3]));
            }
            if(data[3] < data[2]){
                temp.value = data[2];
                data[2] = data[3];
                data[3] = temp.value;
                output += (String.format("Swap 2 & 3 for %f, %f, %f\n", data[1], data[2], data[3]));
            }
            output += (String.format("After swaps: %f, %f, %f\n", data[1], data[2], data[3]));
        }
        output += (String.format("%.0f is the median\n", data[2]));
        if(true)return;;
    }
}