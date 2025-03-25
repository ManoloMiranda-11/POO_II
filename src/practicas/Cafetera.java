package practicas;

public class Cafetera {
    private boolean enReposo;
    private boolean preparandoCafe;
    private int cantidadCafe;
    private String tipoCafe;

    public Cafetera() {
        this.enReposo = true;
        this.preparandoCafe = false;
        this.cantidadCafe = 0;
        this.tipoCafe = "";
    }

    public Cafetera(Cafetera otraCafetera) {
        this.enReposo = otraCafetera.enReposo;
        this.preparandoCafe = otraCafetera.preparandoCafe;
        this.cantidadCafe = otraCafetera.cantidadCafe;
        this.tipoCafe = otraCafetera.tipoCafe;
    }

    public void encender() {
        if (this.enReposo) {
            this.enReposo = false;
            System.out.println("Cafetera encendida");
        } else {
            System.out.println("La cafetera ya está encendida");
        }
    }

    public void apagar() {
        if (!this.enReposo) {
            this.enReposo = true;
            this.preparandoCafe = false;
            System.out.println("Cafetera apagada");
        } else {
            System.out.println("La cafetera ya está apagada");
        }
    }

    public void iniciarPreparacion() {
        if (!this.enReposo) {
            this.preparandoCafe = true;
            System.out.println("Iniciando la preparación de " + this.cantidadCafe + " ml de " + this.tipoCafe);
        } else {
            System.out.println("Enciende la cafetera primero");
        }
    }

    public void detenerPreparacion() {
        if (this.preparandoCafe) {
            this.preparandoCafe = false;
            System.out.println("Preparación de café detenida");
        } else {
            System.out.println("No se está preparando café");
        }
    }

    public void ajustarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidadCafe = cantidad;
            System.out.println("Cantidad de café ajustada a " + cantidad + " ml");
        } else {
            System.out.println("La cantidad debe ser mayor que 0");
        }
    }

    public void seleccionarTipo(String tipo) {
        if (tipo.equalsIgnoreCase("espresso") || tipo.equalsIgnoreCase("americano") || tipo.equalsIgnoreCase("capuchino")) {
            this.tipoCafe = tipo.toLowerCase();
            System.out.println("Tipo de café seleccionado: " + this.tipoCafe);
        } else {
            System.out.println("Tipo de café no válido. Seleccione 'espresso', 'americano' o 'capuchino'");
        }
    }

    public void consultarEstado() {
        String estado = this.enReposo ? "en reposo" : (this.preparandoCafe ? "preparando café" : "encendida");
        System.out.println("Estado de la cafetera: " + estado);
        System.out.println("Cantidad de café: " + this.cantidadCafe + " ml");
        System.out.println("Tipo de café: " + (this.tipoCafe.isEmpty() ? "No seleccionado" : this.tipoCafe));
    }

    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera();
        Cafetera cafetera2 = new Cafetera(cafetera1);

        cafetera1.encender();
        cafetera1.ajustarCantidad(200);
        cafetera1.seleccionarTipo("Espresso");
        cafetera1.iniciarPreparacion();
        cafetera1.consultarEstado();

        cafetera1.detenerPreparacion();
        cafetera1.consultarEstado();

        cafetera2.encender();
        cafetera2.seleccionarTipo("americano");
        cafetera2.ajustarCantidad(300);
        cafetera2.iniciarPreparacion();
        cafetera2.consultarEstado();

        cafetera1.apagar();
        cafetera1.consultarEstado();
    }
}
