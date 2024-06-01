package com.analiasavino.ConversorDeDivisas.principal;

import com.analiasavino.ConversorDeDivisas.historial.Historial;
import com.analiasavino.ConversorDeDivisas.modelos.Conversion;
import com.analiasavino.ConversorDeDivisas.modelos.ExchangeRate;
import com.analiasavino.ConversorDeDivisas.requestApi.ObtenerDatos;
import com.analiasavino.ConversorDeDivisas.modelos.Menues;
import com.analiasavino.ConversorDeDivisas.funciones.MetodosyFunciones;


import com.google.gson.Gson;

//importo las librerias java que necesito en funcion de lo que voy haciendo

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Historial historial = new Historial();


    public static void main(String[] args) throws IOException, InterruptedException {

      //Declaro parametros de esta clase
      Scanner scanner = new Scanner(System.in);
      Menues menu1 = new Menues();
      MetodosyFunciones metodosyFunciones = new MetodosyFunciones();

      //Menu de bienvenida

      System.out.println("\n" +"***************************************");
      System.out.println("Bienvenido a nuestro conversor de monedas");
      System.out.println("***************************************" + '\n');
      String monedaDeOrigen = "";
      String monedaFinal = "";

      while (true) {
        System.out.println("Por favor elija la opcion deseada: ");
        System.out.println(menu1.getMenuHabituales());

        var opcion = scanner.nextInt();

        if(opcion == 9)
          break;
        switch (opcion) {
          case 1:
            monedaDeOrigen = "USD";
            monedaFinal = "ARS";

            double montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            ExchangeRate exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            Conversion conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);
            break;

          case 2:
            monedaDeOrigen = "ARS";
            monedaFinal = "USD";

            montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);
            break;

          case 3:
            monedaDeOrigen = "USD";
            monedaFinal = "BRL";
            montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);
            break;
          case 4:
            monedaDeOrigen = "BRL";
            monedaFinal = "USD";
            montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);
            break;
          case 5:
            monedaDeOrigen = "USD";
            monedaFinal = "COP";
            montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);
            break;
          case 6:
            monedaDeOrigen = "COP";
            monedaFinal = "USD";
            montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);
            break;
          case 7:
            System.out.println(menu1.getMenulibreEleccion());
            System.out.println("\n" + "Por favor ingrese tal y como figura en el listado el codigo de \nla moneda desde la que desea convertir." +"\n");
            monedaDeOrigen = scanner.next();
            System.out.println("\n" + "Por favor ingrese tal y como figura en el listado el codigo de \nla moneda a la que desea convertir." +"\n");
            monedaFinal = scanner.next();
            montoAConvertir = metodosyFunciones.ingresarMonto(scanner);
            exchangeRate = metodosyFunciones.pedioAAPI(monedaDeOrigen, monedaFinal, montoAConvertir);
            conversion = metodosyFunciones.realizaConversion(exchangeRate, montoAConvertir, monedaDeOrigen, monedaFinal);
            historial.addHistorialConversion(conversion);

            break;
          case 8:
            System.out.println("Este es el historial de conversiones realizadas hasta el momento: \n ");
            historial.getHistorialConversion().stream()
                  .forEach(System.out::println);
            System.out.println("********************************************************************** \n");

            break;
        }

      }

    }

  }



