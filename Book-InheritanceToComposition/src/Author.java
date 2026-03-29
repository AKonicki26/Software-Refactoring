public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String xmlPayload() {
        return XML.tag("author",
                XML.tag("name", getName()) + "\r\n" +
                        XML.tag("email", getEmail()) + "\r\n"
        );
    }
}
