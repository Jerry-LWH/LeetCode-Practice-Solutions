/**Author Wenhao Lin
 *
 *Every email consists of a local name and a domain name, separated by the @ sign.
 *
 *For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 *
 *Besides lowercase letters, these emails may contain '.'s or '+'s.
 *
 *If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the
 *same address without   dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  
 *(Note that this rule does not  apply for domain names.)
 *
 *If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered,
 *for example  m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
 *
 *It is possible to use both of these rules at the same time.
 *
 *Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i <emails.length;i++){
            String str = getStr(emails[i]);
            if(!list.contains(str)){
                list.add(str);
            }
        }
        return list.size();     
    }
    
    public static String getStr(String email){
        String s= "";
        boolean local=true;
        boolean ignore = false;
        
        for(int i = 0;i<email.length();i++){
            char letter = email.charAt(i);
            if(letter == '@'){
                local = false;
                s=s+"@";
                ignore=false;        
                continue;
            }
            if(letter == '.' && local==true){
                continue;
            }
            if(letter == '+' && local==true){
                ignore = true;
                continue;
            }
            if(ignore==true){
                continue;
            }
            s=s+ (letter+"");
        }
        return s;
    }
    
    
}