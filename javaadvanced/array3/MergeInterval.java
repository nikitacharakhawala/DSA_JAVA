package javaadvanced.array3;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Interval{
    int start;
    int end;

    Interval(int start, int end){
        this.start=start;
        this.end=end;
    }
}
public class MergeInterval {
    public static void main(String[] args) {
        ArrayList<Interval> intervals=new ArrayList<>();
        Interval inte=new Interval(1,3);
        Interval inte1=new Interval(6,9);

        intervals.add(inte);
        intervals.add(inte1);


        Interval newInterval=new Interval(2,5);
        for(Interval inter:getMergedList(intervals, newInterval)){
            System.out.println(inter.start+"-"+inter.end);
        }
    }

    public static ArrayList<Interval> getMergedList(ArrayList<Interval> inter, Interval newInterval){
       int i=0;
       ArrayList<Interval> merged=new ArrayList<>();
       while(i<inter.size() && inter.get(i).end<=newInterval.start){
           merged.add(inter.get(i));
           i++;
       }

       while(i<inter.size() && inter.get(i).start<=newInterval.end){
           newInterval.start=Math.min(inter.get(i).start, newInterval.start);
           newInterval.end=Math.max(inter.get(i).end, newInterval.end);
           i++;
       }
       merged.add(newInterval);
       while(i<inter.size()){
           merged.add(inter.get(i));
           i++;
       }
       return merged;
    }
}
