
package ec.edu.espoch.queuecircular.clases;

public class Queue {
    private int[] elements; // Arreglo para almacenar elementos
    private int front;      // Índice del frente
    private int rear;       // Índice del final
    private int size;       // Número actual de elementos
    private int capacity;   // Capacidad máxima de la cola

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue: Agregar un elemento al final de la cola
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue: " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Movimiento circular del índice rear
        elements[rear] = item;       // Agregar el elemento
        size++;                      // Incrementar el tamaño
        System.out.println("Enqueued: " + item);
    }

    // Dequeue: Eliminar y devolver el elemento al frente de la cola
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Usamos -1 para indicar error
        }
        int item = elements[front];  // Obtener el elemento al frente
        elements[front] = 0;         // Opcional: Resetear la posición eliminada
        front = (front + 1) % capacity; // Movimiento circular del índice front
        size--;                      // Reducir el tamaño
        return item;
    }

    // Peek: Mostrar el elemento al frente sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return elements[front];
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Verificar si la cola está llena
    public boolean isFull() {
        return size == capacity;
    }

    // Método auxiliar para imprimir el estado de la cola
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
