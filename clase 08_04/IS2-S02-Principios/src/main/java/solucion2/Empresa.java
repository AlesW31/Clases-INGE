package solucion2;

public class Empresa {
    private Sucursal sucursal;

    public Empresa(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void mostrarEmpleados() {
        
        for ( String nombre : sucursal.getNombresEmpleados() ) {
            System.out.println( nombre );
        }
    }
}
