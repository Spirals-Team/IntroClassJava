package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_002 mainClass = new syllables_c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_002();
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
        char[] str = new char[20];
        IntObj i = new IntObj(), count = new IntObj();
        output += (String.format("Please enter a string > "));
        str = scanner.nextLine().toCharArray();
        i.value = 0;
        count.value = 0;
        while(i.value < str.length){
            if(str[i.value] == 'a' || str[i.value] == 'e' || str[i.value] == 'i' || str[i.value] == 'o' || str[i.value] == 'u' || str[i.value] == 'y'){
                ++count.value;
            }
            i.value = i.value + 1;
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}