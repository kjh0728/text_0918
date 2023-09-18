package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ArticleRepo {
    private ArrayList<Article> art_arr = new ArrayList<>();

    public ArrayList<Article> All_Art()
    {
        return art_arr;
    }

    public boolean idEmpty()
    {
        return art_arr.isEmpty();
    }


    public void add(String title, String content)
    {
        art_arr.add(new Article(art_arr.size()+1, title, content, LocalDateTime.now()));
    }

    public void delete(Article art)
    {
        art_arr.remove(art);
    }

    public Article FindByID(int id)
    {
        for(Article art : art_arr)
        {
            if(art.getID() == id)
            {
                return art;
            }
        }
        return null;
    }

    public ArrayList<Article> FindByTitle(String keyword)
    {
        ArrayList<Article> findart = new ArrayList<>();
        for(Article art : art_arr)
        {
            if(art.getTitle().contains(keyword))
            {
                findart.add(art);
            }
        }
        return findart;
    }


}
