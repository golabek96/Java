package Blog2018;

import java.util.*;

public class Note {

    private String title, content;
    private List<Comment> comments = new ArrayList();

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
   
    public void add(Comment comment) {
        comments.add(comment);
    }
    
    public List<Comment> getComments() {
        return comments;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Wpis");
        sb.append("\ntytul: "+title);
        sb.append("\ntresc: "+content);
        sb.append("\nkomentarze: "+comments);
        sb.append("\n");
        return sb.toString();
        
    }
     public int numberOfComments(){
         return comments.size();
     }
}
