public class First{
    int year;
    String name;

    public First(int y,String n){
        year=y;
        name=n;
    }
    public static void main(String[] args){
        First mycar= new First(2000,"tesla");
        System.out.println(mycar.year+" "+mycar.name);
    }
}