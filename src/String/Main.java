package String;

public class Main {

    public static void stringBuffer(){
        //doesn't user String constant pool , but heap itself, and is faster in concatination.
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints HJavaello

        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo
    }
    public static void main(String[] args) {
        //immutability example
        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects

        s=s.concat(" Tendulkar");
        System.out.println(s);  // now we updated the reference . it shows sachin tendulkar

        // if you were to create a new string with same value, a new heap memory is NOT allocated
        String p="Sachin";

        // trying to check similarities in variable p and s;
        System.out.println(p==s);   //p and s are referencing same value in the string constant pool
        //hence true

        //NOTE : '==' compares references in this case not value.

        //METHODS OF A STRING

        String s2=s.intern();   //if s is in the pool then string is returned , if not the  string is created and reference is returned
        System.out.println(s2);

        String s3=s.replace("Sachin","Mahi");
        System.out.println(s3);

        //STRING BUFFER
        stringBuffer();
    }
}
