package OOPs_Questions.Week_4.Question_2;

public class Main extends Outer {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.display();

        Outer.Inner in = obj.new Inner();
        in.display();

    }
}