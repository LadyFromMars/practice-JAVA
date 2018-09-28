/*The program contain the data about continents in descending order. Type in number from 1 to 7 to learn more.
*/



public class Continents {
	public static void main(String[] args) {

    int continent = 6;
    String number;

    switch (continent) {
      case 1:
        number = "Asia";
        break;

      case 2:
        number = "Africa";
        break;

      case 3:
        number = "North America";
        break;

      case 4:
        number = "South America";
        break;

      case 5:
        number = "Antarctica";
        break;

      case 6:
        number = "Europe";
        break;

      case 7:
        number = "Australia";
        break;

      default:
        number = "There are 7 continents. Please, choose number from 1 to 7.";
      break;
    }

     System.out.println(number);

	}
}
