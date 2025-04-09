package pe.edu.ulima.demeter;

public class Empresa {
    private Sucursal sucursal;

    public Empresa(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void mostrarEmpleados() {
        
        for ( Empleado emp : sucursal.getEmpleados() ) {
            System.out.println( emp );
        }
    }
}
