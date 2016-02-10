public class StringFromChar {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String newStr = null;
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }
        System.out.println(newStr);
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

       String s = "Hello";
       String t = new String(s);
       if ("Hello".equals(s)) System.out.println("one");
       if (t == s) System.out.println("two");
       if (t.equals(s)) System.out.println("three");
       if ("Hello" == s) System.out.println("four");
       if ("Hello" == t) System.out.println("five");

     StringBuilder sb = new StringBuilder();
     sb.append("aaa").insert(1, "bb").insert(4, "ccc");
     System.out.println(sb);

     String s1 = "java";
 	   StringBuilder s2 = new StringBuilder("java");
 	 //   if (s1 == s2)
 	 //  System.out.print("1");
 	  if (s1.equals(s2))
 	  System.out.print("2");
    }
}
