class Netflix {
    private String accountEmail = "user@gmail.com";
    protected String platform = "Netflix";

    public void showAccount() {
        System.out.println("Account: " + accountEmail);
    }
    void welcome() {
        System.out.println("Welcome to Netflix!");
    }

    public void subscribe() {
        System.out.println("Basic subscription selected.");
    }

    public void subscribe(String plan) {
        System.out.println("Subscription plan selected: " + plan);
    }
    public void subscribe(String plan, int duration) {
        System.out.println("Plan: " + plan);
        System.out.println("Duration: " + duration + " months");
    }
}

class MobilePlan extends Netflix {
    @Override
    public void welcome() {
        System.out.println("Welcome to Netflix Mobile Plan!");
    }

    public void showFeatures() {
        System.out.println("Device: 1 Mobile");
        System.out.println("Quality: SD");
        System.out.println("Price: 4$/month");
        System.out.println("Platform: " + platform);
    }
}
class StandardPlan extends Netflix {
    @Override
    public void welcome() {
        System.out.println("Welcome to Netflix Standard Plan!");
    }

    public void showFeatures() {
        System.out.println("Device: 1 Mobile");
        System.out.println("Quality: HD");
        System.out.println("Price: 9$/month");
        System.out.println("Platform: " + platform);
    }
}

class PremiumPlan extends Netflix {
    @Override
    public void welcome() {
        System.out.println("Welcome to Netflix Premium Plan!");
    }

    public void showFeatures() {
        System.out.println("Device: 1 Mobile");
        System.out.println("Quality: 4k");
        System.out.println("Price: 13$/month");
        System.out.println("Platform: " + platform);
    }
}

public class acc1 {
    public static void main(String[] args) {
        MobilePlan mobilePlan = new MobilePlan();
        StandardPlan standardPlan = new StandardPlan();
        PremiumPlan premiumPlan = new PremiumPlan();

        System.out.println("-----ACCOUNT DETAILS-----");
        mobilePlan.showAccount();

        System.out.println("\n-------SUBSCRIPTION-------");
        mobilePlan.subscribe();
        mobilePlan.subscribe("Mobile");
        mobilePlan.subscribe("Mobile", 3);

        System.out.println("\n-----PLAN FEATURES-----");
        mobilePlan.welcome();
        mobilePlan.showFeatures();
        standardPlan.welcome();
        standardPlan.showFeatures();
        premiumPlan.welcome();
        premiumPlan.showFeatures();

    }
}