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

public class syllables_dc11fbc9_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_dc11fbc9_000 mainClass = new syllables_dc11fbc9_000 ();
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
        IntObj size = new IntObj (20);
        IntObj vowels = new IntObj (0);
        char[] n = new char[size.value];
        output += (String.format ("Please enter a string > "));
        n = (scanner.nextLine () + "\n").toCharArray ();
        IntObj i = new IntObj ();
        for (i.value = 0; i.value < n.length; i.value++) {
            if (n[i.value] == 'a' || n[i.value] == 'e' || n[i.value] == 'i'
                    || n[i.value] == 'o' || n[i.value] == 'u' || n[i.value] == 'y') {
                vowels.value++;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", vowels.value));
        if (true)
            return;;
    }
}
