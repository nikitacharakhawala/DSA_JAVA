package javaadvanced.array3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverLappingIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals=new ArrayList<>();
       // Interval int5=new Interval(16,18);
        Interval int1=new Interval(30,63);
        Interval int2=new Interval(1,100);
        Interval int4=new Interval(66,94);
        Interval int3=new Interval(16,86);

        intervals.add(int1);
        intervals.add(int2);
        intervals.add(int3);
        intervals.add(int4);
       // intervals.add(int5);
        for(Interval k:getOverlappedInterval(intervals)){
            System.out.println(k.start+":"+k.end);
        }
    }

    public static ArrayList<Interval> getOverlappedInterval(ArrayList<Interval> intervals){
        ArrayList<Interval> answer=new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
       int index=0;
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<=intervals.get(index).end){
                intervals.get(index).end=Math.max(intervals.get(index).end, intervals.get(i).end);
                intervals.get(index).start=Math.min(intervals.get(index).start, intervals.get(i).start);
            }else{
                index++;
                intervals.set(index, intervals.get(i));
            }
        }
       // ArrayList<Interval> answer=new ArrayList<>();
        for(int i=0;i<=index;i++){
            answer.add(intervals.get(i));
        }
        return answer;
    }
}
