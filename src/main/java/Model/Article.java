package Model;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Article {

    int ID;
    String MemID;
    String Title;
    String Content;

    int View;
    int Good;

    LocalDateTime addTime;

    public Article(int id, String title, String content, LocalDateTime time)
    {
        ID = id;
        Title = title;
        Content = content;
        addTime = time;
        View = 0;
        Good = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMemID() {
        return MemID;
    }

    public void setMemID(String memID) {
        MemID = memID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getView() {
        return View;
    }

    public void plusView() {
        View++;
    }

    public int getGoodSize() {
        return Good;
    }

    public void setGood() {
       Good++;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }
}
