public class AudioBook implements BookType {
    private String duration;
    private String audioType;
    AudioBook(String duration, String audioType) {
        this.duration  = duration;
        this.audioType = audioType;
    }

    @Override
    public String xmlPayload() {
        return XML.tag("audiobook",
                XML.tag("pageCount", duration) + "\r\n" +
                        XML.tag("weight", audioType) + "\r\n"

        );
    }
}
