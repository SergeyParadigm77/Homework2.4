
public class Main {
    public static void main(String[] args) {
        //соблюдаются все правила
        System.out.println(Service.catchException("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9"));
        //логин содержит больше 20 символов
        System.out.println(Service.catchException("I_love_java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9"));
        //password и confirmpassword не равны
        System.out.println(Service.catchException("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_99"));
        //password и confirmpassword содержат больше 19 символов
        System.out.println(Service.catchException("java_skypro.go", "D_1hWiKjjP_999999999", "D_1hWiKjjP_999999999"));
    }
}