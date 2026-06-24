static class Singleton {

    private static volatile Singleton singleton;

    private String string;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(singleton == null){
            synchronized(Singleton.class) {
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public String getValue() {
        return string;
    }

    public void setValue(String value) {
        this.string = value;
    }
    
}
