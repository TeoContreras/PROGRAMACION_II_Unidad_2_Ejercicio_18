public class main {
    public static void main(String[] args) {
        ImpresoraFiscal impresora = new ImpresoraFiscal();
        CajaRegistradora caja = new CajaRegistradora(impresora);
        Factura factura = new Factura(1001, "Marcos");

        factura.agregarItem(new ItemFactura("Hamburguesa", 2, 5000));
        factura.agregarItem(new ItemFactura("Gaseosa", 2, 1500));
        factura.agregarItem(new ItemFactura("Papas", 1, 2500));

        caja.cerrarVenta(factura);
    }
}
