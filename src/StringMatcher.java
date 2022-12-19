public class StringMatcher {
    public static boolean isTrue(String s){
        return s.matches("[tT]rue [yY]es");
    }
    public static boolean isTrue2(String s){
        return s.matches("true");
    }
    public static boolean isTrue3(String s){
        return s.matches("[a-zA-Z]{3}");
    }
    public static boolean isTrue4(String s) {
        return s.matches("^[^\\d].*");
    }
    public static boolean isTrue5(String s) {
        return s.matches("([\\w&&[^b]])*");
    }
    public static boolean isTrue6(String s) {
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }
    public static boolean isTrue7(String s) {
        return s.matches("((25[0-5]|2[0-4]\\\\d|[0-1]?\\\\d\\\\d?)\\\\.){3}(25[0-5]|2[0-4]\\\\d|[0-1]?\\\n" +
                "\\d\\\\d?)");
    }
    public static void main(String[] args) {
        System.out.println(isTrue4("pedro"));
    }
}
