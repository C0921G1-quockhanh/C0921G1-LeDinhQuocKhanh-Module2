package ss8_clean_code_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";

        if (scoreOfPlayer1==scoreOfPlayer2)
        {
            score = getScoreOfPlayer(scoreOfPlayer1) + "-All";
            if (scoreOfPlayer1 > 3) {
                score = "Deuce";
            }
        }
        else if (scoreOfPlayer1>=4 || scoreOfPlayer2>=4)
        {
            int minusResult = scoreOfPlayer1-scoreOfPlayer2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score = "Win for player2";
        }
        else
        {
            score = getScoreOfPlayer(scoreOfPlayer1) + '-' + getScoreOfPlayer(scoreOfPlayer2);
        }
        return score;
    }

    private static String getScoreOfPlayer(int scoreOfPlayer1) {
        String score;
        switch (scoreOfPlayer1)
        {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
            default:
                score = "";
                break;

        }
        return score;
    }
}
