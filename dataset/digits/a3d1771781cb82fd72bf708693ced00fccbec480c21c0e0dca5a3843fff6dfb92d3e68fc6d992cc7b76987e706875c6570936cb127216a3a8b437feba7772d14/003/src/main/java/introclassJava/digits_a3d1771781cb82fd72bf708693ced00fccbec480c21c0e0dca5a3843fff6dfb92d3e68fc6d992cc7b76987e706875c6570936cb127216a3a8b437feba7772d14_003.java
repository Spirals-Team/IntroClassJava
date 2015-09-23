package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_a3d1771781cb82fd72bf708693ced00fccbec480c21c0e0dca5a3843fff6dfb92d3e68fc6d992cc7b76987e706875c6570936cb127216a3a8b437feba7772d14_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_a3d1771781cb82fd72bf708693ced00fccbec480c21c0e0dca5a3843fff6dfb92d3e68fc6d992cc7b76987e706875c6570936cb127216a3a8b437feba7772d14_003 mainClass = new digits_a3d1771781cb82fd72bf708693ced00fccbec480c21c0e0dca5a3843fff6dfb92d3e68fc6d992cc7b76987e706875c6570936cb127216a3a8b437feba7772d14_003();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        IntObj n = new IntObj(), q = new IntObj(0), d10 = new IntObj(), d9 = new IntObj(), d8 = new IntObj(), d7 = new IntObj(), d6 = new IntObj(), d5 = new IntObj(), d4 = new IntObj(), d3 = new IntObj(), d2 = new IntObj(), d1 = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        if(n.value < 0){
            q.value = 11;
            n.value = Math.abs(n.value);
        }
        d1.value = n.value % 10;
        d2.value = (n.value % 100 - n.value % 10) / 10;
        d3.value = (n.value % 1000 - n.value % 100) / 100;
        d4.value = (n.value % 10000 - n.value % 1000) / 1000;
        d5.value = (n.value % 100000 - n.value % 10000) / 10000;
        d6.value = (n.value % 1000000 - n.value % 100000) / 100000;
        d7.value = (n.value % 10000000 - n.value % 1000000) / 1000000;
        d8.value = (n.value % 100000000 - n.value % 10000000) / 10000000;
        d9.value = (n.value % 1000000000 - n.value % 100000000) / 100000000;
        d10.value = (n.value % 10000000000L - n.value % 1000000000) / 1000000000;
        if(q.value == 11){
            if(n.value < 10){
                q.value = 1;
            } else if(n.value < 100){
                q.value = 2;
            }             else if(n.value < 1000){
                q.value = 3;
            }             else if(n.value < 10000){
                q.value = 4;
            }             else if(n.value < 100000){
                q.value = 5;
            }             else if(n.value < 1000000){
                q.value = 6;
            }             else if(n.value < 10000000){
                q.value = 7;
            }             else if(n.value < 100000000){
                q.value = 8;
            }             else if(n.value < 1000000000){
                q.value = 9;
            }             else if(n.value < 10000000000L){
                q.value = 10;
            }
            if(q.value == 1){
                d1.value*= - 1;
            }
            if(q.value == 2){
                d2.value*= - 1;
            }
            if(q.value == 3){
                d3.value*= - 1;
            }
            if(q.value == 4){
                d4.value*= - 1;
            }
            if(q.value == 5){
                d5.value*= - 1;
            }
            if(q.value == 6){
                d6.value*= - 1;
            }
            if(q.value == 7){
                d7.value*= - 1;
            }
            if(q.value == 8){
                d8.value*= - 1;
            }
            if(q.value == 9){
                d9.value*= - 1;
            }
            if(q.value == 10){
                d10.value*= - 1;
            }
        }
        if(q.value == 0){
            if(n.value < 10){
                q.value = 1;
            } else if(n.value < 100){
                q.value = 2;
            }             else if(n.value < 1000){
                q.value = 3;
            }             else if(n.value < 10000){
                q.value = 4;
            }             else if(n.value < 100000){
                q.value = 5;
            }             else if(n.value < 1000000){
                q.value = 6;
            }             else if(n.value < 10000000){
                q.value = 7;
            }             else if(n.value < 100000000){
                q.value = 8;
            }             else if(n.value < 1000000000){
                q.value = 9;
            }             else if(n.value < 10000000000L){
                q.value = 10;
            }
        }
        if(q.value >= 1){
            output += (String.format("\n%d", d1.value));
        }
        if(q.value >= 2){
            output += (String.format("\n%d", d2.value));
        }
        if(q.value >= 3){
            output += (String.format("\n%d", d3.value));
        }
        if(q.value >= 4){
            output += (String.format("\n%d", d4.value));
        }
        if(q.value >= 5){
            output += (String.format("\n%d", d5.value));
        }
        if(q.value >= 6){
            output += (String.format("\n%d", d6.value));
        }
        if(q.value >= 7){
            output += (String.format("\n%d", d7.value));
        }
        if(q.value >= 8){
            output += (String.format("\n%d", d8.value));
        }
        if(q.value >= 9){
            output += (String.format("\n%d", d9.value));
        }
        if(q.value >= 10){
            output += (String.format("\n%d", d10.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}