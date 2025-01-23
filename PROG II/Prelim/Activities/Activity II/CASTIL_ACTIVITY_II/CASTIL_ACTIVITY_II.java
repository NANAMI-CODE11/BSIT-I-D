
public class CASTIL_ACTIVITY_II {
    public static void main(String [] args) {

        int sum = 0;
        double average;
        

        int scores[] = {6, 20, 44, 50, 75, 80, 110, 135, 150};

        int length = scores.length;

        for (int score: scores){
            sum += score;
        }

            average = sum / length;

            System.out.println("The average is " + average);

        }
    }
