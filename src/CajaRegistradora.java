public class CajaRegistradora {
    private ImpresoraFiscal impresora;

    public CajaRegistradora(ImpresoraFiscal impresora) { this.impresora = impresora; }

    public void cerrarVenta(Factura factura) {
        System.out.println("La caja envía la factura a la impresora.");
        impresora.imprimirDocumento(factura);
    }
}
