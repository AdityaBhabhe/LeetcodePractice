/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 0) return -1;
        int left = 0;
        int right = n;
       while(left < right){
           int midpoint = left + (right-left)/2;
            if(isBadVersion(midpoint)){
                right = midpoint;
            }else{
                left = midpoint + 1;
            }
       }
       if(isBadVersion(left) == true){
           return left;
       }
        return -1;
    }
}