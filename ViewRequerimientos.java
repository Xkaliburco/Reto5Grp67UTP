package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;

// import co.edu.utp.misiontic2022.c2.ControladorRequerimientos;
// import co.edu.utp.misiontic2022.c2.Requerimiento_1;
// import co.edu.utp.misiontic2022.c2.Requerimiento_2;
// import co.edu.utp.misiontic2022.c2.Requerimiento_3;


public class ViewRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        
        try {
            ArrayList<Requerimiento_1> ALRequirement1;

            ALRequirement1 = controlador.consultaRequerimiento1();

            for (Requerimiento_1 MyRequest1 : ALRequirement1) {
                //System.out.println(MyRequest.toString());

                // Esto se comenta para ver cambio a GUI
                System.out.println(
                        MyRequest1.getBuyDate() + " " + MyRequest1.getBuyCode() + " "
                        + MyRequest1.getSupplierName() + " " + MyRequest1.getPaid()
                );
                //
                //return MyRequest1.getBuyDate(),MyRequest1.getBuyCode(),MyRequest1.getSupplierName(),MyRequest1.getPaid();
                //return MyRequest1.getBuyDate()
            }
        } catch (Exception Bad) {
            System.err.println(Bad);

        
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> ALRequest2;

            ALRequest2 = controlador.consultaRequerimiento2();

            for (Requerimiento_2 MyRequest2 : ALRequest2) {
                System.out.println(
                        MyRequest2.getInitDate() + " "  + MyRequest2.getCity() + " "
                        + MyRequest2.getBuilder() + " " + MyRequest2.getLeader() + " "
                        + MyRequest2.getTypeCode() + " " + MyRequest2.getBuildStratum()
                );
            }

        } catch (Exception Bad) {
            System.err.println(Bad);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> ALRequest3;

            ALRequest3 = controlador.consultaRequerimiento3();

            for (Requerimiento_3 MyRequest3 : ALRequest3) {
                System.out.println(
                    MyRequest3.getAbreviate()
                );
            }

        } catch (Exception Bad) {
            System.err.println(Bad);
        }
    }
    
}

