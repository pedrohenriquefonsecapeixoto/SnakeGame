package jogo;
import java.util.Vector;

public class Cobra {
    private int tamanho;
    private Vector<Integer> cobra = new Vector<>();

    public int getTamanho(){
        return tamanho;
    }
    public Vector<Integer> getVecCobra(){
        return cobra;
    }
    public void setTamanho(int t){
        tamanho=t;
    }
    public void setVecCobra(Vector<Integer> c){
        cobra = c;
    }
}
