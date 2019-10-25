package ch2;

public class HowAboutString {

	/**
     * Java String Pool example
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");		
        String s4 = new String("Cat");
        
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
        System.out.println("s4 == s3 :"+(s4==s3));
        
        System.out.println("s1 == s3.intern() :"+(s1==s3.intern()));
        System.out.println("s3 == s1.intern() :"+(s3==s1.intern()));
        
        System.out.println(s1.equals(s3));
    }

}
