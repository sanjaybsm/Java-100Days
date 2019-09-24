public class Day1JavaLamdaExamples {

    interface operation{

        int operation(int a,int b);

    }


    interface functionInterface{
        void printMessage(String message);
    }

    private int operate(int a,int b,operation method){
       return method.operation(a,b);
    }


    public static void main(String[] args) {
        operation op = (int a,int b) -> a+b;
        operation multiply = (int a,int b) -> a*b;

        Day1JavaLamdaExamples examples = new Day1JavaLamdaExamples();
        System.out.println("Addition : "+examples.operate(6,7,op));
        System.out.println("Multiply : "+examples.operate(5,6,multiply));

        functionInterface fp = (String message) -> System.out.println("custom"+message);

        fp.printMessage("my message");

    }

}
