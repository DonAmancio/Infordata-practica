import pojos.*;

import java.util.Calendar;

public class Main {

    private static Object Reseteable;

    public static void main(String[] args) {


        System.out.println("*****INFORDATA*****");

        //set producto

        Producto producto = new Producto( "TC542" , "TECLADO GAMER");

        System.out.println(producto);

        System.out.println("\n");

        //set servicio de alquiler

        Alquilar alquilar = new Alquilar("DF32S" , "MONITOR 32'' " , 10.4);

        System.out.println(alquilar);

        System.out.println("\n");

        //set empresa

        Empresa empresa = new Empresa("IMPORTADORA SUAREZ" , "AV IRALÁ" , 300  );

        System.out.println(empresa);

        System.out.println("\n");

        //set productos

        Tecnologico tecnologico =  new Tecnologico("PD12S" , "SSD SEAGATE" , "USA", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);

        System.out.println("\n");

        //set monitor

        Monitor monitor = new Monitor("SG8452" , "DELL 27 pulgadas" , 16.8 , "1980x1080 ", null);

        System.out.println(monitor);

        System.out.println("\n");

        //set cpu

        Empresa PCFALCON = new Empresa("PCFALCON" , "AV SANTACRUZ #234" , 3000 );

        Cpu cpu = new Cpu("CPU23232K" , "INTEL" , " JAPON " , Calendar.getInstance().getTime() , PCFALCON , 32, null);

        System.out.println(cpu);

        System.out.println("\n");

        //reset value

        System.out.println("RESET");

        Reseteable reseteable = new Reseteable("0" , "TODOS LOS ANTERIORES" , 20 , null);

        System.out.println(Reseteable);



    }


}
