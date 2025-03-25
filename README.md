# POO_II (Programación Avanzada en Java) 💻

Este repositorio incluye una colección extensa de ejercicios y ejemplos prácticos relacionados con programación orientada a objetos en Java. Está pensado para practicar conceptos como herencia, interfaces, enumeraciones, colecciones, genéricos y más, con una estructura bien organizada en paquetes temáticos.

---

## 🔧 Estructura del proyecto

El código está organizado por paquetes temáticos:

- **collections**, **collections2**: Uso de listas, clases `Coche`, `Color`, `Marca`, `Parking`.
- **enums**: Enumeraciones como `Fieston`, `FinDeJava`.
- **herencia**: Jerarquía de clases animales que vuelan, nadan, etc.
- **interfacesfuncionales.interfaces**: Interfaces y clases que las implementan (`Desplazable`, `Volador`...).
- **interfacesfuncionales2.interfaces**: Operaciones con interfaces funcionales.
- **colecciones**: Juegos y ejercicios prácticos con ArrayList (`AdivinaNumero`, `Ahorcado`, `TresEnRaya`, etc.).
- **collectionsymaps**: Uso combinado de listas y mapas (`CuentaCuentos`).
- **cuadricula**: Arrays bidimensionales (`Array2D`).
- **dado**: Simulación de dados (`Dado.java`).
- **generics**, **generics2**: Programación genérica con `Caja<T>`, `Pareja<T, T>`, `Estanteria`, `Articulo`, etc.
- **practicas**: Casos prácticos como `Cafetera`.
- **vehiculos**: Herencia aplicada a medios de transporte (`Coche`, `Motocicleta`, `Bicicleta`, `Vehiculo`).

---

## 🚀 Cómo usar este proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/ManoloMiranda-11/POO_II.git
   ```
2. Abre el proyecto con Eclipse o cualquier IDE compatible con Java.
3. Explora las clases en `src/` y ejecuta las clases `Test` o `Main` si las hay para comprobar su funcionamiento.
4. Examina cada paquete según el tema que quieras repasar o estudiar.

---

### 📌 Requisitos

- JDK 11 o superior.
- Eclipse, IntelliJ IDEA u otro IDE compatible.
- Git instalado si quieres trabajar con ramas (recomendado).

---

## 📘 Recursos útiles

- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [Guía de colecciones en Java (Baeldung)](https://www.baeldung.com/java-collections)
- [Interfaces funcionales (Oracle)](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
- [Playlist de YouTube: Aprende Java POO](https://www.youtube.com/playlist?list=PLWtYZ2ejMVJlUu5lq2d3xE6Cs4t73zvPp)

---

## ✍️ Ejemplo de código

```java
// Ejemplo de uso de genéricos en el paquete generics

public class Caja<T> {
    private T contenido;

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return contenido;
    }
}

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>();
        miCaja.guardar("Hola Genéricos");
        System.out.println(miCaja.obtener());
    }
}
```

---

## 📂 Estructura de carpetas

(Puedes adaptar esto a tu estructura si cambia)

```
POO_II/
│
├── src/
│   ├── collections/
│   ├── enums/
│   ├── herencia/
│   ├── interfacesfuncionales/interfaces/
│   ├── interfacesfuncionales2/interfaces/
│   ├── colecciones/
│   ├── collectionsymaps/
│   ├── cuadricula/
│   ├── dado/
│   ├── generics/
│   ├── generics2/
│   ├── practicas/
│   └── vehiculos/
│
└── README.md
```

---

## 🌿 Ramas utilizadas y propósito

Este repositorio utiliza distintas ramas para organizar el trabajo:

- `main`: contiene la versión final y estable del proyecto.
- `desarrollo`: rama usada para pruebas, nuevas funciones o correcciones.

Cada rama contiene al menos 2 commits relevantes. Por ejemplo:

- En `desarrollo` se añadió el paquete `colecciones` con juegos y se probó `AdivinaNumero`.
- En `main` se integraron las clases de genéricos (`Caja`, `Pareja`, etc.).

---

## 🧪 ¿Qué se hizo en cada rama?

- **Rama desarrollo**: se añadieron las clases de juegos, se probaron los ejercicios `Ahorcado` y `TresEnRaya`.
- **Rama main**: contiene las clases organizadas por tema, el README definitivo y se configuró `.gitignore`.

---

## 🗂️ Uso de .gitignore

Este proyecto incluye un archivo `.gitignore` para evitar subir archivos innecesarios como:

- Archivos de configuración del IDE (`.classpath`, `.project`, `.settings/`)
- Archivos compilados (`.class`)
- Archivos temporales del sistema

---
