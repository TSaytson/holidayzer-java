import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        Holiday holiday = new Holiday();
        System.out.println();
        System.out.print("Digite a data desejada no formato DD/MM/YYYY: ");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String date = buffer.readLine();
        System.out.println(holiday.getHoliday(date));
        System.out.print("Deseja ver todos os feriados? Digite s ou n: ");
        char yn = (char) buffer.read();
        if (yn == 's') holiday.getAllHolidays();
    }
}
