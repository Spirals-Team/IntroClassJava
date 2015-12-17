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

public class syllables_d767ad3b_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_d767ad3b_003 mainClass = new syllables_d767ad3b_003 ();
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
        IntObj sum = new IntObj (), i = new IntObj ();
        char[] num_syl = new char[STR_LEN];
        output += (String.format ("Please enter a string > "));
        num_syl = (scanner.nextLine () + "\n").toCharArray ();
        sum.value = 0;
        for (i.value = 0; i.value < num_syl.length; i.value++) {
            if ((num_syl[i.value] == 'a') || (num_syl[i.value] == 'e')
                    || (num_syl[i.value] == 'i') || (num_syl[i.value] == 'o')
                    || (num_syl[i.value] == 'u') || (num_syl[i.value] == 'y')) {
                sum.value = sum.value + 1;
            }
        }
        output +=
            (String.format ("\nThe number of syllables is %d.\n", sum.value));
        if (true)
            return;;
    }
}
