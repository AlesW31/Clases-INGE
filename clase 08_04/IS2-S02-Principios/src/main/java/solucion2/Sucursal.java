package solucion2;

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
    
    public List<String> getNombresEmpleados(){
        List<String> rpta = new ArrayList<>();
        for (Empleado emp: empleados){
            rpta.add(emp.getNombre());
        }
        return rpta;
    }
    public List<Empleado>
         getEmpleados() {
        return empleados;
    }

    
    
}
