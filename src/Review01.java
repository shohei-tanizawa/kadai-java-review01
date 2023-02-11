
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int num1 = 1500;
        double num2 = 0.1;
        int result;
        result = tax(num1,num2);
        
        System.out.println(num1 + "円の商品の税込価格は"+(num1 + result) +"円(消費税は"+result + "円）です。");

    }

    private static int tax(int num1, double num2) {
        // TODO 自動生成されたメソッド・スタブ
        int result = (int) (num1 * num2);
        return result;
    }

}
