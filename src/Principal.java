import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        String menu = """
             *******************************************
             Sea bienvenido/a al Conversor de Monedas =]
             
             1) Dólar =>> Peso argentino
             2) Peso argentino =>> Dólar
             3) Dólar =>> Real brasileño
             4) Real brasileño =>> Dólar
             5) Dólar =>> Peso colombiano
             6) Peso colombiano =>> Dólar
             7) Salir
             Elija una opción válida:
             *******************************************
             """;

        enum Estado {
            CONTINUAR, DETENER
        }

        Estado condicionLoop = Estado.CONTINUAR;

        while (condicionLoop == Estado.CONTINUAR) {
            System.out.println(menu);

            Integer eleccion = Integer.parseInt(lectura.nextLine());

            // si es un numero valido, se hace la conversion
            if (eleccion >= 1 && eleccion < 7) {
                System.out.println("Ingrese el valor que desea convertir: ");

                String ingresoValorParaConvertir = lectura.nextLine();

                if (ingresoValorParaConvertir.matches(".*[.,].*[.,].*")) {
                    // si tiene multiples comas o multiples puntos se vuelve al inicio
                    System.out.println("Formato de número no válido");
                    continue;
                } else if (ingresoValorParaConvertir.contains(",") && ingresoValorParaConvertir.contains(".")) {
                    // asumo que si tiene coma y punto, el punto marca el decimal
                    ingresoValorParaConvertir = ingresoValorParaConvertir.replace(",", "");
                }  else if (ingresoValorParaConvertir.contains(",")) {
                    ingresoValorParaConvertir = ingresoValorParaConvertir.replace(",", ".");
                }

                Double valorParaConvertir = Double.valueOf(ingresoValorParaConvertir);

                ConversionMoneda cambioDeMonedas = new ConversionMoneda(eleccion, valorParaConvertir);

                // llamo el método que hace la conversion
                cambioDeMonedas.convertidorDeMoneda();
                // devuelvo el mensaje final
                System.out.println(cambioDeMonedas.mensajeResultadoConversion());
            } else if (eleccion == 7) {
                System.out.println("Cerrando la aplicación");
                condicionLoop = Estado.DETENER;
                break;
            } else {
                // cuando el numero ingresado esta fuera del rango se retorna este mensaje
                System.out.println("Ingrese un valor entre 1 y 7");
            }

        }

    }


}
