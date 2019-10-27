/*
* Celulas.java - SuperClasse que será herdada pelas classes filhas: CelulasBoca.java,
* CelulasNasais.java, CelulasOculares.java e Leucócitos.java.
* @author Guilherme Rocha Vieira.
* @version 1.0.
*/
package simulacaosistemabiologico;
public class Celulas { 
    //Variáveis para definir a localização das células assim como sua representação pela cor.
    private int x;
    private int y;
    private int cor;

    //Construtor da SuperClasse Celulas
    public Celulas(int x, int y, int cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    
    //Getters e Setters para manipular as variáveis privadas de Celulas
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}
