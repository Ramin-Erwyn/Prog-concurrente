public class TD3 {
    public static void main(String[] args) throws InterruptedException {
        Compteur myCpt =new Compteur(0);
        tPlus tp = new tPlus(myCpt,100000);
        tMoins tm = new tMoins(myCpt,100000);
        tp.start();
        tm.start();
        tp.join();
        tm.join();
        System.out.println(myCpt.getVal());
    }
}