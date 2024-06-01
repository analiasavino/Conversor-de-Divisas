package com.analiasavino.ConversorDeDivisas.historial;

//importo las clases
import com.analiasavino.ConversorDeDivisas.modelos.Conversion;

import java.util.ArrayList;
import java.util.List;

  public class Historial {

    //creo la variable a nivel global de clase. (cuando la clase principal se ejecute se va crear un elemnto list vacio)

    private List<Conversion> historialConversion = new ArrayList<>();

    //creo un metodo que agrega a la lista creada las conversiones

    public void addHistorialConversion(Conversion conversion) {
      historialConversion.add(conversion);
      return;

    }

    //creo un metodo que retorna la lista de conversiones.

    public List<Conversion> getHistorialConversion() {

      return historialConversion;

    }

  }