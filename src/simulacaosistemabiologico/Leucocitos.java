/*
* Leucocitos.java - Classe que será usada para representar
* os leucócitos no desenho do rosto, herdando atributos da classe célula
* e métodos da interface IMovable.
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see IMovable.
* @see Celulas.
*/
package simulacaosistemabiologico;
public class Leucocitos extends Celulas implements IMoveable {
    /*
    * Variaveis que definem a velocidade com a qual os leucócitos se locomovem,
    * assim como a manipulação do tempo de vida.
    */
    private int velocidade;
    private int nascimento;
    
    //Construtor de Leucocitos que herda da SuperClasse Celulas.
    public Leucocitos(int velocidade, int cor, int nascimento, int x, int y) {
        super(x, y, cor);
        this.velocidade = velocidade;
        this.nascimento = nascimento;
    }

    //Getter para verificar o tempo de vida dos leucócitos.
    public int getNascimento() {
        return nascimento;
    }

    //metodo para incrementar o tempo de vida dos leucócitos.
    public void incrementaNascimento() {
        nascimento++;
    }

    /*
    * Implementação do método mover da interface IMovable, que serve para
    * definir, de forma aleatória, o movimento dos Leucócitos, com 8 direções
    * possíveis: Cima, Baixo, Direita e Esquerda e Diagonais(4).
    */
    @Override
    public void mover() 
    {
       int random = (int)(Math.random() * 8+1);

       if(random == 1)
       {
           setX(getX() + velocidade);
       }
       else if(random == 2)
       {
           setX(getX() - velocidade);
       }
       else if(random == 3)
       {
           setY(getY() + velocidade);
       }
       else if(random == 4)
       {
           setY(getY() - velocidade);
       }
       if(random == 5)
       {
           setX(getX() + velocidade);
           setY(getY() + velocidade);
       }
       else if(random == 6)
       {
           setX(getX() - velocidade);
           setY(getY() + velocidade);
       }
       else if(random == 7)
       {
           setY(getY() + velocidade);
           setY(getY() - velocidade);
       }
       else if(random == 8)
       {
           setY(getY() - velocidade);
           setY(getY() - velocidade);
       }
       
       if(getX() >= 30)
       {
           setX(getX() - 30);
       }
       if(getX() <= -1)
       {
           setX(getX() + 30);
       }
       if(getY() >= 60)
       {
           setY(getY() - 60);
       }
       if(getY() <= -1)
       {
           setY(getY() + 60);
       }
    }
    
}
