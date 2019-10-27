/*
* Influenza.java - Classe que será usada para representar
* o virus influenza no desenho do rosto, herdando atributos da SuperClasse virus.
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see Virus.
*/
package simulacaosistemabiologico;
public class Influenza extends Virus{
    //Variavel definir se a influenza se encontra nas celulas do rosto(nariz, boca e olhos).
    private boolean celula = false;
    
    //Construtor de Influenza que herda da SuperClasse Virus.
    public Influenza(int velocidade, int cor, int x, int y) {
        super(velocidade, cor, x, y);
    }

    /*
    * Método de retorno booleano que serve para verificar se a influenza se
    * encontra nas celulas do rosto, para que então, se a influenza estiver
    * tera que se multiplicar, mas apenas uma vez, apenas se multiplicará denovo
    * se sair das celulas do rosto, e voltar denovo.
    */
    public boolean estaNaCelula()
    {
        if((getX()>=13 && getX()<=18 && getY()>=26 && getY()<=33) || (getX()>=22 && getX()<=24 && getY()>=20 && getY()<=39) || (getX()>=5 && getX()<=7 && ((getY()>=35 && getY()<=50) || (getY()>=9 && getY()<=24))))
        {
           if(celula == false)
           {
               celula = true;
               return true;
           }
        }
        else celula = false;
        return false;
    }
      
}
