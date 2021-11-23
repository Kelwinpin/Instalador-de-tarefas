public class TarefasRTOS{
    public static void main(String[] args) {
            var installTask = new Instalador(250, 1, 10, "Task1", " ", 64);


            var Task1 = new Task1(null);
            System.out.println(Task1);
            Task1.exe();
    }
}