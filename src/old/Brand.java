package old;

import java.io.*;
import java.util.*;
//import java.util.stream.Collectors;


public class Brand {

    public static void main(String[] args) throws IOException {


        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("/Users/andrusha/Desktop/leasetech/Archive/make.csv")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        TreeMap<String, String> map = new TreeMap<>();
        String line;
        StringBuilder sb = new StringBuilder();
        List<String[]> content = new ArrayList<>();
        try {
            while ((line = br.readLine()) != null) {

                String[] strings = line.split("\t");

                map.put(strings[6], strings[3]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter writer = new PrintWriter("/Users/andrusha/Desktop/leasetech/Archive/output_make.txt", "UTF-8");

        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println("insert into boss.subject_brand(name, eurotax_id, creation_date, update_date) values ('" + entry.getKey().trim() + "', " + entry.getValue().trim() + ", now(), now());");
            writer.println("insert into boss.subject_brand(name, eurotax_id, creation_date, update_date) values ('" + entry.getKey().trim() + "', " + entry.getValue().trim() + ", now(), now());");
        }

        writer.close();

    }

}