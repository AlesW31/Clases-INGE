package solucion2;

public class Test {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", "E1");
        Empleado e2 = new Empleado("Jose", "E2");
        Empleado e3 = new Empleado("Jorge", "E3");
        
        Sucursal s = new Sucursal();
        s.agregarEmpleado(e1);
        s.agregarEmpleado(e2);
        s.agregarEmpleado(e3);
        
        Empresa empresa = new Empresa(s);
        empresa.mostrarEmpleados();
        
        
    }
    
}
