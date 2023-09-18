package View;

import Model.Article;
import Util.Util;

import java.util.ArrayList;

public class ArticleView {

    public void printArticles(ArrayList<Article> arr, boolean detail)
    {
       for(Article art : arr)
       {
           System.out.println("=================================");
           System.out.println("번호 : " + art.getID());
           System.out.println("제목 : " + art.getTitle());

           if(detail)
           {
               System.out.println("내용 : " + art.getContent());
               System.out.println("조회수 : " + art.getView());
               System.out.println("추천수 : " + art.getGoodSize());
               System.out.println("작성일 : " + Util.getCurrTime(art.getAddTime()));
           }
       }
        System.out.println("=================================");
    }

    public void printArticle(Article art) {
        System.out.println("=================================");
        System.out.println("번호 : " + art.getID());
        System.out.println("제목 : " + art.getTitle());

        System.out.println("내용 : " + art.getContent());
        System.out.println("조회수 : " + art.getView());
        System.out.println("추천수 : " + art.getGoodSize());
        System.out.println("작성일 : " + Util.getCurrTime(art.getAddTime()));
        System.out.println("=================================");
    }

}
