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

public class digits_d8b26284_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_d8b26284_001 mainClass = new digits_d8b26284_001 ();
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
        IntObj num = new IntObj (), s = new IntObj ();
        s.value = 0;
        output += (String.format ("\nEnter an integer > "));
        num.value = scanner.nextInt ();
        if (num.value == 0) {
            output +=
                (String.format ("\n%d\nThat's all, have a nice day!\n", s.value));
        }
        if (num.value > 0) {
            do {
                output += (String.format ("\n%d", num.value % 10));
                num.value /= 10;
            } while (num.value > 0);
            output += (String.format ("\nThat's all, have a nice day!\n"));
        } else if (num.value < 0) {
            do {
                if (num.value < -10) {
                    output += (String.format ("\n%d", (-1) * (num.value % 10)));
                    num.value /= 10;
                } else {
                    output += (String.format ("\n%d", num.value % 10));
                    num.value /= 10;
                }
            } while (num.value < 0);
            output += (String.format ("\nThat's all, have a nice day!\n"));
        }
        if (true)
            return;;
    }
}
