package speedmaster.gold;

/*
Java Singleton
https://techacademy.jp/magazine/18939
*/
public class G1_12_Singleton_Config {
    private G1_12_Singleton_Config() {}

    public static G1_12_Singleton_Config getInstance() {
        return ConfigInstanceHolder.INSTANCE;
    }

    public String getValue(String key) {
        return "....";
    }

    public static class ConfigInstanceHolder {
        private static final G1_12_Singleton_Config INSTANCE = new G1_12_Singleton_Config();
    }
}
