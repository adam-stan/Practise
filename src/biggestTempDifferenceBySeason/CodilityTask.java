package biggestTempDifferenceBySeason;

public class CodilityTask {

    public String solution(int[] T) {

        int numberOfDays = T.length / 4;
        int allDays = 0;
        int biggestTemp = -99;
        int smallestTemp = 100;

        int differenceWinter;
        int differenceSpring;
        int differenceSummer;
        int differenceAutumn;

        int biggestDifferent = 0;
        String solutionSeason = "";

        int[] winter = new int[numberOfDays];
        int[] spring = new int[numberOfDays];
        int[] summer = new int[numberOfDays];
        int[] autumn = new int[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            winter[i] = T[allDays];
            allDays++;
        }
        for (int i = 0; i < numberOfDays; i++) {
            spring[i] = T[allDays];
            allDays++;
        }
        for (int i = 0; i < numberOfDays; i++) {
            summer[i] = T[allDays];
            allDays++;
        }
        for (int i = 0; i < numberOfDays; i++) {
            autumn[i] = T[allDays];
            allDays++;
        }


        for (int i = 0; i < winter.length; i++) {
            if (winter[i] > biggestTemp) {
                biggestTemp = winter[i];
            }
            if (winter[i] < smallestTemp) {
                smallestTemp = winter[i];
            }
        }
        differenceWinter = biggestTemp - smallestTemp;

        biggestTemp = -99;
        smallestTemp = 100;
        for (int i = 0; i < spring.length; i++) {

            if (spring[i] > biggestTemp) {
                biggestTemp = spring[i];
            }
            if (spring[i] < smallestTemp) {
                smallestTemp = spring[i];
            }
        }
        differenceSpring = biggestTemp - smallestTemp;

        biggestTemp = -99;
        smallestTemp = 100;
        for (int i = 0; i < summer.length; i++) {

            if (summer[i] > biggestTemp) {
                biggestTemp = summer[i];
            }
            if (summer[i] < smallestTemp) {
                smallestTemp = summer[i];
            }
        }
        differenceSummer = biggestTemp - smallestTemp;

        biggestTemp = -99;
        smallestTemp = 100;
        for (int i = 0; i < autumn.length; i++) {

            if (autumn[i] > biggestTemp) {
                biggestTemp = autumn[i];
            }
            if (autumn[i] < smallestTemp) {
                smallestTemp = autumn[i];
            }
        }
        differenceAutumn = biggestTemp - smallestTemp;


           if (differenceWinter > biggestDifferent) {
               biggestDifferent = differenceWinter;
               solutionSeason = "Winter";
           }

           if (differenceSpring > biggestDifferent) {
               biggestDifferent = differenceSpring;
               solutionSeason = "Spring";
           }

           if (differenceSummer > biggestDifferent) {
               biggestDifferent = differenceSummer;
               solutionSeason = "Summer";
           }

           if (differenceAutumn > biggestDifferent) {
               biggestDifferent = differenceAutumn;
               solutionSeason = "Autumn";
           }

        return solutionSeason;
    }

    public static void main(String[] args) {

        int[] T = {1,2,3,4,5,6,2,3,8,5,2,23};
        CodilityTask testing = new CodilityTask();
        System.out.println(testing.solution(T));
    }
}
