package pr2;

import java.util.*;

class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) { this.name = name; }

    public String getName() { return name; }

    public boolean isMember() { return member; }
    public void setMember(boolean member) { this.member = member; }

    public String getMemberType() { return memberType; }
    public void setMemberType(String memberType) { this.memberType = memberType; }

    public String toString(){
        String s = "";

        s += "name: " + this.name + ", ";

        s += "membership: ";

        if (this.member == true){
            s += "yes";
        }
        else {
            s += "no";
        }

        s += ", ";

        s += "membertype: " + this.memberType;

        return s;
    }
}

class Visit {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() { return customer; }

    public double getServiceExpense() { return serviceExpense; }
    public void setServiceExpense(double serviceExpense) { this.serviceExpense = serviceExpense; }

    public double getProductExpense() { return productExpense; }
    public void setProductExpense(double productExpense) { this.productExpense = productExpense; }

    public double getTotalExpense() {
        double total = this.productExpense + this.serviceExpense;

        if (this.customer.isMember() == true){
            double serviceDiscount = DiscountRate.getServiceDiscountRate(this.customer.getMemberType());
            double productDiscount = DiscountRate.getProductDiscountRate(this.customer.getMemberType());

            total = this.productExpense * (1 - productDiscount) + this.serviceExpense * (1 - serviceDiscount);
        }

        return total;
    }

    public String toString(){
        String s = "";

        s += this.customer.toString() + ", ";

        s += "date: " + this.date + ", ";

        s += "service expense: " + this.serviceExpense + ", ";

        s += "product expense: " + this.productExpense + ", ";

        return s;
    }
}

class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        double res = 0;

        if (type.equals("Gold")){
            res = serviceDiscountGold;
        }
        else if (type.equals("Silver")){
            res = serviceDiscountSilver;
        }
        else if (type.equals("Premium")){
            res = serviceDiscountPremium;
        }

        return res;
    }

    public static double getProductDiscountRate(String type) {
        double res = 0;

        if (type.equals("Gold")){
            res = productDiscountGold;
        }
        else if (type.equals("Silver")){
            res = productDiscountSilver;
        }
        else if (type.equals("Premium")){
            res = productDiscountPremium;
        }

        return res;
    }
}


public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        String type = s.nextLine();

        Customer c = new Customer(name);

        if (!type.equals("None")) {
            c.setMember(true);
            c.setMemberType(type);
        }
        else {
            c.setMember(false);
            c.setMemberType("None");
        }

        System.out.println(c);

        Visit visit = new Visit(c, "13 october 2018");

        double product = s.nextDouble();
        double service = s.nextDouble();

        visit.setProductExpense(product);
        visit.setServiceExpense(service);

        System.out.println(visit);
        System.out.println(visit.getTotalExpense());


    }
}