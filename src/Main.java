public class Main{
    public static void main(String[] args) {
        
        ClubAurora clubA = new ClubAurora("CZAXX234TGF", "Alfred", "Hitchcock", "Winewood Av., New York City, NY", "August 13, 1987", "Monthly");
        MonthlyFee monthlyFee = new MonthlyFee();

        System.out.println("The member " + clubA.getFirstName() + " " + clubA.getLastName() + " has a " + clubA.getMembership() + 
        " membership and must pay a monthly subscription fee of: €" + monthlyFee.calculateFee());
        
        // --- TODO

        /* Repeat the above code to create as many objects for different types of member susbcription  
        */
        ClubAurora clubB = new ClubAurora("BXSSJ222FF", "Bred", "Green", "Long Av., New York City, NY", "August 13, 1987", "Yearly");
        YearlyFee yearlyFee = new YearlyFee();

        System.out.println("The member " + clubB.getFirstName() + " " + clubB.getLastName() + " has a " + clubB.getMembership() + 
        " membership and must pay a monthly subscription fee of: €" + yearlyFee.calculateFee());

        ClubAurora clubC = new ClubAurora("BXSSTT66FF", "Jack", "Brown", "Small Av., New York City, NY", "Apirl 12, 2017", "Half yearly");
        HalfYearlyFee halfYearlyFee = new HalfYearlyFee();

        System.out.println("The member " + clubC.getFirstName() + " " + clubC.getLastName() + " has a " + clubC.getMembership() + 
        " membership and must pay a monthly subscription fee of: €" + halfYearlyFee.calculateFee());

        ClubAurora clubD = new ClubAurora("FFSFSS22F", "Demon", "Taylor", "Short Av., New York City, NY", "May 2, 2007", "Life Time");
        LifeTimeFee lifeTimeFee = new LifeTimeFee();

        System.out.println("The member " + clubD.getFirstName() + " " + clubD.getLastName() + " has a " + clubD.getMembership() + 
        " membership and must pay a monthly subscription fee of: €" + lifeTimeFee.calculateFee());
    }
}




