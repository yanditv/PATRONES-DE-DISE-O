/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.de.diseño.factoryMethod;

/**
 *
 * @author YANDI
 */
public class ContratoFactory extends IContratoFactoryMethod {

    @Override
    public Contrato crearContrato(TipoContrato tipo) {
        switch(tipo){
            case FIJO:
                return new ContratoFijo();
            case TEMPORAL:
                return new ContratoTemporal();
            case FACTURA:
                return new ContratoFactura();
            case ENLINEA:
                return new ContratoEnLinea();
        }
        return null;
    }
    
}
