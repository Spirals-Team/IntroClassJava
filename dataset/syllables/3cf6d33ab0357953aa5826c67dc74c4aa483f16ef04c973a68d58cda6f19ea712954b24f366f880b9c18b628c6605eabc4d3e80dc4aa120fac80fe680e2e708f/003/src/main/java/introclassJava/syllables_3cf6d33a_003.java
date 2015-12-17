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

public class syllables_3cf6d33a_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_3cf6d33a_003 mainClass = new syllables_3cf6d33a_003 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int STR_LENGTH = 20;
    public void exec () throws Exception {
        char[] string = new char[STR_LENGTH];
        IntObj x = new IntObj (), num = new IntObj ();
        num.value = STR_LENGTH - 1;
        output += (String.format ("Please enter a string > "));
        string = (scanner.nextLine () + "\n").toCharArray ();
        num.value = 0;
        for (x.value = 0; x.value <= string.length - 1; x.value++) {
            if (string[x.value] == 'a' || string[x.value] == 'e'
                    || string[x.value] == 'i' || string[x.value] == 'o'
                    || string[x.value] == 'u' || string[x.value] == 'y') {
                num.value += 1;
            }
        }
        output += (String.format ("The number of syllables is %d.\n", num.value));
        if (true)
            return;;
    }
}
