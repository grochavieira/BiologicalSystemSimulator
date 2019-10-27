/*
* Virus.java - SuperClasse que será herdada pela Influenza.java e que implementa
* os métodos da interface IMovable.java
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see IMovable
*/
package simulacaosistemabiologico;
public class Virus implements IMoveable{
    /*
    * Variaveis que serão usadas para definir a posição do Virus, assim como
    * a velocidade com a qual se locomove.
    */
    private int velocidade;
    private int cor;
    private int x;
    private int y;
    
    //Construtor da SuperClasse Virus
    public Virus(int velocidade, int cor, int x, int y) {
        this.velocidade = velocidade;
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    //Getters e Setters para manipular as variaveis privadas da SuperClasse Virus
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

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

    /*
    * Implementação do método mover da interface IMovable, que serve para
    * definir, de forma aleatória, o movimento da Influenza, com 4 direções
    * possíveis: Cima, Baixo, Direita e Esquerda
    */
    @Override
    public void mover() 
    {
       int random = (int)(Math.random() * 4+1);
       
       if(random == 1)
       {
           x+=velocidade;
       }
       else if(random == 2)
       {
           x-=velocidade;
       }
       else if(random == 3)
       {
           y+=velocidade;
       }
       else
       {
           y-=velocidade;
       }
       
       if(x >= 30)
       {
           x = 0;
       }
       if(x <= -1)
       {
           x = 29;
       }
       if(y >= 60)
       {
           y = 0;
       }
       if(y <= -1)
       {
           y = 59;
       }
    }
    
}
