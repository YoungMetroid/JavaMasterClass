package Java8;

public class LearningStringRegex {


    public static void main(String[]args){
        LearningStringRegex learningStringRegex = new LearningStringRegex();

        for(String s:args) {
            System.out.println(learningStringRegex.isValid(s));
        }

    }
    String pattern = "\\d?\\d?\\d\\.\\d?\\d?\\d\\.\\d?\\d?\\d.\\d?\\d?\\d";
    public boolean isValid(String IP){

        if(IP.matches(pattern)){
            String[] ips = IP.split("\\.");

            for(String num :ips){
                if(Integer.parseInt(num) > 255)
                    return false;
                //System.out.println(num);
            }
            return true;
        }

        return false;
    }
}
