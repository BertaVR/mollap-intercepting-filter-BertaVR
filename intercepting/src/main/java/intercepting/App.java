package intercepting;

import intercepting.administrator.Tasks;
import intercepting.administrator.TasksProgrammer;
import intercepting.clients.Mollapp;
import intercepting.filters.Authorization;
import intercepting.targets.Vehicle;
import intercepting.filters.Authentication;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        TasksProgrammer tasksProgrammer = new TasksProgrammer(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        TasksProgrammer.setTask(new Authentication());
        TasksProgrammer.setTask(new Authorization());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTasksProgrammer(tasksProgrammer);
        mollapp.sendRequest("Francesc");
    }
}