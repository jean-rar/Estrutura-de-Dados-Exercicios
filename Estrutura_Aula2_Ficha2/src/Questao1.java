import java.util.Scanner;

public class Questao1 {

    public static String jogo (String p1, String p2){
        if(p1.equals(p2)){
        return "Draw";
        }else if(p1.equals("rock") && p2.equals("scissors") || p1.equals ("paper") && p2.equals ("rock") || p1.equals ("scissors") && p2.equals ("paper")){
          return "player 1 win!";
        }else {
           return "Player 2 win!";
        }

    }
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);

        System.out.print("Escolha: Rock, paper ou scissors?\n");
        System.out.print("Player 1, informe uma resposta: ");
        String p1 = input.nextLine();
        System.out.print("Player 2, informe uma resposta: ");
        String p2 = input.nextLine();

        System.out.println(jogo(p1,p2 ));
    }
}
