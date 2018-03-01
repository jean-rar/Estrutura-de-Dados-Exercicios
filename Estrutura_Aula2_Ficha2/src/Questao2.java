import java.util.Scanner;
import java.util.Random;
public class Questao2 {

    public static void main (String[]args){
        System.out.println(jogo(jogador(),(computerRPS())));
    }

    public static String jogador (){
        Scanner input = new Scanner (System.in);
        System.out.print("Vamos Jogar!\n Rock, Paper ou Scissors?: ");
        String resposta = input.nextLine();
     return resposta;
    }

    public static String computerRPS() {
        Random rnd = new Random();
        if(rnd.nextDouble() < 0.33)
            return "rock";
        else if (rnd.nextDouble() > 0.66)
            return "paper";
        else
            return "scissors";

    }

    public static String jogo (String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw";
        } else if (p1.equals("rock") && p2.equals("scissors") || p1.equals("paper") && p2.equals("rock") || p1.equals("scissors") && p2.equals("paper")) {
            return "player 1 win!";
        } else {
            return "Player 2 win!";
        }
    }
}
