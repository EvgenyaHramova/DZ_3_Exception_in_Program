
public class SexException extends Exception{
    public SexException(){

    }
    public void sexException (String i){
        System.out.println("Exception: Неверные данные пола");
        System.out.printf("Это неправильный формат: %s", i);
        System.out.println();
    }
}
