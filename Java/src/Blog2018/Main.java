package Blog2018;

public class Main {
    public static void main(String args[])
    {
    Blog blog = new Blog("Blog zalosny");    
    Note note1 = new Note("Smiech","Za gorami za lasami sie smmiali");
    Note note2 = new Note("Zalosc","Za gorami za lasami sie zalamywali");
    Note note3 = new Note("Smutek","Za gorami za lasami plakali");
    blog.add(note1);
    blog.add(note2);
    blog.add(note3);
    Comment c1 = new Comment("Ehh","EHEHHEHEHEHE");
    note1.add(c1);
    Comment c2 = new Comment("zalzalzal","xaxaxaxa");
    note2.add(c2);
    Comment c3 = new Comment("bozeee","bozebozeboze");
    note3.add(c3);
    System.out.println(blog);
        System.out.println(blog.mostPopular());
    }
}
