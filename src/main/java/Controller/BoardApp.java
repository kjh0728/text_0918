package Controller;

import java.util.Scanner;

public class BoardApp {

    Scanner scan = new Scanner(System.in);

    public void start()
    {
        String menu = "";

        ArticleCtrl art_ctrl = new ArticleCtrl();

        while (!menu.equals("exit"))
        {
            System.out.print("명령어를 입력해주세요 : ");

            menu = scan.nextLine();

            if(menu.equals("add"))
            {
                art_ctrl.add();
            }
            else if(menu.equals("update"))
            {
                art_ctrl.updateTxt();
            }
            else if(menu.equals("delete"))
            {
                art_ctrl.deleteTxt();
            }
            else if(menu.equals("list"))
            {
                art_ctrl.list();
            }
            else if(menu.equals("detail"))
            {
                art_ctrl.detail();
            }
            else if(menu.equals("search"))
            {
                art_ctrl.search();
            }
            else if(menu.equals("page"))
            {
                art_ctrl.page();
            }

        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
