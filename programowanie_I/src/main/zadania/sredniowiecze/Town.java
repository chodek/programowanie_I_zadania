package zadania.sredniowiecze;

public class Town {
    private Citizen[] citizens;

    public Town(Citizen[] citizens) {
        this.citizens = citizens;
    }

    public int howManyCanVote() {
        int count = 0;                           // Bedziemy w tej zmiennej zliczac ile osob moze glosowac.
        for (Citizen citizen : this.citizens) { // Petla ktora pozwoli przejrzec cala tablice Citizenow.
            if (citizen.canVote()) {             // Jezeli ktorys obywatel moze glosowac,
                count++;                        // to zwiekszamy liczbe obywateli ktorzy moga glosowac o 1.
            }
        }
        return count;                            // Zwracamy wynik.
    }

    public void whoCanVote() {
        System.out.println("Glosowac moze: ");
        for (Citizen citizen : this.citizens) {          // Petla ktora pozwoli przejrzec cala tablice Citizenow.
            if (citizen.canVote()) {                    // Jezeli ktorys obywatel moze glosowac,
                System.out.println(citizen.getName()); // to wypisujemy jego name.
            }
        }
    }

    public Citizen[] whoCanVote2() {
        int eligibleToVote = howManyCanVote(); // Teraz wiemy ile obywateli moze glosowac, wiec wiemy, jak duza tablice musimy zrobic.

        int counter = 0;                        // Licznik, ktory posluzy nam do wstawiania citizenow w odpowiednie miejsca w tablicy peopleWhoCanVote.
        Citizen[] peopleWhoCanVote = new Citizen[eligibleToVote]; //Tworzymy tablice, ktora zwrocimy uzupelniona. Jej wielkosc musi byc taka, ilu jest obywatelow mogacych glosowac.
        for (Citizen citizen : this.citizens) { // Petla ktora pozwoli przejrzec cala tablice Citizenow.
            if (citizen.canVote()) {            // Jezeli ktorys obywatel moze glosowac,
                peopleWhoCanVote[counter] = citizen;    // to wstawiamy tego obywatela do drugiej tablicy, na pozycje 'counter'
                counter++;                      // skoro wstawilismy kogos na pozycje counter, to teraz zwiekszamy counter, zeby ewentualny nastepny obiekt wyladowal nizej w tablicy
            }
        }
        return peopleWhoCanVote;        // Zwracamy uzupelniona tablice.

    }
}
