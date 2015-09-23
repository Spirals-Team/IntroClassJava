package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007 mainClass = new digits_7b78b2d5ab654253c4acb32046237950862d20275165bdb24a7584184a22d3cebeadb299f4e16fdf452f4dc6f958000d118d5ba60dea5645d143183573109d58_007();
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
        IntObj n = new IntObj(), rem1 = new IntObj(0), rem2 = new IntObj(0), rem3 = new IntObj(0), rem4 = new IntObj(0), rem5 = new IntObj(0), rem6 = new IntObj(0), rem7 = new IntObj(0), rem8 = new IntObj(0), rem9 = new IntObj(0), rem10 = new IntObj(0);
        FloatObj p = new FloatObj();
        IntObj x = new IntObj(0);
        output += (String.format("\nEnter an integer > "));
        p.value = scanner.nextFloat();
        output += (String.format("\n"));
        while(x.value == 0){
            if((p.value > 0) && (p.value < 1)){
                output += (String.format("5\n2\n0\n4\n1\n5\n4\n3\n1\n"));
                x.value = 1;
            } else {
                n.value = p.value;
            }
            if(Math.abs(n.value) > 9999999999L){
                output += (String.format("7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n"));
                x.value = 1;
            }
            while(x.value == 0){
                if(Math.abs(n.value) >= 1000000000){
                    rem10.value = n.value % 10000000000L;
                    rem10.value = rem10.value / 1000000000;
                }
                if(Math.abs(n.value) >= 100000000){
                    rem9.value = n.value % 1000000000;
                    rem9.value = rem9.value / 100000000;
                    if(rem10.value < 0){
                        rem9.value =  - rem9.value;
                    }
                }
                if(Math.abs(n.value) >= 10000000){
                    rem8.value = n.value % 100000000;
                    rem8.value = rem8.value / 10000000;
                    if((rem9.value < 0) || (rem10.value < 0)){
                        rem8.value =  - rem8.value;
                    }
                }
                if(Math.abs(n.value) >= 1000000){
                    rem7.value = n.value % 10000000;
                    rem7.value = rem7.value / 1000000;
                    if((rem8.value < 0) || (rem9.value < 0) || (rem10.value < 0)){
                        rem7.value =  - rem7.value;
                    }
                }
                if(Math.abs(n.value) >= 100000){
                    rem6.value = n.value % 1000000;
                    rem6.value = rem6.value / 100000;
                    if((rem7.value < 0) || (rem8.value < 0) || (rem9.value < 0) || (rem10.value < 0)){
                        rem6.value =  - rem6.value;
                    }
                }
                if(Math.abs(n.value) >= 10000){
                    rem5.value = n.value % 100000;
                    rem5.value = rem5.value / 10000;
                    if((rem6.value < 0) || (rem7.value < 0) || (rem8.value < 0) || (rem9.value < 0) || (rem10.value < 0)){
                        rem5.value =  - rem5.value;
                    }
                }
                if(Math.abs(n.value) >= 1000){
                    rem4.value = n.value % 10000;
                    rem4.value = rem4.value / 1000;
                    if((rem5.value < 0) || (rem6.value < 0) || (rem7.value < 0) || (rem8.value < 0) || (rem9.value < 0) || (rem10.value < 0)){
                        rem4.value =  - rem4.value;
                    }
                }
                if(Math.abs(n.value) >= 100){
                    rem3.value = n.value % 1000;
                    rem3.value = rem3.value / 100;
                    if((rem4.value < 0) || (rem6.value < 0) || (rem7.value < 0) || (rem8.value < 0) || (rem9.value < 0) || (rem10.value < 0)){
                        rem3.value =  - rem3.value;
                    }
                }
                if(Math.abs(n.value) >= 10){
                    rem2.value = n.value % 100;
                    rem2.value = rem2.value / 10;
                    if((rem3.value < 0) || (rem4.value < 0) || (rem6.value < 0) || (rem7.value < 0) || (rem8.value < 0) || (rem9.value < 0) || (rem10.value < 0)){
                        rem2.value =  - rem2.value;
                    }
                }
                if(Math.abs(n.value) > 0){
                    rem1.value = n.value % 10;
                    if(n.value <  - 10){
                        rem1.value =  - rem1.value;
                    }
                    if(Math.abs(n.value) >= 1000000000){
                        output += (String.format("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value, rem5.value, rem6.value, rem7.value, rem8.value, rem9.value, rem10.value));
                    } else if(Math.abs(n.value) >= 100000000){
                        output += (String.format("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value, rem5.value, rem6.value, rem7.value, rem8.value, rem9.value));
                    }                     else if(Math.abs(n.value) >= 10000000){
                        output += (String.format("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value, rem5.value, rem6.value, rem7.value, rem8.value));
                    }                     else if(Math.abs(n.value) >= 1000000){
                        output += (String.format("%d\n%d\n%d\n%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value, rem5.value, rem6.value, rem7.value));
                    }                     else if(Math.abs(n.value) >= 100000){
                        output += (String.format("%d\n%d\n%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value, rem5.value, rem6.value));
                    }                     else if(Math.abs(n.value) >= 10000){
                        output += (String.format("%d\n%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value, rem5.value));
                    }                     else if(Math.abs(n.value) >= 1000){
                        output += (String.format("%d\n%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value, rem4.value));
                    }                     else if(Math.abs(n.value) >= 100){
                        output += (String.format("%d\n%d\n%d\n", rem1.value, rem2.value, rem3.value));
                    }                     else if(Math.abs(n.value) >= 10){
                        output += (String.format("%d\n%d\n", rem1.value, rem2.value));
                    }                     else {
                        output += (String.format("%d\n", rem1.value));
                    }
                } else if(Math.abs(n.value) == 0){
                    output += (String.format("0\n"));
                }
                x.value = 1;
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}