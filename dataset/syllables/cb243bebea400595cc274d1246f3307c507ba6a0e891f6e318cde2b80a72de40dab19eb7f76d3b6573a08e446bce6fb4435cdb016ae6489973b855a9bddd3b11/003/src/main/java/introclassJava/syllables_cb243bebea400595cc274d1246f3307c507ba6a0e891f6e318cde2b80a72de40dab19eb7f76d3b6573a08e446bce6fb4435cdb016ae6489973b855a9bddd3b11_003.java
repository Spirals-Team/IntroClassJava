package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_003 mainClass = new syllables_cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int LEN = 20;
    public void exec () throws Exception {
        char[] line = new char[LEN];
        IntObj i = new IntObj(), count = new IntObj();
        output += (String.format("Please enter a string > "));
        line = (scanner.nextLine() + "\n").toCharArray();
        count.value = 0;
        for(i.value = 0; i.value < line.length; i.value+=1) {
            if(i.value < 18){
                if(line[i.value] == 'a'){
                    count.value+=1;
                } else if(line[i.value] == 'e'){
                    count.value+=1;
                }                 else if(line[i.value] == 'i'){
                    count.value+=1;
                }                 else if(line[i.value] == 'o'){
                    count.value+=1;
                }                 else if(line[i.value] == 'u'){
                    count.value+=1;
                }                 else if(line[i.value] == 'y'){
                    count.value+=1;
                }
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}