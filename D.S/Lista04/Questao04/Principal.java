package Lista04.Questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personagem avatar = new Personagem("Naju", 100, 50, 60);
        Personagem alvo = new Personagem("Alvo", 100, 60, 40);
        avatar.detalhesDoPersonagem();
        avatar.andar(Direcao.CIMA);
        avatar.andar(Direcao.BAIXO);
        avatar.andar(Direcao.ESQUERDA);
        avatar.andar(Direcao.DIREITA);
        
        avatar.atacar(alvo);
    }
}
