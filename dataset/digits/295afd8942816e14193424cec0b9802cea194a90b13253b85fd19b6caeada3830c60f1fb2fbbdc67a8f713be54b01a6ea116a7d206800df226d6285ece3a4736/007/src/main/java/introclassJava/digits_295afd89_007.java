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

public class digits_295afd89_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_295afd89_007 mainClass = new digits_295afd89_007 ();
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
        IntObj n = new IntObj ();
        IntObj rem = new IntObj ();
        IntObj negtemp = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        n.value = scanner.nextInt ();
        while (n.value >= 10) {
            rem.value = n.value % 10;
            n.value = n.value / 10;
            output += (String.format ("\n%d", rem.value));
        }
        while (n.value <= -10) {
            rem.value = n.value % 10;
            n.value = n.value / 10;
            negtemp.value = Math.abs (rem.value);
            output += (String.format ("\n%d", negtemp.value));
        }
        rem.value = n.value % 10;
        output += (String.format ("\n%d", rem.value));
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
