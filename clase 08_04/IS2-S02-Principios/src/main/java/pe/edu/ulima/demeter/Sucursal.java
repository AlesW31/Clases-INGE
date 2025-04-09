package pe.edu.ulima.demeter;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    List<Empleado> empleados;
            
    public Sucursal() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado( Empleado emp) {
        empleados.add( emp );
    }
    
    public List<Empleado>
         getEmpleados() {
        return empleados;
    }

    
    
}
