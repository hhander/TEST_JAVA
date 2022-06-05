package variable;

public class variable {
    public static void main(String[] args) {
        double money = 6.0;
        System.out.println("我有"+money+"元");
        money %= 4;
        System.out.println("我有"+money+"元");
        int []arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }

        System.out.println(money>6?null:money);

       char ch = 'a';
       System.out.println(ch + 32);





    }
}
