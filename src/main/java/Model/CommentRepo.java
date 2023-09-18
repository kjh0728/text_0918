package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CommentRepo {
    private ArrayList<Comment> comm_arr =new ArrayList<>();

    public void add(int art_num, String content)
    {
        comm_arr.add(new Comment(art_num, content, LocalDateTime.now()));
    }

    public ArrayList<Comment> FindByArtID(int art_id)
    {
        ArrayList<Comment> findcomm = new ArrayList<>();
        for(Comment comm : comm_arr)
        {
            if(comm.getArt_num() == art_id)
            {
                findcomm.add(comm);
            }
        }
        return findcomm;
    }
}
