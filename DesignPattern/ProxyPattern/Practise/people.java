package DesignPattern.ProxyPattern.Practise;

/**
 * Created by zacky on 12:46.
 */
public class people implements buyCar {
    private int cash;
    private String userName;
    private boolean isVip;
    @Override
    public void buyCar() {
        System.out.println(userName + " buying car");
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }
}
