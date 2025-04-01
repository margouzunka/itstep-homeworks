package homework4.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToe {
    String[][] gameField  = {
            {".",".","."},
            {".",".","."},
            {".",".","."}
    };

    public void makeMove(String type, int x, int y) {
        // type - X or O
        gameField[x][y] = type;
    }

    public void makePlayerMove(String move) {
        String[] cells = move.split(","); // ["1", "2"]
        int x = Integer.parseInt(cells[0]);
        int y = Integer.parseInt(cells[1]);
        makeMove("x", x, y);
    }

    public List<String> getPossibleMoves() {
        List<String> possibleMoves = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameField[j][i].equals(".")) {
                    possibleMoves.add(j + "," + i);
                }
            }
        }
        return possibleMoves;
    }

    public boolean hasPossibleMoves() {
        return !getPossibleMoves().isEmpty();
    }

    public void makeOpponentMove() {
        List<String> possibleMoves = getPossibleMoves();
        if (possibleMoves.isEmpty()) {
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(possibleMoves.size());
        String randomMove = possibleMoves.get(randomIndex);
        String[] cells = randomMove.split(","); // ["x", "y"]
        int x = Integer.parseInt(cells[0]);
        int y = Integer.parseInt(cells[1]);
        makeMove("o", x, y);
    }

    public boolean isWonType(String type) {
        for (int i = 0; i < 3; i++) {
            int counterRepeated = 0;
            for (int j = 0; j < 3; j++) {
                if (!gameField[j][i].equals(".") && gameField[j][i].equals(type)) {
                    counterRepeated++;
                }
            }
            if (counterRepeated == 3) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            int counterRepeated = 0;
            for (int j = 0; j < 3; j++) {
                if (!gameField[i][j].equals(".") && gameField[i][j].equals(type)) {
                    counterRepeated++;
                }
            }
            if (counterRepeated == 3) {
                return true;
            }
        }

        int counterRepeatedDiagonal1 = 0;
        int counterRepeatedDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            if (gameField[i][i].equals(type)) {
                counterRepeatedDiagonal1++;
            }
            if (gameField[i][2 - i].equals(type)) {
                counterRepeatedDiagonal2++;
            }
        }

        if (counterRepeatedDiagonal1 == 3 || counterRepeatedDiagonal2 == 3) {
            return true;
        }

        return false;
    }

    public boolean isPlayerWon() {
        return isWonType("x");
    }

    public boolean isOpponentWon() {
        return isWonType("o");
    }

    public void printGameField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+gameField[j][i] + " ");
            }
            System.out.println();
        }
    }

}
