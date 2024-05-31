package com.analiasavino.ConversorDeDivisas.modelos;

//Esta clase tiene por finalidad hacer el paso de JSON a String
public record ExchangeRate( String base_code, String target_code, double conversion_rate, double conversion_result,
                            String time_last_update_utc) {


}
