package zaj1;

/**
 * Created by klb on 03.06.18.
 */
public class BinarySearch {

    //zakladamy ze el. w T sa posortowane nierosnaco
    public static boolean search(int []T, int x) {
        int begin = 0;           //O(1)
        int end = T.length - 1;  //O(1)
        //niech T ma n elementow
        while(begin <= end) {   //n/2 iteracji => O(logn)
            int s = (begin + end)/2;
            if(T[s] == x) {
                return true;
            }
            if(x < T[s]) {
                begin = s + 1;
            } else //gdy x >= T[s]
            {
                end = s - 1;
            }
        }
        return false;
    }

}
