


public class DataException extends Exception{
    public DataException(){

    }
    public void dataException (String i){
        System.out.println("Exception: Неверные данные");
        System.out.printf("Это неправильный формат: %s", i);
        System.out.println();
    }
}
