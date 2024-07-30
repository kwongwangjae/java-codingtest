// class Solution {
//     public boolean isPalindrome(String s) {
//         int start = 0;
//         int end = s.length() - 1;
//         while(start < end){
//             if(!Character.isLetterOrDight(s.charAt(start))){
//                 start++;
//             } else if(!Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
//                 retrun false;
//             }
//             start++;
//             end--;
//         }
//     }
//     return true;
// }





class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() -1;
        while(start < end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            } else{
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }
        } 
        return true;
    }
}