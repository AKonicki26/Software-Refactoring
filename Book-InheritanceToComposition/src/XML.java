public class XML {
    public static String tag(String element, String content) {
        return String.format("<%1$s>%2$s</%1$s>", element, content);
    }
}
