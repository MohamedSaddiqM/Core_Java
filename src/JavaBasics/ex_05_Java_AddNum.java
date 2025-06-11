package JavaBasics;

public class ex_05_Java_AddNum {
    public static void main(String[] args) {
        addNumber(5,5);
        addNumber(4,2);
    }
    public static void addNumber(int num1, int num2){
        int res = num1 + num2;
        System.out.println("Addition of 2 numbers:" + res);
    }
}
