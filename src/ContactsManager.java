public class ContactsManager {
    Contact[] mes_amis;
    int Compteur;

    // Constructeur par défaut
    public ContactsManager() {
        this.Compteur = 0;
        this.mes_amis = new Contact[500];
    }

    // Méthode pour ajouter un contact
    public void addContact(Contact contact) {
        mes_amis[Compteur] = contact;
        Compteur++;
    }

    // Méthode pour rechercher un contact par nom
    public Contact searchContact(String searchName) {
        for (int i = 0; i < Compteur; i++) {
            if (mes_amis[i].nom.equals(searchName)) {
                return mes_amis[i];
            }
        }
        return null;
    }
}