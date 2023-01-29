public class Check {
     //Function to check if an input has mark as the first word
     public static boolean isMark(String input){
        if(input.length()>=4){
            if("mark".equalsIgnoreCase(input.substring(0,4))){
                return true;
            }
        }
        return false;
    }

    //Function to check if an input has unmark as the first word
    public static boolean isUnmark(String input){
        if(input.length()>=6){
            if("unmark".equalsIgnoreCase(input.substring(0,6))){
                return true;
            }
        }
        return false;
    }

    //Function to check if an input has deadline as the first word
    public static boolean isDeadline(String input){
        if(input.length()>=8){
            if("deadline".equalsIgnoreCase(input.substring(0,8))){
                return true;
            }
        }
        return false;
    }

    //Function to check if an input has event as the first word
    public static boolean isEvent(String input){
        if(input.length()>=5){
            if("event".equalsIgnoreCase(input.substring(0,5))){
                return true;
            }
        }
        return false;
    }

    //Function to check if an input has todo as the first word
    public static boolean isTodo(String input){
        if(input.length()>=4){
            if("todo".equalsIgnoreCase(input.substring(0,4))){
                return true;
            }
        }
        return false;
    }

}
