package gradlep.modelo;

public class DetalleOrden {
    private int codigoProducto; // Solo necesitamos el ID del producto
    private double precioVenta;  // Precio al momento de la venta
    private int cantidad;
    private Producto producto; // Para cuando necesitemos cargar el producto completo

    public DetalleOrden() {} // Constructor vacío para Jackson

    public DetalleOrden(int codigoProducto, double precioVenta, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
    }

    public DetalleOrden(Producto producto, int cantidad) {
        this.producto = producto;
        this.codigoProducto = producto.getId();
        this.precioVenta = producto.getPrecioActual();
        this.cantidad = cantidad;
    }

    public int getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(int codigoProducto) { this.codigoProducto = codigoProducto; }
    
    public double getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }
    
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    
    public double getSubtotal() { 
        return precioVenta * cantidad; 
    }
}