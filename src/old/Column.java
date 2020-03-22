package old;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Column {

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("/Users/andrusha/Desktop/leasetech/Archive/output_column.txt", "UTF-8");

        String line = "Wersja arkusza\tNazwa foldera ze zdjęciami\tGlówne zdjecie\tMarka pojazdu\tModel pojazdu\tWersja\tRok produkcji\tPrzebieg\tVIN\tRodzaj paliwa\tDodatkowy opis" +
                "\tCena\tCena netto\tDo negocjacji\tTyp\tKolor\tDodatkowe wyposażenie:\tABS\tCD\tCentralny zamek" +
                "\tElektryczne szyby przednie\tElektrycznie ustawiane lusterka\tImmobilizer\tPoduszka powietrzna kierowcy" +
                "\tRadio fabryczne\tWspomaganie kierownicy\tAlarm\tAlufelgi\tASR (kontrola trakcji)\tAsystent parkowania" +
                "\tAsystent pasa ruchu\tBluetooth\tCzujnik deszczu\tCzujnik martwego pola\tCzujnik zmierzchu" +
                "\tCzujniki parkowania przednie\tCzujniki parkowania tylne\tDach panoramiczny\tElektrochromatyczne lusterka boczne" +
                "\tElektrochromatyczne lusterko wsteczne\tElektryczne szyby tylne\tElektrycznie ustawiane fotele" +
                "\tESP (stabilizacja toru jazdy)\tGniazdo AUX\tGniazdo SD\tGniazdo USB\tHak\tHUD (wyświetlacz przezierny)" +
                "\tIsofix\tKamera cofania\tKlimatyzacja automatyczna\tKlimatyzacja czterostrefowa\tKlimatyzacja dwustrefowa" +
                "\tKlimatyzacja manualna\tKomputer pokładowy\tKurtyny powietrzne\tŁopatki zmiany biegów\tMP3\tNawigacja GPS" +
                "\tOdtwarzacz DVD\tOgranicznik prędkości\tOgrzewanie postojowe\tPodgrzewana przednia szyba\tPodgrzewane lusterka boczne" +
                "\tPodgrzewane przednie siedzenia\tPodgrzewane tylne siedzenia\tPoduszka powietrzna chroniąca kolana\tPoduszki boczne przednie" +
                "\tPoduszki boczne tylne\tPrzyciemniane szyby\tRadio niefabryczne\tRegulowane zawieszenie\tRelingi dachowe\tSystem Start-Stop" +
                "\tSzyberdach\tŚwiatła do jazdy dziennej\tŚwiatła LED\tŚwiatła przeciwmgielne\tŚwiatła xenonowe\tTapicerka skórzana" +
                "\tTapicerka welurowa\tTempomat\tTempomat aktywny\tTuner TV\tWielofunkcyjna kierownica\tZmieniarka CD\tOpcje nadwozia:" +
                "\tLiczba miejsc\tLiczba drzwi\tKierownica po prawej" +
                "\tDane techniczne:\tPojemność skokowa [cm3]\tMoc [KM}\tSkrzynia biegów\tHistoria:\tKraj pochodzenia\tData pierwszej rejestracji\t" +
                "Numer rejestracyjny pojazdu\tZarejestrowany w Polsce\tPierwszy właściciel\tBezwypadkowy\tHomologacja ciężarowa";
        String[] columnNames = line.split("\t");
        int i = 2;
        int rowSep = 0;

        writer.println("Cell c" + 0 + " = row.createCell(i++);");
        writer.println("c0.setCellValue(\"" + columnNames[0] + "\");");
        writer.println("i++;");
        for (int j = 1; j < columnNames.length; j++) {
            if (rowSep == 4) {
                writer.println("i++;");
                i++;
                rowSep = 0;
            }
            writer.println("Cell c" + i + " = row.createCell(i++);");
            writer.println("c" + i + ".setCellValue(\"" + columnNames[j] + "\");");
            rowSep++;
            i++;

        }
        writer.close();

    }
}
