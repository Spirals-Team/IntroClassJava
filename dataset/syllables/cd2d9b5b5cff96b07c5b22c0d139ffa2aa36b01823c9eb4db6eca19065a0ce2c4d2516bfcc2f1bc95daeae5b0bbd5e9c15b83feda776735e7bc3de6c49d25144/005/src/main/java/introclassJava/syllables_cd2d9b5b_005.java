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

public class syllables_cd2d9b5b_005 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_cd2d9b5b_005 mainClass = new syllables_cd2d9b5b_005 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int LINE_LEN = 20;
    public void exec () throws Exception {
        char[] string = new char[LINE_LEN];
        IntObj i = new IntObj (), count = new IntObj (), len = new IntObj ();
        output += (String.format ("Please enter a string > "));
        string = (scanner.nextLine () + "\n").toCharArray ();
        len.value = string.length;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (string[i.value] == 'a' || string[i.value] == 'e'
                    || string[i.value] == 'i' || string[i.value] == 'o'
                    || string[i.value] == 'u' || string[i.value] == 'y') {
                count.value++;
            }
        }
        output += (String.format ("The number of syllables is %d.", count.value));
        if (true)
            return;;
    }
}
