class iPhones implements Smartphones {
    private String model;

    public iPhones(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println(model + " is making a call using iOS.");
    }

    @Override
    public void sms() {
        System.out.println(model + " is sending a message using iOS.");
    }

    @Override
    public void internet() {
        System.out.println(model + " is browsing the internet using iOS.");
    }

    public void iOS() {
        System.out.println(model + " is running on iOS.");
    }
}