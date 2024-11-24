package Problem16;

public class SecondsConvertion {
    public static void main(String[] args) {
        int inputSeconds = 86975;
        secondsConvertion(inputSeconds);
    }
        public static void secondsConvertion(int inputSeconds){
            int hours = 0;
            int minutes = 0;
            int seconds = 0;
            hours = inputSeconds / 3600;
            int remainder = inputSeconds % 3600;
            minutes = remainder / 60;
            seconds = remainder % 60;
            System.out.println(hours + " hours," + minutes + " minutes," + seconds + " seconds");
        }
    }

