

public class Main {

	public static void main(String[] args) {
		Book refactoring = new BookBuilder("Refactoring: improving the desgin of existing code")
				.setISBN("ISBN0201485672")
				.setPrice("$4495")
				.setAuthor(new Author("Martin Fowler", "fowler@acm.org"))
				.addbookType(new Paperback("253", "0.5"))
				.addbookType(new AudioBook("120", "mp3"))
				.buildBook();

		System.out.println(refactoring.toXml());
	}

}
