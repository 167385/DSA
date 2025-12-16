package InJava;

public class LongestCommonPrefix {
    public static void main(String[] args){
        LongestCommonPrefix prefix=new LongestCommonPrefix();
        String[] arg={"flower","flow","flight"};
       System.out.println(prefix.longestCommonPrefix(arg));
    }
        public String longestCommonPrefix(String[] strs) {

            String prefix = strs[0];

            for(int i=1; i<strs.length;i++){
                while(strs[i].indexOf(prefix)!=0){
                    prefix = prefix.substring(0, prefix.length()-1);
                }
            }

            return prefix;

        }
    }

