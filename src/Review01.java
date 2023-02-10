
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int num1 = 1500;
        int num2 = 10;
        int result;
        result = tax(num1,num2);
        
        System.out.println(num1 + "円の商品の税込価格は");
        System.out.println(num1 + result +"円(消費税は");
        System.out.println(result + "円）です。");     
                       
    }

    private static int tax(int num1, int num2) {
        // TODO 自動生成されたメソッド・スタブ
        int result = num1 / num2;
        return result;
    }

}
