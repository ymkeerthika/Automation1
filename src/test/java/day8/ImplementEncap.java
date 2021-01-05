package day8;

public class ImplementEncap {

    public static void main(String[] args) {
        EncapExample ec = new EncapExample();
        ec.setcardNumber(2345678922222l);
        ec.setName("Arvind");
        ec.setCvv(323);
        ec.setExp(2022);

        System.out.println("Card number: "+ec.getcardNumber());
        System.out.println("Card CVV: "+ec.getCvv());
        System.out.println("Card EXP: "+ec.getExp());
        System.out.println("Card Name: "+ec.getName());

        System.out.println("*****************");
        ec.setcardNumber(564323456);
        ec.setName("Teju");
        ec.setCvv(654);
        ec.setExp(2030);

        System.out.println("Card number: "+ec.getcardNumber());
        System.out.println("Card CVV: "+ec.getCvv());
        System.out.println("Card EXP: "+ec.getExp());
        System.out.println("Card Name: "+ec.getName());
    }
}
