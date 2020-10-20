public class tPlus extends Thread {
    private Compteur cpt;
    private int nbtour;
    public tPlus(Compteur cpt,int nbtour){
        this.cpt =cpt;
    }
    public void run(){
        for(int i=0;i<100000;i++){
           this.cpt.inc();
        }
    }
}
