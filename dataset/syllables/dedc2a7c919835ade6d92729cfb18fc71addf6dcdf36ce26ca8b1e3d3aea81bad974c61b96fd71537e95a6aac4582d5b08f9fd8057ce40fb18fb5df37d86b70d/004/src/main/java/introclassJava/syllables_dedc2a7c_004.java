package introclassJava;

class IntObj {
    public int value;
    public IntObj () {
    } public IntObj (int i) {
        value = i;
    }
}

class FloatObj {
    public float value;
    public FloatObj () {
    } public FloatObj (float i) {
        value = i;
    }
}

class LongObj {
    public long value;
    public LongObj () {
    } public LongObj (long i) {
        value = i;
    }
}

class DoubleObj {
    public double value;
    public DoubleObj () {
    } public DoubleObj (double i) {
        value = i;
    }
}

class CharObj {
    public char value;
    public CharObj () {
    } public CharObj (char i) {
        value = i;
    }
}

public class syllables_dedc2a7c_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_dedc2a7c_004 mainClass = new syllables_dedc2a7c_004 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        IntObj i = new IntObj (), counter = new IntObj ();
        char[] words = new char[20];
        output += (String.format ("Please enter a string > "));
        words = (scanner.nextLine () + "\n").toCharArray ();
        i.value = 0;
        counter.value = 0;
        while (i.value < (words.length - 1)) {
            if (words[i.value] == 'a' || words[i.value] == 'e'
                    || words[i.value] == 'i' || words[i.value] == 'o'
                    || words[i.value] == 'u' || words[i.value] == 'y') {
                i.value++;
                counter.value++;
            } else {
                i.value++;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", counter.value));
        if (true)
            return;;
    }
}
