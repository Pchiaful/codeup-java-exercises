public class JavaDrills {

//        WIP
//    public static String flipOuterCase(String str){
//        for (int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if (Character.isUpperCase(c)){
//                Character.toString();
//            }
//        }
//        return str;
//    }

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat"));
    }

//    SSEBASTIONS STACK OVERFLOW SOLUTION
// Source: https://stackoverflow.com/questions/1729778/how-can-i-invert-the-case-of-a-string-in-java
public static String flipOuterCase(String str) {
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; i++) {
        if (Character.isUpperCase(chars[i])) {
            chars[i] = Character.toLowerCase(chars[i]);
        } else if (Character.isLowerCase(chars[i])) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
    }
    return new String(chars);
}

    public static void main(String[] args) {
        System.out.println(JavaDrills.flipOuterCase("cAt"));
    }
}
