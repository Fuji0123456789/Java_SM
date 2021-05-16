package speedmaster.gold;

public class G1_12_Singleton_Application {
    public static void main(String[] args) {
    	G1_12_Singleton_Config config = G1_12_Singleton_Config.getInstance();

        String rootPath = config.getValue("rootPath");
        System.out.println(rootPath);

        G1_12_Singleton_Config config2 = G1_12_Singleton_Config.getInstance();
        System.out.println(config == config2);
    }
}
/*
....
true

*/