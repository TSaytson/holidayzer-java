public class Holiday {
  private String[] holidayDate = new String[] {
      "01/01/2023",
      "21/02/2023",
      "17/04/2023",
      "21/04/2023",
      "01/05/2023",
      "08/06/2023",
      "07/09/2023",
      "12/10/2023",
      "02/11/2023",
      "15/11/2023",
      "25/12/2023",
  };
  private String[] holiday = new String[] {
      "Confraternização mundial",
      "Carnaval",
      "Páscoa",
      "Tiradentes",
      "Dia do trabalho",
      "Corpus Christi",
      "Independência do Brasil",
      "Nossa Senhora Aparecida",
      "Finados",
      "Proclamação da República",
      "Natal"
  };

  public String getHoliday(String holiday) {
    for (int i = 0; i < holidayDate.length; i++) {
      if (holidayDate[i].equals(holiday))
        return this.holiday[i];
    }
    return "Não há feriado nessa data";
  }

  public void getAllHolidays() {
    for (String holiday : this.holiday) {
      System.out.println(holiday);
    }
  }

}
