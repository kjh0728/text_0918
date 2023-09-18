package Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    public static final int NOT_INT = -1;
    public static String getCurrTime(LocalDateTime time)
    {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(time);
    }

    public static int ChangeInt(String str)
    {
        try
        {
            return Integer.parseInt(str);
        }
        catch (Exception e)
        {
            System.out.println("숫자만 입력 가능합니다.");
            return NOT_INT;
        }
    }
}
