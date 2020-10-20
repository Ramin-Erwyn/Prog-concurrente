public class tMoins extends Thread{
    private Compteur cpt;
    private int nbtour;
    public tMoins(Compteur cpt,int nbtour){
        this.cpt =cpt;
    }
    public void run(){
        for(int i=0;i<100000;i++){
            synchronized(cpt){this.cpt.dec();}
        }
    }
}
