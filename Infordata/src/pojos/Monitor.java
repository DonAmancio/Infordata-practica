package pojos;

public class Monitor extends Alquilar{

    private String resolucionMaxima;

    private Void Reseteable;

    public Monitor(String codigo , String modelo , double precioHora , String resolucionMaxima , Void reseteable){

        super(codigo, modelo , precioHora);


        this.setResolucionMaxima(resolucionMaxima);

    }
    public String getResolucionMaxima() {

        return resolucionMaxima;

    }
    public void setResolucionMaxima(String resolucionMaxima) {

        this.resolucionMaxima = resolucionMaxima;

    }
    @Override
    public String toString() {
        return "Monitor{" +
                "\nresolucion Maxima: " + resolucionMaxima + '\'' +

                ", \nReseteable: " + Reseteable +

                ", \nprecio por Hora: " + precioHora +

                ",= \ncodigo: " + getCodigo() + '\'' +

                ",= \nmodelo: " + getModelo() + '\'' +

                '}';
    }
}
