package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_1391c9b132764431738ca64d39293c8f76de61bab8169ea5e4daf9d14441ee02bf9cf5e448136f7f58d730052ff1c3803688d9e65680d8b757ee1ffdabd4b01f_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_1391c9b132764431738ca64d39293c8f76de61bab8169ea5e4daf9d14441ee02bf9cf5e448136f7f58d730052ff1c3803688d9e65680d8b757ee1ffdabd4b01f_003 mainClass = new smallest_1391c9b132764431738ca64d39293c8f76de61bab8169ea5e4daf9d14441ee02bf9cf5e448136f7f58d730052ff1c3803688d9e65680d8b757ee1ffdabd4b01f_003();
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
        IntObj N1 = new IntObj(), N2 = new IntObj(), N3 = new IntObj(), N4 = new IntObj(), Small = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        N1.value = scanner.nextInt();
        N2.value = scanner.nextInt();
        N3.value = scanner.nextInt();
        N4.value = scanner.nextInt();
        if(N1.value < N2.value && N1.value < N3.value && N1.value < N4.value){
            Small.value = N1.value;
        }
        if(N2.value < N1.value && N2.value < N3.value && N2.value < N4.value){
            Small.value = N2.value;
        }
        if(N3.value < N1.value && N3.value < N2.value && N3.value < N4.value){
            Small.value = N3.value;
        }
        if(N4.value < N1.value && N4.value < N2.value && N4.value < N3.value){
            Small.value = N4.value;
        }
        output += (String.format("%d is the smallest \n", Small.value));
        if(true)return;;
    }
}