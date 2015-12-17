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

public class digits_a0e3fdae_006 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_a0e3fdae_006 mainClass = new digits_a0e3fdae_006 ();
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
        IntObj integer = new IntObj ();
        IntObj mod = new IntObj ();
        IntObj flag = new IntObj (0);
        output += (String.format ("\n"));
        output += (String.format ("Enter an integer > "));
        integer.value = scanner.nextInt ();
        output += (String.format ("\n"));
        if (integer.value < 0) {
            integer.value = integer.value * (-1);
            flag.value = 1;
        }
        while (integer.value >= 10) {
            mod.value = integer.value % 10;
            output += (String.format ("%d\n", mod.value));
            integer.value /= 10;
        }
        if (flag.value != 0) {
            integer.value = integer.value * -1;
        }
        output += (String.format ("%d\n", integer.value));
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
