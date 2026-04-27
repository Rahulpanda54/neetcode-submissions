class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<List<Integer>> ans = new ArrayList<>();
        
        int i=0;   int n = intervals.length;

        while(i < n && intervals[i][1] < newInterval[0]){
            
            List<Integer> ds = new ArrayList<>();

            ds.add(intervals[i][0]);
            ds.add(intervals[i][1]);

            ans.add(ds);

            i++;
        }

        while(i < n && intervals[i][0] <= newInterval[1]){

            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

            i++;
        }

        List<Integer> l1 = new ArrayList<>();

        l1.add(newInterval[0]);
        l1.add(newInterval[1]);

        ans.add(l1);

        while(i < n &&  newInterval[1] < intervals[i][0]){

            List<Integer> ds = new ArrayList<>();

            ds.add(intervals[i][0]);
            ds.add(intervals[i][1]);

            ans.add(ds);

            i++;
        }

        int res[][] = new int[ans.size()][2];

        for(int ii=0; ii<ans.size(); ii++){

            res[ii][0] = ans.get(ii).get(0);
            res[ii][1] = ans.get(ii).get(1);
        }

        return res;
    }
}
