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
        // List<String> os = lc64_24082023.fullJustify(
        //     new String[]{"This", "is", "an", "example", "of", "text", "justification."},
        //      16);
        List<String> os = lc64_24082023.fullJustify(
            new String[]{"What","must","be","acknowledgment","shall","be"},
             16);
        // List<String> os = lc64_24082023.fullJustify(
        //     new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"},
        //      20);     
        for(String s : os){
            System.out.println(s);
        }        
    }
}
