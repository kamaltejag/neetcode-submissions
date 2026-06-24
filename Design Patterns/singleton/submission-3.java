static class Singleton {

    private static volatile Singleton singleton = null;

    private String string = null;

    private Singleton() {
        this.string = null;
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
        return this.string;
    }

    public void setValue(String value) {
        this.string = value;
        return;
    }
    
}
