public class Main {

    public static void main(String[] args){
        Chapter2 chap=new Chapter2();
        float f=21.2f;
        double d=21.80;
        //It is double
        chap.printType(f+d);

        char ch='c';
        char cha='d';
        //It is int
        chap.printType(ch/cha);
    }
}
