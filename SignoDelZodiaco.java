import java.util.Scanner;

public class SignoDelZodiaco {
    public static void main(String[] args) {
        System.out.println("*** Averigua que signo eres ***");
        var consola = new Scanner(System.in);

        //Ingreso de datos
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa el día de tu nacimiento (0-31): ");
        var diaNacimiento = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el mes de tu nacimiento (1-12): ");
        var mesNacimiento = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el año de tu nacimiento: ");
        var anioNacimiento = Integer.parseInt(consola.nextLine());

        //validar dia del mes
        if (diaNacimiento >= 1 && diaNacimiento <= 31) {
        } else {
            System.out.println("Día de nacimiento errado");
            System.exit(0); // Detiene la ejecución si el día es inválido
        }

        //Validar mes del año
        var mes = switch(mesNacimiento){
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Setiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Valor el mes ingresado es errado";
        };

        //validar a que signo perteneces
        var signo = "";
        if((mesNacimiento == 3 && diaNacimiento >= 21) || (mesNacimiento == 4 && diaNacimiento <= 19)){
            signo = "Aries";
        } else if ((mesNacimiento == 4 && diaNacimiento >= 20) || (mesNacimiento == 5 && diaNacimiento <= 20)) {
            signo = "Tauro";
        } else if ((mesNacimiento == 5 && diaNacimiento >= 21) || (mesNacimiento == 6 && diaNacimiento <= 20)) {
            signo = "Géminis";
        } else if ((mesNacimiento == 6 && diaNacimiento >= 21) || (mesNacimiento == 7 && diaNacimiento <= 22)) {
            signo = "Cáncer";
        } else if ((mesNacimiento == 7 && diaNacimiento >= 23) || (mesNacimiento == 8 && diaNacimiento <= 22)) {
            signo = "Leo";
        } else if ((mesNacimiento == 8 && diaNacimiento >= 23) || (mesNacimiento == 9 && diaNacimiento <= 22)) {
            signo = "Virgo";
        } else if ((mesNacimiento == 9 && diaNacimiento >= 23) || (mesNacimiento == 10 && diaNacimiento <= 22)) {
            signo = "Libra";
        } else if ((mesNacimiento == 10 && diaNacimiento >= 23) || (mesNacimiento == 11 && diaNacimiento <= 21)) {
            signo = "Escorpio";
        } else if ((mesNacimiento == 11 && diaNacimiento >= 22) || (mesNacimiento == 12 && diaNacimiento <= 21)) {
            signo = "Sagitario";
        } else if ((mesNacimiento == 12 && diaNacimiento >= 22) || (mesNacimiento == 1 && diaNacimiento <= 19)) {
            signo = "Capricornio";
        } else if ((mesNacimiento == 1 && diaNacimiento >= 20) || (mesNacimiento == 2 && diaNacimiento <= 18)) {
            signo = "Acuario";
        } else {
            signo = "Piscis";
        }

        //Imprimiendo valores
        System.out.printf("""
                -------------------------------
                \tDatos del Usuario
                -------------------------------
                Nombre: %s
                Fecha de nacimiento: %d de %s del %d
                Tu signo del zodiaco es: %s
                """,nombre,diaNacimiento,mes,anioNacimiento,signo);

    }
}
