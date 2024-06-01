package com.analiasavino.ConversorDeDivisas.modelos;

import java.awt.*;

public class Menues {

  //Defino las variables.

  private  String menuHabituales = """
                A continuacion se facilita un menun con 6 conversiones habituales, si necesita otra utilice la opcion 7.
                             
                1 Dolar Americano   USD ==> Peso Argentino  ARS
                2 Peso Argentino    ARS ==> Dolar Americano USD
                3 Dolar Americano   USD ==> Real Brasileno  BRL
                4 Real Brasileno    BRL ==> Dolar Americano USD
                5 Dolar Americano   USD ==> Peso Colombinao COP
                6 Peso Colombiano   COP ==> Dolar Americano USD 
                7 Otras conversiones. 
                8 Historial de conversiones.
                9 Para salir.
                """;

  private String menulibreEleccion = """
                Trabajamos con 161 monedas comúnmente circulantes, las cuales se enumeran a continuación.
                Estas cubren el 99% de todos los estados y territorios reconocidos por la ONU.

                    Código
                de Moneda | Nombre de la Moneda                  | País
                    --------- | ------------------------------------ | -----------------------
                    AED       | Dirham de los Emiratos Árabes Unidos | Emiratos Árabes Unidos
                    AFN       | Afghani Afgano                       | Afganistán
                    ALL       | Lek Albanés                          | Albania
                    AMD       | Dram Armenio                         | Armenia
                    ANG       | Florín de las Antillas Neerlandesas  | Antillas Neerlandesas
                    AOA       | Kwanza Angoleño                      | Angola
                    ARS       | Peso Argentino                       | Argentina
                    AUD       | Dólar Australiano                    | Australia
                    AWG       | Florín Arubeño                       | Aruba
                    AZN       | Manat Azerbaiyano                    | Azerbaiyán
                    BAM       | Marco de Bosnia y Herzegovina        | Bosnia y Herzegovina
                    BBD       | Dólar de Barbados                    | Barbados
                    BDT       | Taka Bangladesí                      | Bangladesh
                    BGN       | Lev Búlgaro                          | Bulgaria
                    BHD       | Dinar Bahreiní                       | Baréin
                    BIF       | Franco Burundés                      | Burundi
                    BMD       | Dólar Bermudeño                      | Bermudas
                    BND       | Dólar de Brunéi                      | Brunéi
                    BOB       | Boliviano Boliviano                  | Bolivia
                    BRL       | Real Brasileño                       | Brasil
                    BSD       | Dólar Bahameño                       | Bahamas
                    BTN       | Ngultrum Butanés                     | Bután
                    BWP       | Pula Botsuano                        | Botsuana
                    BYN       | Rublo Bielorruso                     | Bielorrusia
                    BZD       | Dólar Beliceño                       | Belice
                    CAD       | Dólar Canadiense                     | Canadá
                    CDF       | Franco Congoleño                     | República Democrática del Congo
                    CHF       | Franco Suizo                         | Suiza
                    CLP       | Peso Chileno                         | Chile
                    CNY       | Renminbi Chino                       | China
                    COP       | Peso Colombiano                      | Colombia
                    CRC       | Colón Costarricense                  | Costa Rica
                    CUP       | Peso Cubano                          | Cuba
                    CVE       | Escudo Caboverdiano                  | Cabo Verde
                    CZK       | Corona Checa                         | República Checa
                    DJF       | Franco Yibutiano                     | Yibuti
                    DKK       | Corona Danesa                        | Dinamarca
                    DOP       | Peso Dominicano                      | República Dominicana
                    DZD       | Dinar Argelino                       | Argelia
                    EGP       | Libra Egipcia                        | Egipto
                    ERN       | Nakfa Eritreo                        | Eritrea
                    ETB       | Birr Etíope                          | Etiopía
                    EUR       | Euro                                 | Unión Europea
                    FJD       | Dólar Fiyiano                        | Fiyi
                    FKP       | Libra de las Islas Malvinas          | Islas Malvinas
                    FOK       | Króna Feroesa                        | Islas Feroe
                    GBP       | Libra Esterlina                      | Reino Unido
                    GEL       | Lari Georgiano                       | Georgia
                    GGP       | Libra de Guernsey                    | Guernsey
                    GHS       | Cedi Ganés                           | Ghana
                    GIP       | Libra de Gibraltar                   | Gibraltar
                    GMD       | Dalasi Gambiano                      | Gambia
                    GNF       | Franco Guineano                      | Guinea
                    GTQ       | Quetzal Guatemalteco                 | Guatemala
                    GYD       | Dólar Guyanés                        | Guyana
                    HKD       | Dólar de Hong Kong                   | Hong Kong
                    HNL       | Lempira Hondureño                    | Honduras
                    HRK       | Kuna Croata                          | Croacia
                    HTG       | Gourde Haitiano                      | Haití
                    HUF       | Forinto Húngaro                      | Hungría
                    IDR       | Rupia Indonesia                      | Indonesia
                    ILS       | Nuevo Shekel Israelí                 | Israel
                    IMP       | Libra de la Isla de Man              | Isla de Man
                    INR       | Rupia India                          | India
                    IQD       | Dinar Iraquí                         | Irak
                    IRR       | Rial Iraní                           | Irán
                    ISK       | Króna Islandesa                      | Islandia
                    JEP       | Libra de Jersey                      | Jersey
                    JMD       | Dólar Jamaicano                      | Jamaica
                    JOD       | Dinar Jordano                        | Jordania
                    JPY       | Yen Japonés                          | Japón
                    KES       | Chelín Keniano                       | Kenia
                    KGS       | Som Kirguís                          | Kirguistán
                    KHR       | Riel Camboyano                       | Camboya
                    KID       | Dólar Kiribatiano                    | Kiribati
                    KMF       | Franco Comorense                     | Comoras
                    KRW       | Won Surcoreano                       | Corea del Sur
                    KWD       | Dinar Kuwaití                        | Kuwait
                    KYD       | Dólar de las Islas Caimán            | Islas Caimán
                    KZT       | Tenge Kazajo                         | Kazajistán
                    LAK       | Kip Laosiano                         | Laos
                    LBP       | Libra Libanesa                       | Líbano
                    LKR       | Rupia de Sri Lanka                   | Sri Lanka
                    LRD       | Dólar Liberiano                      | Liberia
                    LSL       | Loti Lesotense                       | Lesoto
                    LYD       | Dinar Libio                          | Libia
                    MAD       | Dirham Marroquí                      | Marruecos
                    MDL       | Leu Moldavo                          | Moldavia
                    MGA       | Ariary Malgache                      | Madagascar
                    MKD       | Denar Macedonio                      | Macedonia del Norte
                    MMK       | Kyat Birmano                         | Myanmar
                    MNT       | Tugrik Mongol                        | Mongolia
                    MOP       | Pataca de Macao                      | Macao
                    MRU       | Ouguiya Mauritano                    | Mauritania
                    MUR       | Rupia Mauriciana                     | Mauricio
                    MVR       | Rufiyaa de Maldivas                  | Maldivas
                    MWK       | Kwacha Malauí                        | Malaui
                    MXN       | Peso Mexicano                        | México
                    MYR       | Ringgit Malayo                       | Malasia
                    MZN       | Metical Mozambiqueño                 | Mozambique
                    NAD       | Dólar de Namibia                     | Namibia
                    NGN       | Naira Nigeriano                      | Nigeria
                    NIO       | Córdoba Nicaragüense                 | Nicaragua
                    NOK       | Corona Noruega                       | Noruega
                    NPR       | Rupia Nepalí                         | Nepal
                    NZD       | Dólar Neozelandés                    | Nueva Zelanda
                    OMR       | Rial Omaní                           | Omán
                    PAB       | Balboa Panameño                      | Panamá
                    PEN       | Sol Peruano                          | Perú
                    PGK       | Kina de Papúa Nueva Guinea           | Papúa Nueva Guinea
                    PHP       | Peso Filipino                        | Filipinas
                    PKR       | Rupia Pakistaní                      | Pakistán
                    PLN       | Złoty Polaco                         | Polonia
                    PYG       | Guaraní Paraguayo                    | Paraguay
                    QAR       | Riyal Catarí                         | Catar
                    RON       | Leu Rumano                           | Rumanía
                    RSD       | Dinar Serbio                         | Serbia
                    RUB       | Rublo Ruso                           | Rusia""";


  // genero los metodos get de mis variables para poder acceder a ellas desde la clase principal.

  public String getMenuHabituales() {
    return menuHabituales;
  }

  public String getMenulibreEleccion() {
    return menulibreEleccion;
  }
}



