import Exception.WrongLoginException;
import Exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Service {

    public static boolean veryfication(String login, String password, String confirmPassword) {
        //Проверяем 3 слова на соответсвие следующим правилам:
        //латинские буквы, цифры, "_", ".". Количество символов от 1 до 20 (для password от 1 до 19) включительно
        //Слово password должно быть равно confirmPassword
        if (!(Pattern.matches("^[a-zA-Z._0-9]{1,20}$", login))) {
            throw new WrongLoginException();
        }
        if (!(Pattern.matches("^[a-zA-Z_0-9]{1,19}$", password))) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return true;
    }

    //Отлавливаем ошибки и возвращаем false при их наличии
    public static boolean catchException(String login, String password, String confirmPassword) {
        try {
            return veryfication(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
            return false;
        }
    }
}