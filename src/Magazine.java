public class Magazine extends ReadingItem{

    private String coverStoryTitle;
    private String printDate;

    public Magazine(String name, String location, int price, String description, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(name, location, price, description, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public Magazine(int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public Magazine(){
        coverStoryTitle="";
        printDate="";
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "coverStoryTitle='" + coverStoryTitle + '\'' +
                ", printDate='" + printDate + '\'' +
                "}{"+getWordCount()+", "+getDatePublished()+","+getAuthor()+"}{"+getName()+", "+getLocation()+", "+getLocation()+", "+getPrice()+", "+getDescription()+"}";
    }
}
