/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
      int n = intervals.size();
      
        for (int i = 0; i < n-1; i++) {
          int j=i+1;
            Interval A = intervals.get(i);
            Interval B = intervals.get(j);
            if (Math.min(A.end, B.end) > Math.max(A.start, B.start)) {
                    return false;
                }
            
        }
        return true;

    }
}
