import static java.lang.Math.*;

public enum Dificuldade{
    FACIL,
    MEDIO,
    DIFICIL,
    FOCO
}

public enum Tamanho{
    NOVE,
    QUINZE,
    TRINTA,
    CINQUENTA
}

public class Config {
    private Dificuldade difficult;
    private Tamanho size;
    private double obstaculos; //Quantidade de quadrados como colunas/paredes

    //Getters e Setters
    public getDificuldade() {return difficult;}
    public getTamanho() {return size;}
    public getObstaculos() {return obstaculos;}
    public setObstaculos(double o) {obstaculos=o;}
    public setDificuldade(Dificuldade d){difficult=d;}
    public setTamanho(Tamanho t){size=t;}
}