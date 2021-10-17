package zadania.sredniowiecze;

public class Main {
    public static void main(String[] args) {
        King king = new King("Rhobar III");
        Peasant peasant = new Peasant("Onar");
        Soldier soldier = new Soldier("Gorn");
        Townsman townsman = new Townsman("Thorben");

        Town town = new Town(new Citizen[]{king, peasant, soldier, townsman}); // Tworze nowe miasto, przekazaując do konstruktora tworzona tablice Citizenow, skladajaca sie z krola, chlopa, zolnierza i mieszczanina.
        System.out.println("Ilosc osob mogaca glosowac: " + town.howManyCanVote());
        town.whoCanVote();

        Citizen[] peopleWhoCanVote = town.whoCanVote2();
        System.out.println("W tablicy z ludzmi mogacymi glosowac sa:");
        for (Citizen citizen : peopleWhoCanVote) {
            System.out.println(citizen.getName());
        }
    }
}
