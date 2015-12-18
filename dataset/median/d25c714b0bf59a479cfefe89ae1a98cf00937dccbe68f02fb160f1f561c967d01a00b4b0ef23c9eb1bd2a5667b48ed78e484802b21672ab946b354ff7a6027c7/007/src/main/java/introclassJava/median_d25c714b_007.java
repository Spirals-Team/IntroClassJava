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

public class median_d25c714b_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_d25c714b_007 mainClass = new median_d25c714b_007 ();
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
        IntObj A = new IntObj (), B = new IntObj (), C = new IntObj ();
        IntObj Small = new IntObj (), Large = new IntObj ();
        IntObj Median = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        A.value = scanner.nextInt ();
        B.value = scanner.nextInt ();
        C.value = scanner.nextInt ();
        if (A.value > B.value) {
            Large.value = A.value;
            Small.value = B.value;
        } else {
            Large.value = B.value;
            Small.value = A.value;
        }
        if (C.value > Large.value) {
            Median.value = Large.value;
        } else if (C.value < Small.value) {
            Median.value = Small.value;
        } else {
            Median.value = C.value;
        }
        output += (String.format ("%d is the median\n", Median.value));
        if (true)
            return;;
    }
}
