package com.analiasavino.ConversorDeDivisas.funciones;

import com.analiasavino.ConversorDeDivisas.modelos.Conversion;
import com.analiasavino.ConversorDeDivisas.modelos.ExchangeRate;
import com.analiasavino.ConversorDeDivisas.requestApi.ObtenerDatos;

import com.google.gson.Gson;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.Integer.valueOf;


public class MetodosyFunciones {

//Metodo calcular.

  public double calcular(Conversion conversion) {
    double montoConvertido = conversion.getIndiceConversion() * conversion.getMontoAConvertir();
    return montoConvertido;
  }

  //Solicitamos al usuario que ingrese el monto utilizado.

  public double ingresarMonto(Scanner scanner) {
    System.out.println("\n" + "Por favor elija el monto que desea convertir" + "\n");
    var montoAConvertir = scanner.nextDouble();
    return montoAConvertir;
  }

  // guardamos en la variable pedido el pedido.

  public ExchangeRate pedioAAPI(String monedaDeOrigen, String monedaFinal, Double montoAConvertir) {

    String pedido = "https://v6.exchangerate-api.com/v6/80d3bfe6b7c853fa523d3d84/pair/" + monedaDeOrigen.toUpperCase() + "/" +
          monedaFinal.toUpperCase() + "/" + montoAConvertir;

    ObtenerDatos obtenerDatos = new ObtenerDatos();

    String json = obtenerDatos.obtenerDatos(pedido);

    if (json.contains("unsupported-code")) {
        System.out.println("Por favor vuelva a ingresar los codigos de las monedas, alguno o ambos \n" +
              "es o son incorrectos.");

      }

      Gson gson = new Gson();
      ExchangeRate exchangeRate = gson.fromJson(json, ExchangeRate.class);

    return exchangeRate;
  }


  public Conversion realizaConversion(ExchangeRate exchangeRate, double montoAConvertir, String monedaDeOrigen, String monedaFinal) {
    Conversion conversion = new Conversion(exchangeRate, montoAConvertir);

    // ahora debo agregar al atributo montoConvertido lo retornado por el metodo calculo

    LocalDate fecha = LocalDate.now();


    double montoConvertido = calcular(conversion);

    conversion.setMontoAConvertir(montoAConvertir);
    conversion.setMonedaDeOrigen(monedaDeOrigen);
    conversion.setMontoConvertido(montoConvertido);
    conversion.setMonedaFinal(monedaFinal);
    conversion.setIndiceConversion(conversion.getIndiceConversion());
    //conversion.setFecha(exchangeRate.time_last_update_utc());
    conversion.setFecha(String.valueOf(fecha));

    System.out.println("\n" + conversion);
    System.out.println("*************************");
    return conversion;
  }
}







