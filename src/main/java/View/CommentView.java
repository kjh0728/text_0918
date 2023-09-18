package View;

import Model.Comment;
import Util.Util;

import java.util.ArrayList;

public class CommentView {

    public void printComment(ArrayList<Comment> arr)
    {
        for(Comment art : arr)
        {
            System.out.println("=================================");
            System.out.println("내용 : " + art.getContent());
            System.out.println("작성일 : " + Util.getCurrTime(art.getAddTime()));
        }
        System.out.println("=================================");
    }
}
