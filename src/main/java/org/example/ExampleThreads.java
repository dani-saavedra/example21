package org.example;

/*
Java 19
Java 21

 */
public class ExampleThreads {
    /*
    .   Los hilos virtuales son una mejora revolucionaria en la gestión de concurrencia en Java,
         ya que permiten crear y manejar miles o incluso millones de hilos de manera eficiente.
        En lugar de estar directamente asociados a un hilo del sistema operativo (como los hilos tradicionales),
        los hilos virtuales son administrados por la JVM y mapeados a hilos del sistema solo cuando están en ejecución activa.

        Diferencias entre Hilos Tradicionales y Virtuales
        Aspecto	                Hilos Tradicionales	                    Hilos Virtuales
        Creación y gestión	    Costosa en términos de recursos.	    Muy ligera, permite miles o más.
        Bloqueos	            Bloquea el hilo del SO.             	Bloquea solo el hilo virtual.
        Paralelismo	            Limitado por la cantidad de núcleos.	Escalable más allá de los núcleos.
        Concurrencia	        Costosa para tareas masivas.	        Excelente para tareas I/O.
        Modelo	                1:1 (un hilo por sistema operativo).	M(múltiples hilos virtuales sobre pocos hilos del SO).
     */
    /*
     The consequence of those facts is that unlike platform threads,
      which are very expensive to create and heavy to manage, virtual threads are very cheap
      and fast to create in large quantities.
     */
    public static void main1(String[] args) {
        Thread thread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from a virtual thread!");
        });

        // Esperar que el hilo termine
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  Esto pisa de frente el progra
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread 1: " + Thread.currentThread());
        });
        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread 2: " + Thread.currentThread());
        });
        Thread.sleep(100);
        //https://dev.to/elayachiabdelmajid/java-21-virtual-threads-1h5b
    }
    /*
    ¿Cómo los Virtual Threads abordan la concurrencia?
        Modelo de Programación Imperativa:

        * Los hilos virtuales permiten escribir código concurrente utilizando un estilo tradicional e imperativo,
        eliminando la necesidad de escribir callbacks o pipelines reactivos complejos.
        *Esto los hace ideales para tareas de I/O intensivo o concurrencia masiva.

        Bloqueos No son un Problema:

        * En los hilos tradicionales, un hilo bloqueado consume un hilo del sistema operativo, lo que limita la escalabilidad.
        * Los hilos virtuales pueden bloquearse sin afectar la escalabilidad, ya que el bloque se gestiona internamente por la JVM.

     */
}
