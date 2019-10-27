/*
* main.java - Classe principal utilizada para fazer composição com as classes: Leucocitos.java,
* CelulasBoca.java, CelulasNasais.java e CelulasOculares.java. Assim como fazer
* agregação com a classe Influenza para fazer o desenho do rosto, e também definir
* as condições de movimentação e atitude dos leucócitos e vírus influenza.
* @author Guilherme Rocha Vieira.
* @version 1.0.
* @see Influenza.
* @see Leucocitos.
* @see CelulasNasais.
* @see CelulasOculares.
* @see CelulasBoca.
*/
package simulacaosistemabiologico;
import java.util.ArrayList;
public class Cabeca {
    /*
    *ArrayList utilizado para criar as celulas conforme for necessário, com excessão
    * do nariz, olhos e boca que terão o mesmo tamanho.
    */
    public ArrayList<Influenza> influenza;
    private ArrayList<Leucocitos> leucocitos;
    private ArrayList<CelulasNasais> nariz;
    private ArrayList<CelulasOculares> olhos;
    private ArrayList<CelulasBoca> boca;
    //Variveis para analisar o número de leucócitos e vírus influenza.
    private int numLeucocitos = 0;
    private int numInfluenza = 0;
    int i = 0, j = 0, k = 0, random = 0; 
    
    /*
    * Construtor da classe Cabeca
    */
    public Cabeca() {
        influenza = new ArrayList<>();
        leucocitos = new ArrayList<>();
        nariz = new ArrayList<>();
        olhos = new ArrayList<>();
        boca = new ArrayList<>();
        preencheCelulas(); 
        iniciaInfluenza();
    }

    //Métodos para verificar o número de leucócitos e vírus influenza.
    public int getNumLeucocitos() {
        return numLeucocitos;
    }

    public int getNumInfluenza() {
        return numInfluenza;
    }
    
    /*
    * Método sem retorno que preenche o ArrayList da boca, olhos e nariz com a 
    * posição estática de cada um no momento de instanciação da classe Cabeca 
    * para desenhar na matriz.
    */
    public void preencheCelulas()
    {
        for(i=13; i<=18; i++)
        {
            for(j=26; j<=33; j++)
            {
                nariz.add(new CelulasNasais(i,j,2));
            }
        }
        for(i=22; i<=24; i++)
        {
            for(j=20; j<=39; j++)
            {
                boca.add(new CelulasBoca(i,j,4));
            }
        }
        for(i=5; i<=7; i++)
        {
            for(j=35; j<=50; j++)
            {
                olhos.add(new CelulasOculares(i,j,3));
            }
            for(j=9; j<=24; j++)
            {
                olhos.add(new CelulasOculares(i,j,3));
            }
        }
    }
    
    /*
    * Método sem retorno que adiciona 5 vírus Influenza ao ArrayList Influenza, 
    * para que o desenho do rosto se inicialize com o número estipulado, que será
    * executado na instanciação do objeto Cabeca.
    */
    public void iniciaInfluenza()
    {
        for(i=0; i<5; i++)
        {
            influenza.add(new Influenza(1,6,(int)(Math.random() * 30+0),(int)(Math.random() * 60+0))); 
            numInfluenza++;
        }
    }
    
    //Matriz utilizada para mapear as posições das celulas e, posteriormente, desenha-las na programa principal.
    public int mapa[][] =
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  
    };
    
    public void desenhaRosto()
    {
            for(j=0; j<30; j++)
            {
                for(k=0; k<60; k++)
                {
                    if(j == 0)mapa[j][k] = 1;
                    else if(k == 0 || k == 59) mapa[j][k] = 1;
                    else if(j == 29) mapa[j][k] = 1;
                    else mapa[j][k] = 0;
                }
            }
            for(j=0; j<nariz.size(); j++)
            {
                mapa[nariz.get(j).getX()][nariz.get(j).getY()] = nariz.get(j).getCor();
            }
            for(j=0; j<boca.size(); j++)
            {
                mapa[boca.get(j).getX()][boca.get(j).getY()] = boca.get(j).getCor();
            }
            for(j=0; j<olhos.size(); j++)
            {
                mapa[olhos.get(j).getX()][olhos.get(j).getY()] = olhos.get(j).getCor();
            }
    }
    
    /*
    * Método sem retorno que insere os valores que correspondem a cada célula na
    * matriz, para que sejam analizados no programa principal para serem desenhados.
    */
    public void desenhaCabeca()
    {
        int verificaGeral = 0;
        j = 0;
        /*
        * Como os leucócitos e vírus influenza se movimentam, os valores do movimento anterior ficam
        * gravados na matriz, então é essencial desenhar as partes principais do rosto
        * sempre que o método desenhaCabeca é chamado, para resetar a matriz e não deixar
        * esse rastro daqueles que se movimentam.
        */
        desenhaRosto();
        
        /*
        * Como os leucócitos vivem apenas durante 7 iterações, esse for serve para
        * verificar se já acabou esse tempo, e elimina os leucócitos com o tempo de
        * vida contado.
        */
        for(j=0; j<leucocitos.size(); j++)
        {
            if(leucocitos.get(j).getNascimento() >= 7)
            {
                leucocitos.remove(j);
                numLeucocitos--;
            }
        }
        
        /*
        * Como sempre deve ter 10 leucócitos no rosto, cada vez que o número de 
        * leucócitos for abaixo de 10, o programa vai entrar nesse loop para
        * aumentar o número de leucócitos.
        */
        while(numLeucocitos < 10)
        {
            leucocitos.add(new Leucocitos(2,5,0,(int)(Math.random() * 30+0),(int)(Math.random() * 60+0)));
            numLeucocitos++;
        }
        
        /*
        * verifica se algum virus influenza está na posição de algum leucócito
        * antes de se movimentar, para remove-lo e copiar um leucócito.
        */
        for(i=0; i<influenza.size(); i++)
        {
            while(j<leucocitos.size() && verificaGeral == 0)
            {
                if(leucocitos.get(j).getX() == influenza.get(i).getX() && leucocitos.get(j).getY() == influenza.get(i).getY())
                {
                    influenza.remove(i);
                    leucocitos.add(new Leucocitos(2,5,0,(int)(Math.random() * 30+0),(int)(Math.random() * 60+0)));
                    numLeucocitos++;
                    numInfluenza--;
                    verificaGeral = 1;
                }
                j++;
            }
        }
        
        /*
        * Verifica se algum vírus influenza está na posição de algum leucócito
        * após se movimentar, para remove-lo e copiar um leucócito, caso contrário, verifica se ele 
        * esta nas celulas do nariz, boca ou olhos para poder me multiplicar.
        */
        for(i=0; i<influenza.size(); i++)
        {
            verificaGeral = 0;
            j = 0;
            influenza.get(i).mover();

            while(j<leucocitos.size() && verificaGeral == 0)
            {
                if(leucocitos.get(j).getX() == influenza.get(i).getX() && leucocitos.get(j).getY() == influenza.get(i).getY())
                {
                    influenza.remove(i);
                    leucocitos.add(new Leucocitos(2,5,0,(int)(Math.random() * 30+0),(int)(Math.random() * 60+0)));
                    numLeucocitos++;
                    numInfluenza--;
                    verificaGeral = 1;
                }
                j++;
            }

            if(verificaGeral == 0)
            {
                mapa[influenza.get(i).getX()][influenza.get(i).getY()] = influenza.get(i).getCor();
                if(influenza.get(i).estaNaCelula() == true)
                {
                influenza.add(new Influenza(1,6,(int)(Math.random() * 30+0),(int)(Math.random() * 60+0)));
                numInfluenza++;
                }
            }
        }

        /*
        * Verifica se os leucócitos estão na posição de algum vírus influenza após
        * se movimentar, para exluir o vírus e se multiplicar.
        */
        for(i=0; i<leucocitos.size(); i++)
        {
            verificaGeral = 0;
            j = 0;
            leucocitos.get(i).mover();
            mapa[leucocitos.get(i).getX()][leucocitos.get(i).getY()] = leucocitos.get(i).getCor();
            while(j<influenza.size() && verificaGeral == 0)
            {
                if(leucocitos.get(i).getX() == influenza.get(j).getX() && leucocitos.get(i).getY() == influenza.get(j).getY())
                {
                    influenza.remove(j);
                    leucocitos.add(new Leucocitos(2,5,0,(int)(Math.random() * 30+0),(int)(Math.random() * 60+0)));
                    numLeucocitos++;
                    numInfluenza--;
                    verificaGeral = 1;
                }
                j++;
            }
        }
        //Incrementa o tempo de vida dos leucócitos.
        for(i=0; i<leucocitos.size(); i++)
        {
            leucocitos.get(i).incrementaNascimento();
        }
        

    }
}
