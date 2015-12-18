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

public class syllables_98d873cd_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_98d873cd_000 mainClass = new syllables_98d873cd_000 ();
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
        char[] string = new char[20];
        IntObj n = new IntObj (), m = new IntObj (), syl = new IntObj ();
        output += (String.format ("Please enter a string > "));
        string = (scanner.nextLine () + "\n").toCharArray ();
        n.value = string.length;
        m.value = 0;
        syl.value = 0;
        while (m.value < n.value) {
            if (string[m.value] == 'a' || string[m.value] == 'e'
                    || string[m.value] == 'i' || string[m.value] == 'o'
                    || string[m.value] == 'u' || string[m.value] == 'y') {
                syl.value++;
            }
            m.value++;
        }
        output += (String.format ("The number of syllables is %d.\n", syl.value));
        if (true)
            return;;
    }
}
