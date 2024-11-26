package Problem16;

import java.util.ArrayList;
import java.util.List;

public class SecondsConvertion {
    public static void main(String[] args) {
        int inputSeconds = 86975;
        List<Integer> list= secondsConvertion(inputSeconds);
        System.out.println(list.get(0) + " hours," + list.get(1) + " minutes," + list.get(2) + " seconds");
    }

    public static List<Integer> secondsConvertion(int inputSeconds){
        List<Integer> convertionList=new ArrayList<>();
            int hours = 0;
            int minutes = 0;
            int seconds = 0;
            hours = inputSeconds / 3600;
            int remainder = inputSeconds % 3600;
            minutes = remainder / 60;
            seconds = remainder % 60;
            convertionList.add(hours);
            convertionList.add(minutes);
            convertionList.add(seconds);
            return convertionList;
        }
    }

