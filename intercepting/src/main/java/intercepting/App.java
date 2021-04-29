package intercepting;

import intercepting.administrator.TasksProgrammer;
import intercepting.clients.Mollapp;
import intercepting.filters.Authentication;
import intercepting.filters.Authorization;
import intercepting.targets.Vehicle;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuring the tasks programmer
         * with the chosen target type (vehicle in this case,
         *  but it could be any target capable of recieving a message.)
         */
        TasksProgrammer tasksProgrammer = new TasksProgrammer((new Vehicle()));

        /**
         * Adding to the system the tasks that we want it to
         *  execute once the client request is recievec.
         */
        tasksProgrammer.setTasks(new Authentication());
        tasksProgrammer.setTasks(new Authorization());

        /**
         * Configuring the Client app
         * for it to run the schedulled tasks
         * ans send a message to the system.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTasksProgrammer(tasksProgrammer);
        mollapp.sendRequest("Francesc");
    }
}