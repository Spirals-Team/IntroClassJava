package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new syllables_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
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
        char[] string = new char[19];
        IntObj num_syl = new IntObj(0);
        IntObj index = new IntObj(0);
        output += (String.format("Please enter a string > "));
        string = (scanner.nextLine() + "\n").toCharArray();
        while(index.value < 19){
            if((string[index.value] == 'a') || (string[index.value] == 'e') || (string[index.value] == 'i') || (string[index.value] == 'o') || (string[index.value] == 'u') || (string[index.value] == 'y')){
                num_syl.value = num_syl.value + 1;
            }
            index.value = index.value + 1;
        }
        output += (String.format("The number of syllables is %d.\n", num_syl.value));
        if(true)return;;
    }
}