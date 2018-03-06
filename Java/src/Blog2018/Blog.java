package Blog2018;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Blog {

    private List<Note> notes = new ArrayList();
    private String title;

    public Blog(String title) {
        this.title = title;
    }

    public void add(Note note) {
        notes.add(note);
    }

    public String toString() {
        return title + "\n\n" + notes;
    }

    public Comment LastComment(){
        List<Comment> allComments = new ArrayList();
        for(Note note : notes)
        {
            allComments.addAll(note.getComments());
        }
        Comment result = allComments.get(0);
        for(Comment comment : allComments)
        {
            LocalDate d1 = comment.getDate();
            LocalDate d2 = result.getDate();
            if(d1.isAfter(d2))
            {
                result = comment;
            }
        }
    }
    
    public Note mostPopular() {
        int max = 0;
        Note result = null;
        for (Note note : notes) {
            int count = note.numberOfComments();
            if (count > max) {
                result = note;
                max = count;
            }
        }
        return result;

    }

    public List<Note> mostPopulars() {
        return null;
    }

//    public Comment lastComment() {
//        LocalDate now = LocalDate.now();
//        Comment result = null;
//        long min = Long.MIN_VALUE;
//        for (Note note : notes) {
//            for (Comment comment : note.getComments()) {
//                LocalDate date = comment.getDate();
//                long x = now.until(date, ChronoUnit.MINUTES);
//                if (x < min) {
//                    min = x;
//                    result = comment;
//                }
//            }
//        }
//        return result;
//    }

    public List<Comment> lastComments() {
        return null;
    }

}
