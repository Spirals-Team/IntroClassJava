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

public class median_1c2bb3a4_016 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_1c2bb3a4_016 mainClass = new median_1c2bb3a4_016 ();
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
        IntObj x = new IntObj (), y = new IntObj (), z = new IntObj (), temp =
            new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        x.value = scanner.nextInt ();
        y.value = scanner.nextInt ();
        z.value = scanner.nextInt ();
        if (x.value >= y.value) {
            temp.value = x.value;
            x.value = y.value;
            y.value = temp.value;
        }
        if (x.value >= z.value) {
            temp.value = x.value;
            x.value = z.value;
            z.value = temp.value;
        }
        if (y.value >= z.value) {
            x.value = z.value;
        } else {
            x.value = y.value;
        }
        output += (String.format ("%d is the median\n", x.value));
        if (true)
            return;;
    }
}
