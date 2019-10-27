/*
* CelulasNasais.java - Será utilizada para representar a região dos olhos que será
* desenhada no rosto dentro de uma matriz, utilizando-se dos atributos da 
* SuperClasse Celulas.java.
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see Celulas
*/
package simulacaosistemabiologico;
public class CelulasOculares extends Celulas{
    //Construtor da CelulasOculares, que herda da SuperClasse Celulas.
    public CelulasOculares(int x, int y, int cor) {
        super(x, y, cor);
    } 
}
