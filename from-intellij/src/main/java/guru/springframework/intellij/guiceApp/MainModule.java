package guru.springframework.intellij.guiceApp;

import com.google.inject.AbstractModule;
import guru.springframework.intellij.guiceApp.beans.DbRunner;
import guru.springframework.intellij.guiceApp.beans.IDbRunner;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IDbRunner.class).to(DbRunner.class);
    }
}
