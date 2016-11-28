package algorithm_database;
/**
 *  翻转字符串：you are great  变为  great are  you
 * 
 */
public class InverseString {
    
  public static void main(String[] args){
        String str = "you       are a      dog";
        char[] charStr = str.toCharArray();
        inverse(charStr,0,charStr.length-1);
        System.out.println(charStr);
        int l = -1;
        int r = -1;
        for(int i=0;i<charStr.length;i++){
            if(charStr[i] !=' '){
                l = i==0 || charStr[i-1]==' ' ?i:l;               //很难理解？为了找每一个单词的初始下标
                r = i==charStr.length-1||charStr[i+1]==' ' ?i:r;  //很难理解？为了找每一个单词的结束下标
            }
            if(l!=-1 && r!=-1){
                inverse(charStr,l,r);
                l = -1;
                r = -1;
            }
        }
        System.out.println(charStr);
    }
    
    public static char[] inverse(char[] charStr,int start ,int end){
        while(start<end){
            char temp = charStr[start];
            charStr[start] = charStr[end];
            charStr[end] = temp;
            start++;
            end--;
        }
        return charStr;
    }
}