public class tPlus1 extends Thread {
    private Compteur cpt;
    private int nbTours;
    public tPlus1(Compteur cpt,int nbTours){
        this.cpt=cpt;
        this.nbTours=nbTours;
    }
    public void run(){
        for (int i=0;i<this.nbTours;i++){
            this.cpt.inc();
        }
    }

}
