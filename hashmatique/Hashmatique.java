import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Potions", "I remember when I saw you at the end of that night.....");
        userMap.put("Shelter", "I'll give them shelter, like you've done for me.....");
        userMap.put("Broken Ones", "I know the way the story goes.....");
        userMap.put("What You Know", "In a few weeks I will get time to realize it's right before my eyes.....");

        String name = userMap.get("Potions");
            System.out.println(name);
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println("Track: " + key + " Lyrics: " + userMap.get(key));
        }
    }
}