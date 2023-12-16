package ma.enset.comptecqrses.commonapi.commands;

public class CreateAccountCommand extends BaseCommand<String> {
    private double initialBalance;
    private String currency;


    public CreateAccountCommand(String id, double initialBalance, String currency) {
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
    }
}
