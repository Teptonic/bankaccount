public class Test
{
    public static void main(String[] args)
    {
        BankAccout savings = new BankAccout("vern", 15123, 1000, "goofyahh");

        savings.logIn("vern", "goofyahh");
        //savings.logOut();
        savings.withdrawl(1000);
        System.out.println(savings.getBalance());
        savings.deposit(10000);
        System.out.println(savings.getBalance());
        savings.logOut();
        System.out.println(savings.toString());
    }
}

