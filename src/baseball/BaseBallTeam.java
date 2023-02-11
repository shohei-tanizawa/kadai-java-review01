package baseball;

public class BaseBallTeam {

    public String name;
    public int win;
    public int lose;
    public int draw;

    public double getRate() {

        double getRate = ((double)win/(win+lose));
        return getRate;

    }

    public BaseBallTeam(String name,int win,int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
            }

    public void report() {
        double result = getRate();
               System.out.println(name+" の2022年の成績は "+ win +"勝"+lose+"敗"+draw+"分、"+"勝率は "+result+"です。");


    }



}
