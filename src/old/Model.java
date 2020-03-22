package old;

import java.io.*;
import java.util.*;


public class Model {

    public static void main(String[] args) throws IOException {


        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("/Users/andrusha/Desktop/leasetech/Archive/model.csv")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        StringBuilder sb = new StringBuilder();
        List<Tsen> paramsList = new ArrayList<>();
        try {
            while ((line = br.readLine()) != null) {

                String[] strings = line.split("\t");

                if (strings[2].trim().equals("PLPL")) {

                    Tsen tsen = new Tsen();
                    tsen.setOne(strings[3].replace("'", "''"));   //(modnatcode)
                    tsen.setTwo(strings[6].replace("'", "''"));   //(modmakcd)
                    tsen.setThree(strings[8].replace("'", "''")); //(modname)
                    tsen.setFour(strings[10].replace("'", "''")); //(modnamegrp1)
                    tsen.setFive(strings[11].replace("'", "''")); //(modnamegrp2)
                    tsen.setSix(strings[13].replace("'", "''"));  //(modbegin)
                    tsen.setSeven(strings[14].replace("'", "''").trim().equals("") ? null : strings[14]); //(modend)

                    paramsList.add(tsen);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter writer = new PrintWriter("/Users/andrusha/Desktop/leasetech/Archive/output_model.txt", "UTF-8");

        for ( Tsen item : paramsList) {
            writer.println("insert into leasetech.car_model(car_brand_id,name,detailed_name,year_from,year_to, eurotax_id, creation_date, update_date) SELECT sb.id , '"
                    + item.getThree().trim() + "', '" + item.getFour().trim() + "', " + item.getSix().trim() + ", " + item.getSeven() + ", " + item.getOne() + ", now(), now() FROM leasetech.car_brand sb WHERE sb.eurotax_id= " + item.getTwo() +";");
        }
        writer.close();

    }

}