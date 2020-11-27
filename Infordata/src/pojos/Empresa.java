package pojos;

public class Empresa {

    private String nombre;

    private String direccion;

    private int numero_Empleados;


    public Empresa(String nombre, String direccion, int numero_Empleados) {

        this.setNombre(nombre);

        this.setDireccion(direccion);

        this.setNumero_Empleados(numero_Empleados);

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getDireccion() {

        return direccion;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public int getNumero_Empleados() {

        return numero_Empleados;

    }

    public void setNumero_Empleados(int numero_Empleados) {

        this.numero_Empleados = numero_Empleados;

    }

    @Override
    public String toString() {

        return "Empresa: " +

            "\nnombre: " + nombre + '\'' +

            ", \ndireccion: " + direccion + '\'' +

            ", \nnumero de empleados: " + numero_Empleados +

            '.';
    }
}
