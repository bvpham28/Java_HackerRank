package Java_Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 4/27/2017.
 */
public class Tag_Content_Extractor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases > 0){
            String line = scan.nextLine();

            int cur=0;
            boolean none=true;
            for(;;){
                int start=line.indexOf("<",cur);
                if(start<0)break;
                int end=line.indexOf(">",start);
                if(end<0)break;
                String tag=line.substring(start+1,end);
                if(tag.length()==0 || tag.charAt(0)=='/'){
                    cur=end+1;
                    continue;
                }
                int brk=line.indexOf("</"+tag+">");
                if(brk>=0){
                    String output=line.substring(end+1,brk);
                    if(output.length()>0 && output.indexOf("<")<0){
                        none=false;
                        System.out.println(output);
                    }
                }
                cur=end+1;
            }
            if(none)System.out.println("None");
            testCases--;
        }
    }
}
