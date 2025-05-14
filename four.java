public class four{

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        four obj = new four();

        int result = obj.addNumbers(10, 20);

        System.out.println("The sum is: " + result);
    }
}
