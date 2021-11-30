package ss22_structural_design_pattern.bai4;

public class RandomNumber {
    public int generateInteger(int min, int max){
        double randomDouble = Math.random();
        int randomInteger =  (int) (randomDouble * (max - min + 1) + min);
        return randomInteger;
    }
}
