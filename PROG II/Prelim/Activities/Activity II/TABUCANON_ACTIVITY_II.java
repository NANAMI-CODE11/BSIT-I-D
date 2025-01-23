public class TABUCANON_ACTIVITY_II {
    public static void main(String [] args) {

        int sum = 0;
        double average;
        

        int scores[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int length = scores.length;

        for (int score: scores){
            sum += score;
        }

            average = sum / length;

            System.out.println("The average is " + average);

        }
    }