//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        DeskPhone myPhone = new DeskPhone("123456");
//        myPhone.powerOn();
//        myPhone.callPhone("123456");
//        myPhone.answer();

        MobilePhone myPhone = new MobilePhone("1234");
        myPhone.powerOn();
        myPhone.callPhone("1234");
        myPhone.answer();
    }
}