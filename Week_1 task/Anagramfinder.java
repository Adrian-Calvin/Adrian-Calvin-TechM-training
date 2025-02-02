import java.util.*;

public class Anagramfinder{
    public static List<Integer>findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) 
        
        return result;

        int[] pFreq = new int[26]; 
        int[] sFreq = new int[26]; 

        for (int i = 0; i < p.length(); i++){
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, sFreq))
        {
            result.add(0);
        }
        
        for (int i = p.length(); i < s.length(); i++)
        {
            
            sFreq[s.charAt(i) - 'a']++;
            
            sFreq[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pFreq, sFreq))
            {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println(" Enter another non-empty string");
        String p = sc.next();
        sc.close();
        System.out.println(findAnagrams(s, p)); 
    }
}
