//import java.io.PrintWriter;
//
//public class Enummm {
//
//    public static void main(String[] args) throws Exception {
//        PrintWriter writer = new PrintWriter("/Users/andrusha/Desktop/leasetech/Archive/output_enum.txt", "UTF-8");
//        String line = "VERSION(\"Wersja arkusza\"),\n" +
//                "    IMAGE_FOLDER_NAME(\"Nazwa foldera ze zdjęciami\"),\n" +
//                "    MAIN_IMAGE_NAME(\"Glówne zdjecie\"),\n" +
//                "    CAR_BRAND(\"Marka pojazdu\"),\n" +
//                "    CAR_MODEL(\"Model pojazdu\"),\n" +
//                "    CAR_VERSION(\"Wersja\"),\n" +
//                "    PRODUCTION_YEAR(\"Rok produkcji\"),\n" +
//                "    MILEAGE(\"Przebieg\"),\n" +
//                "    VIN(\"VIN\"),\n" +
//                "    CAR_FUEL_TYPE(\"Rodzaj paliwa\"),\n" +
//                "    ADDITIONONAL_DESCRIPTION(\"Dodatkowy opis\"),\n" +
//                "    PRICE(\"Cena\"),\n" +
//                "    PRICE_NETTO(\"Cena netto\"),\n" +
//                "    TO_NEGOTIOATE(\"Do negocjacji\"),\n" +
//                "    TYPE(\"Typ\"),\n" +
//                "    COLOR(\"Kolor\"),\n" +
//                "    ADDITIONAL_EQUIPMENT(\"Dodatkowe wyposażenie:\"),\n" +
//                "    CAR_BODY(\"Opcje nadwozia:\"),\n" +
//                "    SEAT_AMOUNT(\"Liczba miejsc\"),\n" +
//                "    DOORS_AMOUNT(\"Liczba drzwi\"),\n" +
//                "    RIGHT_SIDE_STEERING_WHEEEL(\"Kierownica po prawej\"),\n" +
//                "    TECHNICAL_DATA(\"Dane techniczne:\"),\n" +
//                "    ENGINE_CAPACITY_CM3(\"Pojemność skokowa [cm3]\"),\n" +
//                "    ENGINE_POWER(\"Moc [KM}\"),\n" +
//                "    GEAR_BOX_TYPE(\"Skrzynia biegów\"),\n" +
//                "    HISTORY(\"Historia:\"),\n" +
//                "    COUNTRY_OF_ORIGIN(\"Kraj pochodzenia\"),\n" +
//                "    FIRST_REGISTRATION_DATE(\"Data pierwszej rejestracji\"),\n" +
//                "    CAR_NUMBER(\"Numer rejestracyjny pojazdu\"),\n" +
//                "    REGISTERED_IN_POLAND(\"Zarejestrowany w Polsce\"),\n" +
//                "    FIRST_OWNER(\"Pierwszy właściciel\"),\n" +
//                "    NOT_CRASHED(\"Bezwypadkowy\"),\n" +
//                "    TRACK_APPROVAL(\"Homologacja ciężarowa\"),\n" +
//                "    ABS(\"ABS\"),\n" +
//                "    CD(\"CD\"),\n" +
//                "    CENTRAL_LOCKING(\"Centralny zamek\"),\n" +
//                "    ELECTRIC_FRONT_WINDOWS(\"Elektryczne szyby przednie\"),\n" +
//                "    ELECTRICALLY_ADJUSTABLE_MIRRORS(\"Elektrycznie ustawiane lusterka\"),\n" +
//                "    IMMOBILIZER(\"Immobilizer\"),\n" +
//                "    DRIVER_AIRBAG(\"Poduszka powietrzna kierowcy\"),\n" +
//                "    FACTORY_RADIO(\"Radio fabryczne\"),\n" +
//                "    POWER_STEERING(\"Wspomaganie kierownicy\"),\n" +
//                "    ALARM(\"Alarm\"),\n" +
//                "    ALU_RIMS(\"Alufelgi\"),\n" +
//                "    ASR(\"ASR (kontrola trakcji)\"),\n" +
//                "    PARK_ASSIST(\"Asystent parkowania\"),\n" +
//                "    LANE_ASSIST(\"Asystent pasa ruchu\"),\n" +
//                "    BLUETOOTH(\"Bluetooth\"),\n" +
//                "    RAIN_SENSOR(\"Czujnik deszczu\"),\n" +
//                "    BLIND_SPOT_MONITOR(\"Czujnik martwego pola\"),\n" +
//                "    DUSK_SENSOR(\"Czujnik zmierzchu\"),\n" +
//                "    FRONT_PARKING_SENSORS(\"Czujniki parkowania przednie\"),\n" +
//                "    REAR_PARKING_SENSORS(\"Czujniki parkowania tylne\"),\n" +
//                "    PANORAMIC_SUNROOF(\"Dach panoramiczny\"),\n" +
//                "    ELECTROCHROMATIC_SIDE_VIEW_MIRRORS(\"Elektrochromatyczne lusterka boczne\"),\n" +
//                "    ELECTROCHROMATIC_REAR_VIEW_MIRROR(\"Elektrochromatyczne lusterko wsteczne\"),\n" +
//                "    ELECTRIC_REAR_WINDOWS(\"Elektryczne szyby tylne\"),\n" +
//                "    ELECTRICALLY_ADJUSTABLE_SEATS(\"Elektrycznie ustawiane fotele\"),\n" +
//                "    ESP(\"ESP (stabilizacja toru jazdy)\"),\n" +
//                "    AUX_SOCKET(\"Gniazdo AUX\"),\n" +
//                "    SD_CARD_CONNECTOR(\"Gniazdo SD\"),\n" +
//                "    USB_SOCKET(\"Gniazdo USB\"),\n" +
//                "    HOOK(\"Hak\"),\n" +
//                "    HUD(\"HUD (wyświetlacz przezierny)\"),\n" +
//                "    ISOFIX(\"Isofix\"),\n" +
//                "    REAR_VIEW_CAMERA(\"Kamera cofania\"),\n" +
//                "    AUTOMATIC_AIR_CONDITIONING(\"Klimatyzacja automatyczna\"),\n" +
//                "    FOUR_ZONE_AIR_CONDITIONING(\"Klimatyzacja czterostrefowa\"),\n" +
//                "    DUAL_ZONE_AIR_CONDITIONING(\"Klimatyzacja dwustrefowa\"),\n" +
//                "    MANUAL_AIR_CONDITIONING(\"Klimatyzacja manualna\"),\n" +
//                "    ON_BOARD_COMPUTER(\"Komputer pokładowy\"),\n" +
//                "    AIR_CURTAINS(\"Kurtyny powietrzne\"),\n" +
//                "    PADDLE_SHIFTERS(\"Łopatki zmiany biegów\"),\n" +
//                "    MP3(\"MP3\"),\n" +
//                "    GPS_NAVIGATION(\"Nawigacja GPS\"),\n" +
//                "    DVD_PLAYER(\"Odtwarzacz DVD\"),\n" +
//                "    SPEED_LIMITER(\"Ogranicznik prędkości\"),\n" +
//                "    PARKING_HEATER(\"Ogrzewanie postojowe\"),\n" +
//                "    HEATED_WINDSCREEN(\"Podgrzewana przednia szyba\"),\n" +
//                "    HEATED_SIDE_MIRRORS(\"Podgrzewane lusterka boczne\"),\n" +
//                "    HEATED_FRONT_SEATS(\"Podgrzewane przednie siedzenia\"),\n" +
//                "    HEATED_REAR_SEATS(\"Podgrzewane tylne siedzenia\"),\n" +
//                "    KNEE_PROTECTING_AIRBAG(\"Poduszka powietrzna chroniąca kolana\"),\n" +
//                "    FRONT_SIDE_AIRBAGS(\"Poduszki boczne przednie\"),\n" +
//                "    REAR_SIDE_AIRBAGS(\"Poduszki boczne tylne\"),\n" +
//                "    TINTED_WINDOWS(\"Przyciemniane szyby\"),\n" +
//                "    NON_FACTORY_RADIO(\"Radio niefabryczne\"),\n" +
//                "    ADJUSTABLE_SUSPENSION(\"Regulowane zawieszenie\"),\n" +
//                "    ROOF_RAILS(\"Relingi dachowe\"),\n" +
//                "    START_STOP_SYSTEM(\"System Start-Stop\"),\n" +
//                "    SUNROOF(\"Szyberdach\"),\n" +
//                "    DAYTIME_RUNNING_LIGHTS(\"Światła do jazdy dziennej\"),\n" +
//                "    LED_LIGHTS(\"Światła LED\"),\n" +
//                "    FOG_LIGHTS(\"Światła przeciwmgielne\"),\n" +
//                "    XENON_LIGHTS(\"Światła xenonowe\"),\n" +
//                "    LEATHER_UPHOLSTERY(\"Tapicerka skórzana\"),\n" +
//                "    VELOUR_UPHOLSTERY(\"Tapicerka welurowa\"),\n" +
//                "    CRUISE_CONTROL(\"Tempomat\"),\n" +
//                "    ACTIVE_CRUISE_CONTROL(\"Tempomat aktywny\"),\n" +
//                "    TV_TUNER(\"Tuner TV\"),\n" +
//                "    MULTI_FUNCTION_STEERING_WHEEL(\"Wielofunkcyjna kierownica\"),\n" +
//                "    CD_CHANGER(\"Zmieniarka CD\"),";
//
//        String[] columnNames = line.split("\n");
//
//        for (String colmnName : columnNames) {
//            String name = colmnName.trim()
//                    .split("\\(")[0]
//                    .toLowerCase();
//            while (name.contains("_")) {
//                char[] chars = name.toCharArray();
//                int index = name.indexOf("_");
//                chars[index+1] = Character.toUpperCase(chars[index+1]);
//                chars[index] = ' ';
//                name = String.valueOf(chars);
//            }
//            name = name.replace(" ", "");
//            writer.println("@Column");
//            writer.println("private String " + name +";");
//        }
//
//        writer.close();
//    }
//}
