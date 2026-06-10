import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {

    // Liste qui stocke tous les contacts
    ArrayList<Contact> contactsList = new ArrayList<Contact>();

    // Constructeur par défaut
    public ContactsManager() {}

    // Méthode pour ajouter un contact dans la liste
    public void addContact(Contact contact) {
        contactsList.add(contact);
    }

    // Méthode pour rechercher un contact par son nom
    // Retourne le contact trouvé ou null si introuvable
    public Contact searchContact(String name) {
        for (Contact contact : contactsList) {
            if (contact.name.equalsIgnoreCase(name)) {
                return contact; // contact trouvé → on le retourne
            }
        }
        return null; // contact pas trouvé
    }

    public static void main(String[] args) throws Exception {

        // Initialisation du scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Création du gestionnaire de contacts
        ContactsManager myContactsManager = new ContactsManager();

        // Demander à l'utilisateur combien de contacts il veut ajouter
        System.out.println("Entrez le nombre de contacts à ajouter :");
        int nombre_contacts = Integer.parseInt(scanner.nextLine());

        // Boucle pour ajouter chaque contact un par un
        for (int i = 0; i < nombre_contacts; i++) {

            // Créer un nouveau contact à chaque tour
            Contact contact_ami = new Contact();

            // Demander le nom du contact
            System.out.println("Entrez le nom du contact " + (i + 1) + " :");
            contact_ami.name = scanner.nextLine();

            // Demander le numéro de téléphone du contact
            System.out.println("Entrez le numéro de téléphone du contact " + (i + 1) + " :");
            contact_ami.phoneNumber = scanner.nextLine();

            // Tant que ce n'est pas un numéro valide on redemande
            while (!contact_ami.phoneNumber.matches("[0-9]+")) {
                System.out.println(" Numéro invalide ! Entrez uniquement des chiffres :");
                 contact_ami.phoneNumber = scanner.nextLine();
                  }

            // Ajouter le contact dans la liste
            myContactsManager.addContact(contact_ami);
        }

        // Afficher tous les contacts de la liste
        System.out.println("\n--- Liste des contacts ---");
        for (Contact contact : myContactsManager.contactsList) {
            System.out.println("Name: " + contact.name + ", Phone Number: " + contact.phoneNumber);
        }

        // Demander le nom du contact à rechercher
        System.out.println("\nEntrez le nom du contact à rechercher :");
        String nom = scanner.nextLine();

        // Lancer la recherche
        Contact resultat = myContactsManager.searchContact(nom);

        // Afficher le résultat de la recherche
        if (resultat != null) {
            System.out.println("Résultat de la recherche :");
            System.out.println("Nom : " + resultat.name + " | Téléphone : " + resultat.phoneNumber);
        } else {
            System.out.println("Contact non trouvé !");
        }
    }
}