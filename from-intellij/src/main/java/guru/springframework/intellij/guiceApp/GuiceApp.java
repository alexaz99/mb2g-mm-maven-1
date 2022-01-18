package guru.springframework.intellij.guiceApp;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guru.springframework.intellij.guiceApp.beans.IDbRunner;

public class GuiceApp {

    private static Injector injector;

    public static void main(String[] args) {
        System.out.println("Hello from Google Guice");

        injector = new InjectorProvider().getInjector();
        //Injector injector = Guice.createInjector(new MainModule());

        IDbRunner runner = injector.getInstance(IDbRunner.class);
        try {
            runner.start("configfile.config");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
