import java.util.HashMap;
import java.util.Set;

public class HashMapFun{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Ride the Lightning", "Someone else controlling me");
        trackList.put("Atlas", "How does it feel on your own?");
        trackList.put("Master of Puppets", "Just call my name cuz I'll hear you scream.");
        trackList.put("Of Man and Beast", "Back to the meaning - back to the meaning of - LIFE.");

        String s = trackList.get("Ride the Lightning");

        Set<String> songs = trackList.keySet();

        for(String str : songs)
            System.out.println(trackList.get(str));
    }
}