public class Assignment1Q2{
    public static void main(String[] args){
    int a=8;
    int x;
    x=a++ + ++a + a + ++a + a++;
    System.out.println(x+","+a);
    System.out.println(a++ +","+ ++a +","+ a++);
    System.out.println(--a +","+ a +","+ a--);
    }
}