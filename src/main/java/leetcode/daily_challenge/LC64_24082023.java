package leetcode.daily_challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC64_24082023 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int length = 0;
        List<String> r = new ArrayList<>();
        List<String> cand = new ArrayList();
        
        int i=0;
        while(i<words.length){
            if(length + words[i].length() + cand.size() > maxWidth){                
                r.add(prepareLine(cand, maxWidth, length, false));
                cand = new ArrayList<>();
                length = 0;
                continue;
            }            
            cand.add(words[i]);
            length += words[i].length();                    
            i++;
        }
        if(cand.size() > 0) r.add(prepareLine(cand, maxWidth, length, true));

        return r;
    }

    public String prepareLine(List<String> cand, int maxWidth, int length, boolean last){
        int wordCount = cand.size() - 1;
        int gap = maxWidth - (length + wordCount);                
        int idv = 0;
        int[] sizes = new int[wordCount];
        if(gap > 0 && cand.size()> 1){
            idv = gap/wordCount;
            int used = idv * wordCount;
            for(int i=0; i<wordCount; i++){
                sizes[i] = idv;
            }

            while(used < gap){
                for(int i=0; i<wordCount; i++){
                    if(gap - used >= 1){              
                        sizes[i] += 1;
                        used += 1;
                    }
                }
            }
        }

        String line = "";
        for(int j=0; j<cand.size(); j++){
            line += cand.get(j);
            if(j != cand.size()-1){
                line += " ";
                if(!last){
                    int spaceSize = sizes[j];
                    for(int k=0; k<spaceSize; k++){
                        line += " ";
                    }
                }
            }
        }
        if(last){
            for(int k=0; k<gap; k++){
                line += " ";
            }
            gap = 0;
        }
        if(cand.size() == 1){
            for(int k=0; k<gap; k++){
                line += " ";
            }
        }
        return line;
    }

    public String prepareLineX(List<String> cand, int maxWidth, int length, boolean last){
        int gap = maxWidth - (length + cand.size() - 1);                
        int idv = 0;
        if(gap > 0 && cand.size()> 1){
            idv = gap/(cand.size() - 1);
            if(gap % (cand.size()-1) != 0) idv += 1;
        }

        String line = ""; int used = 0;
        for(int j=0; j<cand.size(); j++){
            line += cand.get(j);
            if(j != cand.size()-1){
                line += " ";
                if(!last){
                    int spaceSize = idv;
                    if(spaceSize + used > gap) spaceSize -= 1;
                    for(int k=0; k<spaceSize; k++){
                        line += " ";
                    }
                    used += spaceSize;
                }
            }
        }
        if(last){
            for(int k=0; k<gap; k++){
                line += " ";
            }
        }
        if(cand.size() == 1){
            for(int k=0; k<gap; k++){
                line += " ";
            }
        }
        return line;
    }
}

class LC64_24082023Test {
    public static void main(String[] args){
        LC64_24082023 lc64_24082023 = new LC64_24082023();
        List<String> os = lc64_24082023.fullJustify(
            new String[]{"This", "is", "an", "example", "of", "text", "justification."},
             16);
        // List<String> os = lc64_24082023.fullJustify(
        //     new String[]{"What","must","be","acknowledgment","shall","be"},
        //      16);
        // List<String> os = lc64_24082023.fullJustify(
        //     new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"},
        //      20);  
        // List<String> os = lc64_24082023.fullJustify(
        //     new String[]{"Give","me","my","Romeo;","and,","when","he","shall","die,","Take","him","and","cut","him","out","in","little","stars,","And","he","will","make","the","face","of","heaven","so","fine","That","all","the","world","will","be","in","love","with","night","And","pay","no","worship","to","the","garish","sun."},
        //      25);
        // List<String> os = lc64_24082023.fullJustify(
        //     new String[]{"so","fine","That","all","the", "hhhhhhhhhhhhhhhhhhhhh"},
        //      25);
        for(String s : os){
            System.out.println(s);
        }        
    }
}
/**
 * 

 
["Give  me  my  Romeo; and,","when  he  shall die, Take","him  and  cut  him out in","little stars, And he will","make  the  face of heaven","so   fine   That  all  the","world  will  be  in  love","with  night  And  pay  no","worship   to   the  garish","sun.                     "]
["Give  me  my  Romeo; and,","when  he  shall die, Take","him  and  cut  him out in","little stars, And he will","make  the  face of heaven","so   fine  That  all  the","world  will  be  in  love","with  night  And  pay  no","worship   to  the  garish","sun.                     "]
 * 
 */