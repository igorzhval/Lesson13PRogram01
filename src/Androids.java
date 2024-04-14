class Androids implements Smartphones {
    private String model;

    public Androids(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println(model + " is making a call using Android.");
    }

    @Override
    public void sms() {
        System.out.println(model + " is sending a message using Android.");
    }

    @Override
    public void internet() {
        System.out.println(model + " is browsing the internet using Android.");
    }

    public void linuxOS() {
        System.out.println(model + " is running on Linux OS.");
    }
}