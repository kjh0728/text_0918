package Controller;

import Model.Article;
import Model.ArticleRepo;
import Util.Util;
import View.ArticleView;
import View.CommentView;

import java.util.Scanner;

public class ArticleCtrl {
    Scanner scan = new Scanner(System.in);

    ArticleRepo repo = new ArticleRepo();
    ArticleView view = new ArticleView();

    CommentCtrl comm_ctrl = new CommentCtrl();
    CommentView comm_view = new CommentView();

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String Title = scan.nextLine();

        System.out.print("게시물 내용을 입력해주세요 : ");
        String Content = scan.nextLine();

        repo.add(Title, Content);

        System.out.println("게시물이 등록되었습니다.");
    }

    public void updateTxt() {
        System.out.print("수정할 게시물 번호 : ");
        int num = Util.ChangeInt(scan.nextLine());
        if(num == Util.NOT_INT)
        {
            return;
        }

        var art = repo.FindByID(num);
        if (art == null)
        {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        update(art);
    }

    public void update(Article art)
    {
        System.out.print("제목 : ");
        String Title = scan.nextLine();

        System.out.print("내용 : ");
        String Content = scan.nextLine();

        art.setTitle(Title);
        art.setContent(Content);

        System.out.println(art.getID() + "번 게시물이 수정 되었습니다.");
    }

    public void deleteTxt() {
        System.out.print("삭제할 게시물 번호 : ");
        int num = Util.ChangeInt(scan.nextLine());
        if(num == Util.NOT_INT)
        {
            return;
        }

        var art = repo.FindByID(num);
        if (art == null)
        {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        delete(art);
    }

    public void delete(Article art)
    {
        repo.delete(art);
        System.out.println(art.getID() + "번 게시물이 삭제 되었습니다.");
    }

    public void list() {
        if(repo.idEmpty())
        {
            System.out.println("등록된 게시물이 없습니다.");
            return;
        }

        view.printArticles(repo.All_Art(), false);
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요. : ");
        int num = Util.ChangeInt(scan.nextLine());
        var art = repo.FindByID(num);

        if(art == null)
        {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        int menu = -1;
        art.plusView();

        while (menu != 5)
        {
            view.printArticle(art);
            comm_view.printComment(comm_ctrl.repo.FindByArtID(num));

            menu = subDetail(art);
        }


    }

    public int subDetail(Article art)
    {
        System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
        int menu = Util.ChangeInt(scan.nextLine());
        if(menu == Util.NOT_INT)
        {
            return Util.NOT_INT;
        }

        switch (menu)
        {
            case 1:
                comm_ctrl.add(art.getID());
                break;
            case 2:
                art.setGood();
                break;
            case 3:
                update(art);
                break;
            case 4:
                delete(art);
                menu = 5;
                break;
            case 5:
                break;
        }
        return menu;
    }

    public void search() {
    }

    public void page() {
    }
}
