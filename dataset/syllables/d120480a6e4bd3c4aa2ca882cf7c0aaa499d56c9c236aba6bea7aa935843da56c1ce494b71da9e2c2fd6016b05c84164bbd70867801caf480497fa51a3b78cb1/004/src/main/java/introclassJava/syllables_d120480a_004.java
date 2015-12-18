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

public class syllables_d120480a_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_d120480a_004 mainClass = new syllables_d120480a_004 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int STR_LEN = 21;
    public void exec () throws Exception {
        char[] word = new char[STR_LEN];
        IntObj i = new IntObj (), count = new IntObj ();
        count.value = 0;
        output += (String.format ("Please enter a string > "));
        word = (scanner.nextLine () + "\n").toCharArray ();
        for (i.value = 0; i.value <= STR_LEN - 2; i.value++) {
            if (word[i.value] == 'a' || word[i.value] == 'e'
                    || word[i.value] == 'i' || word[i.value] == 'o'
                    || word[i.value] == 'u' || word[i.value] == 'y') {
                count.value = count.value + 1;
            }
            if (word[i.value] == '\n') {
                break;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", count.value));
        if (true)
            return;;
    }
}
