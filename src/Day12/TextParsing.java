package Day12;

public class TextParsing {

    static double getFrequencyCount(String term, String doc) {
        term = term.toLowerCase();
        doc = doc.toLowerCase();
        int frequencyCount = 0;
        int indexOfTerm = doc.indexOf(term);
        while (indexOfTerm >= 0) {
            frequencyCount++;
            doc = doc.substring(indexOfTerm+ term.length());
            indexOfTerm = doc.indexOf(term);
        }
        return frequencyCount;
    }

    public static double termFrequency(String term, String doc) {
        double frequencyCount = getFrequencyCount(term, doc);
        System.out.println("Total no of times \"term\" appears in doc: " + frequencyCount);
        String splitChars[]=doc.split(" ");
        double totalTermCount = splitChars.length;
        System.out.println("Total terms in doc: " + totalTermCount);
        return (double) frequencyCount / totalTermCount;
    }

    public static void introToTextParsing(){

        String bookDetails = "Wuthering Heights, Jacob Elordi | Margot Robbie";
        System.out.println("Book details: " + bookDetails);
        String bookTitle = bookDetails.substring(0, bookDetails.indexOf(","));
        System.out.println("Title of book is: " + bookTitle);

        String actor1 = bookDetails.substring(bookDetails.indexOf(",") + 1, bookDetails.indexOf("|"));
        System.out.println("Actor1 is: " + actor1);
        String actor2 = bookDetails.substring(bookDetails.indexOf("|") + 1, bookDetails.length());
        System.out.println("Actor2 is: " + actor2);
    }

    public static void main(String[] args) {
//        introToTextParsing();

        String doc = "This is a test. This test is simple.";
        String term = "test";
        System.out.println(termFrequency(term, doc));
    }
}
