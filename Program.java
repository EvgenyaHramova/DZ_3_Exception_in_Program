
import java.io.IOException;
import java.util.HashMap;

public class Program{
    public static void main(String[] args) {
        ParsData parsData = new ParsData(); //создание объекта класса ParseData
        String newFileName = null; //иннициализация переменной
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData(); //создание словаря
        while (data.size() != 6) {
            try {
                throw new DataException(); 
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } //цикл для ввода данных, пока пользователь не введет их корректно

        newFileName = data.get("Фамилия") + ".txt"; //указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }
        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); //Вызов метода класса WriteFile для записи в файл

    }

}