/*
 * Given string consisting of only a,b and c.(example: "abcabc" )
 * We can perform the following operation : 
 *           'ab' gets converted to 'c'
 *           'bc' gets converted to 'a'
 *           'ca' gets converted to 'b'
 * We need to find the minimum length of final string after performing the operation.
 * We stop operating if there is only one character or only similar characters remain like 'aa' 'bb' or 'cccc'.
 * Return the final length of the string.(2 ie 'cc')
 * Steps in example:
 * 'abcabc' --- 'ab'->'c'
 * 'ccabc' --- 'ca'->'b'
 * 'cbbc' --- 'cb'->'a'
 * 'abc'--- 'ab'->'c'
 * 'cc' --- no further changes.
 * length = 2
 */
public class ConvertString {
    static int function(String str){
        int i=0;
        while(i<str.length()-1){
            if(str.charAt(i)==str.charAt(i+1))
            i++;
            else{
                if((str.charAt(i)=='a' && str.charAt(i+1)=='b') || (str.charAt(i)=='b' && str.charAt(i+1)=='a'))
                str=str.substring(0,i)+"c"+str.substring(i+2,str.length());
                if((str.charAt(i)=='b' && str.charAt(i+1)=='c') || (str.charAt(i)=='c' && str.charAt(i+1)=='b'))
                str=str.substring(0,i)+"a"+str.substring(i+2,str.length());
                if((str.charAt(i)=='a' && str.charAt(i+1)=='c') || (str.charAt(i)=='c' && str.charAt(i+1)=='a'))
                str=str.substring(0,i)+"b"+str.substring(i+2,str.length());
                i=0;
            }
        }
        return str.length();

    }
    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(function(str));
    }
}



/*
 * Optimised Approach:
 * static int function(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (i < sb.length() - 1) {
            if (sb.charAt(i) == sb.charAt(i + 1)){
                i++;
            } else {
                if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b' || sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                    sb.replace(i, i + 2, String.valueOf('c'));
                } else if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'c' || sb.charAt(i) == 'c' && sb.charAt(i + 1) == 'b') {
                    sb.replace(i, i + 2, String.valueOf('b'));
                } else if (sb.charAt(i) == 'c' && sb.charAt(i + 1) == 'a' || sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'c') {
                    sb.replace(i, i + 2, String.valueOf('b'));
                }
                i = 0;
            }
        }
        return sb.length();
    }
 */