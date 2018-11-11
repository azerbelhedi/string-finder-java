public class HelloWorld{
    
    public static int substringPos(String haystack , String needle){
         int i , j = 0;
         for(i = 0 ; i < haystack.length()-needle.length() +1;  i++ ){ 
            //System.out.println(haystack.charAt(i));
            while(haystack.charAt(i+j) == needle.charAt(j) ){
                if(j == (needle.length()-1)){return i;}
                j++;
            }
         }
         return -1;
     }
     
    public static void main(String []args){
        String haystack = "azer" ;
        String needle = "er" ;
        System.out.println(substringPos(haystack,needle));
        
     }
     
}
