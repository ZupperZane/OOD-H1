package Task1;

public class weddingPlanner {

    private static weddingPlanner instance =null;

    private String testcase;

    private WeddingPlanner(){
        testcase = "success"
    }

    public static weddingPlanner getInstance() {
        if (instance == null){
            synchronized (weddingPlanner.class){
                if (instance == null) {
                    instance = new weddingPlanner();
                }
            }
        }
        return instance;
    }
}
