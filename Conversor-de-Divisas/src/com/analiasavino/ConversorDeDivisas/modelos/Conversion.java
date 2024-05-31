package com.analiasavino.ConversorDeDivisas.modelos;

  public class Conversion {
    //declaro atributos de la clase.
    private String monedaDeOrigen;
    private String monedaFinal;
    private double indiceConversion;
    private double montoAConvertir;
    private double resultadoConversion;
    private double montoConvertido;
    private String fecha;


    //creo un objeto a traves de un constructor.


    public Conversion(ExchangeRate exchangeRate, double montoAConvertir) {

      this.monedaDeOrigen = exchangeRate.base_code();
      this.monedaFinal = exchangeRate.target_code();
      this.indiceConversion = exchangeRate.conversion_rate();
      this.montoAConvertir = montoAConvertir;
      this.resultadoConversion = exchangeRate.conversion_result();
      this.fecha = exchangeRate.time_last_update_utc();
    }

    public Conversion(ExchangeRate exchangeRate) {
    }
    //metodos get and setter


    public void setMonedaDeOrigen(String monedaDeOrigen) {
      this.monedaDeOrigen = monedaDeOrigen;
    }

    public String getMonedaDeOrigen() {
      return monedaDeOrigen;
    }

    public void setMonedaFinal(String monedaFinal) {
      this.monedaFinal = monedaFinal;
    }

    public String getMonedaFinal() {
      return monedaFinal;
    }

    public void setMontoAConvertir(double montoAConvertir) {
      this.montoAConvertir = montoAConvertir;
    }

    public double getMontoAConvertir() {
      return montoAConvertir;
    }

    public void setIndiceConversion(double indiceConversion) {
      this.indiceConversion = indiceConversion;
    }

    public double getIndiceConversion() {
      return indiceConversion;
    }

    public void setMontoConvertido(double montoConvertido) {
      this.montoConvertido = montoConvertido;
    }

    public double getMontoConvertido() {
      return montoConvertido;
    }

    public void setResultadoConversion(double resultadoConversion) {
      this.resultadoConversion = resultadoConversion;
    }

    public double getResultadoConversion() {
      return resultadoConversion;
    }

    public void setFecha(String fecha) {
      this.fecha = fecha;
    }

    public String getFecha() {
      return fecha;
    }


    @Override
    public String toString() {
      return getFecha() + " " + montoAConvertir + " " + monedaDeOrigen + " equivale/n a: " + montoConvertido + (" ") + monedaFinal + "\n";
    }
  }

