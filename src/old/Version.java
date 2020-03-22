package old;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;


public class Version {

    public static void main(String[] args) throws IOException {


        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("/Users/andrusha/Desktop/leasetech/Archive/type.csv")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        StringBuilder sb = new StringBuilder();
        List<Tsen> paramsList = new ArrayList<>();
        boolean flag = false;
        try {
            int i = 0;
            while ((line = br.readLine()) != null && i<100) {

                String[] strings = line.split("\t");

                Tsen tsen = new Tsen();
                tsen.setOne(strings[5].replace("'", "''"));
                tsen.setTwo(strings[15].replace("'", "''"));
                tsen.setThree(strings[16].replace("'", "''").trim().equals("") ? null : strings[16]);
                tsen.setFive(strings[2].replace("'", "''").trim().equals("") ? null : strings[2]);  //eurotax_id
                tsen.setSix(strings[11].replace("'", "''").trim().equals("") ? null : strings[11]);
//                tsen.setSeven(strings[15]);
                tsen.setTen(strings[1].trim());


                tsen.setSeven(strings[21].replace(',', '.'));  //moc
                tsen.setEight(strings[28]);  //ilość drzwi
                tsen.setNine(strings[31].replace(',', '.'));   //poj sil


                paramsList.add(tsen);
                i++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter writer = new PrintWriter("/Users/andrusha/Desktop/leasetech/Archive/output_type.txt", "UTF-8");

        for ( Tsen item : paramsList) {
            switch (item.getTen()) {
                case "10":
                    writer.println("insert into leasetech.car_version(car_model_id,name,year_from,year_to, eurotax_id, car_type_id, creation_date, update_date, engine_power, engine_capacity, number_of_doors) SELECT sm.id , '"
                            + item.getOne().trim() + "', " + item.getTwo().trim() + ", " + item.getThree() + ", " + item.getFive().trim() + ", 1, now(), now(), " + item.getSeven().trim() + ", " + item.getNine().trim() + ", " + item.getEight() + " FROM leasetech.car_model sm WHERE sm.eurotax_id= " + item.getSix().trim() + ";");
                    break;
                case "20":
                    writer.println("insert into leasetech.car_version(car_model_id,name,year_from,year_to, eurotax_id, car_type_id, creation_date, update_date, engine_power, engine_capacity, number_of_doors) SELECT sm.id , '"
                            + item.getOne().trim() + "', " + item.getTwo().trim() + ", " + item.getThree() + ", " + item.getFive().trim() + ", 2, now(), now(), " + item.getSeven().trim() + ", " + item.getNine().trim() + ", " + item.getEight() + " FROM leasetech.car_model sm WHERE sm.eurotax_id= " + item.getSix().trim() + ";");
                    break;
                case "30":
                    writer.println("insert into leasetech.car_version(car_model_id,name,year_from,year_to, eurotax_id, car_type_id, creation_date, update_date, engine_power, engine_capacity, number_of_doors) SELECT sm.id , '"
                            + item.getOne().trim() + "', " + item.getTwo().trim() + ", " + item.getThree() + ", " + item.getFive().trim() + ", 3, now(), now(), " + item.getSeven().trim() + ", " + item.getNine().trim() + ", " + item.getEight() + " FROM leasetech.car_model sm WHERE sm.eurotax_id= " + item.getSix().trim() + ";");
                    break;
                case "40":
                    writer.println("insert into leasetech.car_version(car_model_id,name,year_from,year_to, eurotax_id, car_type_id, creation_date, update_date, engine_power, engine_capacity, number_of_doors) SELECT sm.id , '"
                            + item.getOne().trim() + "', " + item.getTwo().trim() + ", " + item.getThree() + ", " + item.getFive().trim() + ", 4, now(), now(), " + item.getSeven().trim() + ", " + item.getNine().trim() + ", " + item.getEight() + " FROM leasetech.car_model sm WHERE sm.eurotax_id= " + item.getSix().trim() + ";");
                    break;
                case "60":
                    writer.println("insert into leasetech.car_version(car_model_id,name,year_from,year_to, eurotax_id, car_type_id, creation_date, update_date, engine_power, engine_capacity, number_of_doors) SELECT sm.id , '"
                            + item.getOne().trim() + "', " + item.getTwo().trim() + ", " + item.getThree() + ", " + item.getFive().trim() + ", 5, now(), now(), " + item.getSeven().trim() + ", " + item.getNine().trim() + ", " + item.getEight() + " FROM leasetech.car_model sm WHERE sm.eurotax_id= " + item.getSix().trim() + ";");
                    break;
                case "80":
                    writer.println("insert into leasetech.car_version(car_model_id,name,year_from,year_to, eurotax_id, car_type_id, creation_date, update_date, engine_power, engine_capacity, number_of_doors) SELECT sm.id , '"
                            + item.getOne().trim() + "', " + item.getTwo().trim() + ", " + item.getThree() + ", " + item.getFive().trim() + ", 6, now(), now(), " + item.getSeven().trim() + ", " + item.getNine().trim() + ", " + item.getEight() + " FROM leasetech.car_model sm WHERE sm.eurotax_id= " + item.getSix().trim() + ";");
                    break;
            }
        }
        writer.close();

    }

}