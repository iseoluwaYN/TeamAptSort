package sort;

import java.io.*;
import java.util.ArrayList;

public class SortNumbers {
    public static void main(String[] args) throws Exception {

        ArrayList<String> mtn = new ArrayList<>();
        ArrayList<String> airtel = new ArrayList<>();
        ArrayList<String> globacom = new ArrayList<>();
        ArrayList<String> nineMobile = new ArrayList<>();
        ArrayList<String> mtel = new ArrayList<>();

        File numberFile = new File("PhoneNumber.txt");
        BufferedReader contact = new BufferedReader(new FileReader(numberFile));
        String number;
        while ((number = contact.readLine()) != null) {

            if (number.startsWith("0703") || number.startsWith("0706") || number.startsWith("0803") || number.startsWith("0806") ||
                    number.startsWith("0810") || number.startsWith("0813") || number.startsWith("0814") || number.startsWith("0816") ||
                    number.startsWith("0903") || number.startsWith("0906") || number.startsWith("0913") || number.startsWith("0916") ||
                    number.startsWith(" 07025") || number.startsWith("07026") || number.startsWith("0704")) {
                mtn.add(number);
            }

            if (number.startsWith("0701") || number.startsWith("0708") || number.startsWith("0802") || number.startsWith("0808") ||
                    number.startsWith("0812") || number.startsWith("0901") || number.startsWith("0902") || number.startsWith("0904") ||
                    number.startsWith("0907") || number.startsWith("0912")) {
                airtel.add(number);
            }

            if (number.startsWith("0705") || number.startsWith("0805") || number.startsWith("0807") || number.startsWith("0811") ||
                    number.startsWith("0815") || number.startsWith("0905") || number.startsWith("0915")) {
                globacom.add(number);
            }

            if (number.startsWith("0809") || number.startsWith("0817") || number.startsWith("0818") || number.startsWith("0909") ||
                    number.startsWith("0908")) {
                nineMobile.add(number);
            }

            if (number.startsWith("0804")) {
                mtel.add(number);
            }
        }

    }
}
