/*
* CelulasBoca.java - Será utilizada para representar a região da boca que será
* desenhada no rosto dentro de uma matriz, utilizando-se dos atributos da 
* SuperClasse Celulas.java.
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see Celulas
*/
package simulacaosistemabiologico;
public class CelulasBoca extends Celulas{
    //Construtor da CelulasBoca, que herda da SuperClasse Celulas.
    public CelulasBoca(int x, int y, int cor) {
        super(x, y, cor);
    } 
}
