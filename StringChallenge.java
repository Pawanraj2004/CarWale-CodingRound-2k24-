/*
 * Input: String(example: hello*1)
 * Increment the character by one.(a->b,b->c......z->a)
 * Capitalize if there is any vowel in the string.(a->A,e->E,i->I,o->O,u->U)
 * Return the string after performing the changes.(example output: Ifmmp*1)
 */

public class StringChallenge {
    static String function(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if(ch == 'z')  //z->a
                    ch = 'a';
                else if(ch == 'Z') //Z->A
                    ch='A';
                else
                ch = (char)(ch + 1);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                ch=(char)(ch-32); //ASCII value 0f A=65 and of a=97 : diffrence = 32.
                str=str.substring(0,i)+ch+str.substring(i+1,str.length());
                }
        }
        return str;

    }
    public static void main(String[] args) {
        String str = "hello*1";
        System.out.println(function(str));
    }
}


/*
 * Optimised approach: 
 *  static String function(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'z') {
                    ch = 'a';
                } else if (ch == 'Z') {
                    ch = 'A';
                } else {
                    ch = (char)(ch + 1);
                }
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ch = (char)(ch - 32); // Capitalize the vowel
                }
                chars[i] = ch;
            }
        }
        return new String(chars);
    }
 */