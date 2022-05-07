public class Main {


    public static void main(String[] args){
        respuesta(-3);
        bucleWhile( 0);
        bucleDoWhile(0);
        bucleFor(0);
        bucleSwitch(14);
    }
    public static void respuesta (int numeroIf){

        if (numeroIf == 0) {
            System.out.println( "El valor ingresado es '0'");
        }
        if (numeroIf > 0) {
            System.out.println( "El valor ingresado es 'positivo'");
        }
        if (numeroIf < 0) {
            System.out.println( "El valor ingresado es 'negativo'");
        }
    }

    public static void bucleWhile (int numeroWhile) {

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Veces ejecutado el bucleWhile: " + numeroWhile);
        }
    }

    public static void bucleDoWhile(int numDoWhile) {

        do {
            System.out.println("Me ejecuté una sola vez");
        } while (numDoWhile < 0);
}

    public static void bucleFor(int numeroFor) {

        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Veces recorrido el bucleFor: " + numeroFor);
        }
}

    public static void bucleSwitch (int numeroMes ) {

        String estacion = "", mes ="";

        switch (numeroMes)
        {
            case 1:
                mes = "Enero";
            case 2:
                mes = "Febrero";
            case 3:
                mes = "Marzo";
                estacion = "Verano";
                System.out.println("Está en el mes de: " + mes +". " + "Feliz " + estacion + "!");
                break;
            case 4:
                mes = "Abril";
            case 5:
                mes = "Mayo";
            case 6:
                mes = "Junio";
                estacion = "Otoño";
                System.out.println("Está en el mes de: " + mes +". " + "Feliz " + estacion + "!");
                break;
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
            case 9:
                mes = "Septiembre";
                estacion = "Invierno";
                System.out.println("Está en el mes de: " + mes +". " + "Feliz " + estacion + "!");
                break;
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
            case 12:
                mes = "Diciembre";
                estacion = "Primavera";
                System.out.println("Está en el mes de: " + mes +". " + "Feliz " + estacion + "!");
                break;
            default:
                System.out.println("Ingrese un número de mes válido");
        }

    }


}
