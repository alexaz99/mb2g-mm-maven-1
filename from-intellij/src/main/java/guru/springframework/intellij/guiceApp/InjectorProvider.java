package guru.springframework.intellij.guiceApp;

import com.google.inject.Guice;
import com.google.inject.Injector;

public final class InjectorProvider {

    // Create a Guice singlenton injector instance
    private static final Injector instance = Guice.createInjector(new MainModule());
    //private static final Injector instance = Guice.createInjector(Stage.PRODUCTION, new MainModule());

    public Injector getInjector() {
        return instance;
    }
}
