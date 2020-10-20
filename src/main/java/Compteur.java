public class Compteur {
    private int val;
    public  Compteur(int val){
        this.val =val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
public synchronized void inc(){
        this.val++;
}
public synchronized void dec(){
        this.val--;
}
}

