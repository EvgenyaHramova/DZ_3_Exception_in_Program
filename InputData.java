
import java.util.Scanner;

public class InputData {
    public String[] enterData(){
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите через пробел ФИО, дату рождения в формате дд.мм.гггг, номер телефона - цифры, пол - f/m) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные, пожалуйста, повторите попытку");
            } else {
                System.out.println("Вы ввели дополнительные данные, пожалуйста, повторите попытку");
            }
            iScanner.close(); 
        }
        
    }
    
}
