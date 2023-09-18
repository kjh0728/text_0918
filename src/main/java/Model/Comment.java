package Model;

import java.time.LocalDateTime;

public class Comment {
    int Art_num;
    String Content;
    LocalDateTime addTime;

    public Comment(int art_num, String content, LocalDateTime time)
    {
        Art_num = art_num;
        Content = content;
        addTime = time;
    }

    public int getArt_num() {
        return Art_num;
    }

    public String getContent() {
        return Content;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }
}
