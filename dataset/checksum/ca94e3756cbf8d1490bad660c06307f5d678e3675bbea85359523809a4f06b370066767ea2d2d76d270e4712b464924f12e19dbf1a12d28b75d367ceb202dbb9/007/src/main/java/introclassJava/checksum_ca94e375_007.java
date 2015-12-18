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

public class checksum_ca94e375_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_ca94e375_007 mainClass = new checksum_ca94e375_007 ();
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
        CharObj x = new CharObj ();
        IntObj rem = new IntObj ();
        IntObj sum = new IntObj ();
        IntObj checksum = new IntObj ();
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        try {
            x.value = scanner.findInLine (".").charAt (0);
        } catch (java.lang.NullPointerException e) {
            x.value = '\n';
        };
        sum.value = 0;
        while (x.value != '\n') {
            sum.value = sum.value + x.value;
            try {
                x.value = scanner.findInLine (".").charAt (0);
            } catch (java.lang.NullPointerException e) {
                x.value = '\n';
            };
        }
        rem.value = sum.value % 64;
        checksum.value = rem.value + ' ';
        output += (String.format ("Check sum is %c\n", checksum.value));
        if (true)
            return;;
    }
}
