package jogo;

public class Config {
    private Dificuldade difficult;
    private Tamanho size;
    private double obstaculos; //Quantidade de quadrados como colunas/paredes
    private double points;

    // Getters
    public Dificuldade getDificuldade() { return difficult; }
    public Tamanho getTamanho() { return size; }             
    public double getObstaculos() { return obstaculos; }
    public double getPoints(){return points;}
    // Setters
    public void setObstaculos(double o) { obstaculos = o; }   
    public void setDificuldade(Dificuldade d) { difficult = d; } 
    public void setTamanho(Tamanho t) { size = t; }
    public void setPoints(double p){points=p;}
}