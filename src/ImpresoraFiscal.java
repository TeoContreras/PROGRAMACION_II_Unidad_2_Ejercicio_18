public class ImpresoraFiscal {
    public void imprimirDocumento(Factura factura) {
        System.out.println("========== TICKET ==========");
        System.out.println("Factura N°: " + factura.getNumero());
        System.out.println("Cliente: " + factura.getCliente());
        for (ItemFactura item : factura.getItems()) {
            System.out.println(item.getDescripcion() + " x" + item.getCantidad()
                    + " - $" + item.calcularSubtotal());
        }
        System.out.println("TOTAL: $" + factura.calcularTotal());
        System.out.println("============================");
    }
}
