public class Paperback implements BookType {

    private String pageCount;
    private String weight;
    Paperback(String pageCount, String weight) {
        this.pageCount  = pageCount;
        this.weight = weight;
    }
    @Override
    public String xmlPayload() {
        return XML.tag("paperback",
                XML.tag("pageCount", pageCount) + "\r\n" +
                        XML.tag("weight", weight) + "\r\n"

        );
    }
}

