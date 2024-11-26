
package ec.edu.espoch.queuecircular;

import ec.edu.espoch.queuecircular.clases.Queue;

public class QueueCircular {

    public static void main(String[] args) {
        Queue queue = new Queue(5); // Cola con capacidad 5

        // Agregar elementos a la cola
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Intentar agregar a una cola llena
        queue.enqueue(60);

        // Mostrar el estado de la cola
        queue.printQueue();

        // Eliminar elementos
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Agregar más elementos después de liberar espacio
        queue.enqueue(60);
        queue.enqueue(70);

        // Mostrar el estado de la cola
        queue.printQueue();

        // Mostrar el frente
        System.out.println("Front of queue: " + queue.peek());

        // Vaciar la cola
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Mostrar la cola vacía
        queue.printQueue();
    }
}
