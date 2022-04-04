import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s it is lovely to see you", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The date is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {

        if(conversation.indexOf("Alexis") > -1) {
            return "Dont go to her!!! she is the worst!";    
        }
        if(conversation.indexOf("Alfred") > -1){
            return "how can i help you friend";
        }
        if(conversation.indexOf("Batman") > -1){
            return "only you would say that! you sound like alexis!";
        }
        return "Correct! you are amazing! i will get right to it! ";
    }
    
}

