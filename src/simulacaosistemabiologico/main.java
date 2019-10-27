/*
* main.java - Código principal utilizado para rodar o programa, com o intuito
* de criar um loop, que desenha varias vezes um rosto, através da instância da classe
* Cabeca.java, assim como suas células, leucócitos e vírus influenza, até que 
* os leucócitos consigam eliminar todos os vírus influenza.
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see Cabeca.
*/
package simulacaosistemabiologico;
public class main {
       // Variaveis Strings que servem para representar as cores para desenhar o rosto
       public static final String ANSI_RED = "\u001B[31m";
       public static final String ANSI_RESET = "\u001B[0m";
       public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
       public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
       public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
       public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
       public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
       public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
       
    public static void main(String[] args) {
        //Instância da classe Cabeca.java
       Cabeca cabeca = new Cabeca();
       int i, j, iteracao = 1;
       //Varivel para verificar se existe influenza no rosto(1-sim, 0-não).
       int verificaNumInfluenza = 1;
       //Loop que funciona enquanto existir vírus Influenza.
       while(verificaNumInfluenza == 1)
       {
            //Método que desenha as células da cabeça, bordas, leucócitos e vírus influenza na matriz.
            cabeca.desenhaCabeca();
            System.out.println("============================================================");
            //Impressões que apresentam o número de iterações, vírus influenza e leucócitos.
            System.out.printf("Iterações: %d\n", iteracao);
            System.out.printf(ANSI_YELLOW_BACKGROUND + " " + ANSI_RESET + " Influenza: %d ", cabeca.getNumInfluenza());
            System.out.printf(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET + " Leucócitos: %d\n", cabeca.getNumLeucocitos());
            /*
            * For que serve para colorir a cabeça de acordo com as cores(números)
            * que representam cada um.
            */
            for(i=0; i<cabeca.mapa.length ; i++)
            {
                for(j = 0; j<cabeca.mapa[0].length; j++)
                {
                    //Cor padrão de fundo representa o resto do Rosto(0).
                    if(cabeca.mapa[i][j] == 0)
                    {
                        System.out.print(" ");
                    }
                    //Cor Teal representa a Borda(1).
                    else if(cabeca.mapa[i][j] == 1)
                    {
                        System.out.print(ANSI_CYAN_BACKGROUND + " " + ANSI_RESET);
                    }
                    //Cor Roxa representa o Nariz(2).
                    else if(cabeca.mapa[i][j] == 2)
                    {
                        System.out.print(ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET);
                    }
                    //Cor Vermelha representa os Olhos(3).
                    else if(cabeca.mapa[i][j] == 3)
                    {
                        System.out.print(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
                    }
                    //Cor Verde representa a Boca(4).
                    else if(cabeca.mapa[i][j] == 4)
                    {
                        System.out.print(ANSI_GREEN_BACKGROUND + " " + ANSI_RESET);
                    }
                    //Cor Azul representa os Leucócitos(5).
                    else if(cabeca.mapa[i][j] == 5)
                    {
                        System.out.print(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET);
                    }
                    //Cor Amarela representa o vírus Influenza(6).
                    else if(cabeca.mapa[i][j] == 6)
                    {
                        System.out.print(ANSI_YELLOW_BACKGROUND + " " + ANSI_RESET);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
            /*
            * Delay para diminuir a velocidade com que o rosto é desenhado para 
            * meio segundo a cada iteração.
            */
            try 
            {
                 Thread.sleep(500);
            } 
            catch (Exception e) 
            {
                 e.printStackTrace();
            }
            //if que verifica se ainda existe vírus Influenza.
            if(cabeca.getNumInfluenza() == 0)
            {
                verificaNumInfluenza = 0;
            }
            iteracao++;
       }
       

    }
    
}
