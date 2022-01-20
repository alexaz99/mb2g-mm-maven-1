package guru.springframework.intellij.guiceApp.beans;

public class DbRunner implements IDbRunner {

    private int startInstanceCnt = 0;

    @Override
    public void start(String filename) throws Exception {
        // do processing base on config file

        start();
    }

    @Override
    public void start() throws Exception {
        startInstanceCnt++;
        System.out.println("Start DbRunner: startInstanceCnt=" + startInstanceCnt);
    }

    @Override
    public int getTotalCount() {
        return 0;
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop DbRunner");
    }
}
