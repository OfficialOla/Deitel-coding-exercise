package dsaSnacks;

public class MinDistance {
    public static void main(String[] args) {
        int[] arrNum = {3, 4, 5, 6, 6, 7};
//        System.out.println(min_Dist(arrNum, 4, 7));
        System.out.println(getMinDistance(arrNum, 4, 7));
    }

    public static int min_Dist(int[] arr, int x, int y) {
     int min_Distance = 1;
     int xx = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == x){
                 xx = i;
            }
        }
        for (int i = xx+1; i < arr.length ; i++) {
            if (arr[i] == y){
                break;
            } else min_Distance++;

        }
        return min_Distance;
      }
      public static int getMinDistance(int[] arr, int x, int y){
        int min_dist = Integer.MAX_VALUE;
          for (int i = 0; i < arr.length ; i++) {
              for (int j = i+1; j <arr.length ; j++) {
                  if ((arr[i] == x && arr[j] == y || arr[j] == x && arr[i] == x) && min_dist > Math.abs(i - j)){
                      min_dist = Math.abs(i - j);
                  }

              }

          }
          return min_dist;
      }
}

