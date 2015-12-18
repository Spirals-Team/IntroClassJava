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

public class digits_f227ed28_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_f227ed28_003 mainClass = new digits_f227ed28_003 ();
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
        IntObj num = new IntObj (0), rem = new IntObj (0), count = new IntObj (1);
        CharObj sign = new CharObj ('\0');
        output += (String.format ("\nEnter an integer > \n"));
        num.value = scanner.nextInt ();
        if (num.value < 0) {
            sign.value = '-';
            num.value = num.value * (-1);
        }
        while (count.value <= 10 && num.value != 0) {
            rem.value = num.value % 10;
            num.value = num.value - rem.value;
            num.value = num.value / 10;
            count.value++;
            if (num.value == 0 && sign.value != '\0') {
                output += (String.format ("%c%d\n", sign.value, rem.value));
            } else {
                output += (String.format ("%d\n", rem.value));
            }
        }
        if (num.value == 0 && count.value == 1) {
            output += (String.format ("%d\n", num.value));
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
