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

public class syllables_824eb077_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_824eb077_001 mainClass = new syllables_824eb077_001 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int SIZE = 21;
    public void exec () throws Exception {
        char[] str = new char[SIZE];
        IntObj i = new IntObj (), count = new IntObj ();
        output += (String.format ("Please enter a string > "));
        str = (scanner.nextLine () + "\n").toCharArray ();
        count.value = 0;
        for (i.value = 0; i.value < str.length; i.value++) {
            if (str[i.value] == 'a' || str[i.value] == 'e' || str[i.value] == 'i'
                    || str[i.value] == 'o' || str[i.value] == 'u'
                    || str[i.value] == 'y') {
                ++count.value;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", count.value));
        if (true)
            return;;
    }
}
