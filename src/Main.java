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

        //increment and decrement operators

        int val=0;
        System.out.println(val++); //0
        System.out.println(val); //1
        System.out.println(++val); //2
        System.out.println(val--); //2
        System.out.println(val); //1
        System.out.println(--val); //0
    }
}
