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

public class smallest_d9e7eab5_014 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_d9e7eab5_014 mainClass = new smallest_d9e7eab5_014 ();
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
        IntObj one = new IntObj ();
        IntObj two = new IntObj ();
        IntObj three = new IntObj ();
        IntObj four = new IntObj ();
        IntObj small = new IntObj ();
        IntObj smaller = new IntObj ();
        IntObj smallest = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        one.value = scanner.nextInt ();
        two.value = scanner.nextInt ();
        three.value = scanner.nextInt ();
        four.value = scanner.nextInt ();
        if (one.value <= two.value) {
            small.value = one.value;
        } else {
            small.value = two.value;
        }
        if (small.value <= three.value) {
            smaller.value = small.value;
        } else {
            smaller.value = three.value;
        }
        if (smaller.value <= four.value) {
            smallest.value = smaller.value;
        } else {
            smallest.value = four.value;
        }
        output += (String.format ("%d is the smallest", smallest.value));
        if (true)
            return;;
    }
}
