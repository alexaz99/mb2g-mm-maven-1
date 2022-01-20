package guru.springframework.intellij.guiceApp.beans;

public interface IDbRunner extends IRunner {

    // add addition method signatures

    void start(String filename) throws Exception;
    int getTotalCount();
}
