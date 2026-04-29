public class Main {
    public static void main(String[] args) {
        // Création de l'objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Création du premier contact
        Contact ami1 = new Contact();
        ami1.nom = "Jean";
        ami1.Numero_de_telephone = "0102030405";
        myContactsManager.addContact(ami1);

        //Création du deuxième contact
        Contact ami2 = new Contact();
        ami2.nom = "Marie";
        ami2.Numero_de_telephone = "0607080910";
        myContactsManager.addContact(ami2);

        // Création du troisième contact
        Contact ami3 = new Contact();
        ami3.nom = "Paul";
        ami3.Numero_de_telephone = "0711223344";
        myContactsManager.addContact(ami3);

        // création du quatrième contact
        Contact ami4 = new Contact();
        ami4.nom = "Sophie";
        ami4.Numero_de_telephone = "0988776655";
        myContactsManager.addContact(ami4);

        // Création du cinquième contact
        Contact ami5 = new Contact();
        ami5.nom = "Lucas";
        ami5.Numero_de_telephone = "0555443322";
        myContactsManager.addContact(ami5);

        //Rechercher un contact et afficher son numéro
        Contact resultat = myContactsManager.searchContact("Marie");
        if (resultat != null) {
            System.out.println("Numéro de " + resultat.nom + " : " + resultat.Numero_de_telephone);
        } else {
            System.out.println("Contact non trouvé");
        }
    }
}