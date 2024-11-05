/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.de.diseño.factoryMethod;

/**
 *
 * @author YANDI
 */
public class Principal {
    public static void main(String[] args) {
        var contratoFactory= new ContratoFactory();
        var contratoFiljo=contratoFactory.crearContrato(TipoContrato.FIJO);
        var contratoTemporal=contratoFactory.crearContrato(TipoContrato.TEMPORAL);
        var contratoFactura=contratoFactory.crearContrato(TipoContrato.FACTURA);
        var contratoEnLinea=contratoFactory.crearContrato(TipoContrato.ENLINEA);
        
        System.out.println("EL SALARIO DEL CONTRATO FIJO ES: "+contratoFiljo.CalcularSueldo());
        System.out.println("EL SALARIO DEL CONTRATO TEMPORAL ES: "+contratoTemporal.CalcularSueldo());
        System.out.println("EL SALARIO DEL CONTRATO POR FACTURA ES: "+contratoFactura.CalcularSueldo());
        System.out.println("EL SALARIO DEL CONTRATO EN LINEA ES: "+contratoEnLinea.CalcularSueldo());
        
    }
    
}
