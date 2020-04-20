/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author bragh
 */
public class edificios extends construccion implements BaseDeTerreno, Edificio{
    private Double area, alt, perTerreno, disTerreno, base;
    
    public edificios(double area, double alt, double perTerreno, double disTerreno, double base, String tipEdificio, String cliente, String arqui, int pisos){
        super(tipEdificio, cliente, arqui, pisos);
        this.area = area;
        this.alt = alt;
        this.perTerreno = perTerreno;
        this.disTerreno = disTerreno;
    }

    edificios(double calArea, double calAlt, double calPer, double calDis, String toString, int parseInt, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String FecFinalizacion() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(fecha);
    }

    @Override
    public  double calPer(double a, double b, double c, double d) {
       return (a*b) + (b*c) + (c*d) + (d*a);
    }

    @Override
    public  double calDis( double esc) {
      return Math.round(((esc * 10) * 100)/100);
    }

    @Override
    public  double calAlt(double a, double b) {
       return Math.round(((a/b) * 100)/100);
    }

    @Override
    public  double calArea(double b, double A) {
        return Math.round(((b*A) * 100)/100);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPerTerreno() {
        return perTerreno;
    }

    public void setPerTerreno(double perTerreno) {
        this.perTerreno = perTerreno;
    }

    public double getDisTerreno() {
        return disTerreno;
    }

    public void setDisTerreno(double disTerreno) {
        this.disTerreno = disTerreno;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
