package Controller;

import Model.CommentRepo;
import View.CommentView;

import java.util.Scanner;

public class CommentCtrl {
    Scanner scan = new Scanner(System.in);

    CommentRepo repo = new CommentRepo();
    CommentView view = new CommentView();

    public void add(int art_num)
    {
        System.out.print("댓글 내용 : ");
        String content = scan.nextLine();

        repo.add(art_num, content);
        System.out.println("댓글이 성공적으로 등록되었습니다.");
    }

}
