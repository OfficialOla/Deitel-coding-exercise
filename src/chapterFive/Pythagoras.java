package chapterFive;

public class Pythagoras {
    public static void main(String[] args) {
//        int squareOfadjascent = 0;
//        int squareOfhypothenus = 0;
//        int squareOfOpposite = 0;
        for (int squareOfAdjascent = 1; squareOfAdjascent <= 500; squareOfAdjascent++) {
            for (int squareOfOpposite = squareOfAdjascent+1; squareOfOpposite <= 500; squareOfOpposite++) {
                for (int squareOfHypotenuse = squareOfOpposite+1; squareOfHypotenuse <= 500; squareOfHypotenuse++) {
                    int sideAB = (squareOfAdjascent * squareOfAdjascent);
                    int sideBC = (squareOfOpposite * squareOfOpposite);
                    int sideAC = (squareOfHypotenuse * squareOfHypotenuse);
                    if ((sideAB + sideBC) == sideAC) {
                        System.out.printf("%d, %d, %d%n", squareOfAdjascent, squareOfOpposite, squareOfHypotenuse);
                        System.out.printf("%d + %d = %d%n", sideAB, sideBC, sideAC);
                        System.out.println("");
                    }

                }

            }


        }
    }
}