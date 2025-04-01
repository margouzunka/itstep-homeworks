package homework4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe game;
        game = new TicTacToe();

        System.out.println("Чтобы вставить Х укажите координаты ячейки через запятую x,y");
        System.out.println("Например правая верхняя ячейка 2,0");

        game.printGameField();

        while (true) {
            System.out.println("В какую ячейку вставить х?" );
            String move = new Scanner(System.in).nextLine(); // 1,2
            game.makePlayerMove(move);
            if (game.isPlayerWon()) {
                game.printGameField();
                System.out.println("====== Поздравляем вы выйграли! ======");
                break;
            }

            game.makeOpponentMove();
            if (game.isOpponentWon()) {
                game.printGameField();
                System.out.println("====== Компьютер выйграл! ======");
                break;
            }

            game.printGameField();

            boolean hasNoPossibleMoves = !game.hasPossibleMoves();
            if (hasNoPossibleMoves) {
                System.out.println("====== Ничья! ======");
                break;
            }
        }
    }
}
