package TuNetCom.test;

import TuNetCom.BestErp.Domain.Client;
import TuNetCom.BestErp.Domain.Facture;
import TuNetCom.BestErp.Domain.Produit;

import java.util.Scanner;
public class MainTests {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Produit produitList[] = new Produit[10];
       Client clientList[] = new Client[10];
       int indiceProduit = 0;
       int indiceClient = 0 ;
        int input = -1; // declaration + initialisation
        int choixMenuArticle = -1;
        int choixMenuClient = -1;
            do {
                ShowMenuPrincipale();
                input = sc.nextInt(); // simple afectation
                switch (input){
                    case 1:
                        ShowMenuArticle();
                        choixMenuArticle = sc.nextInt(); // simple afectation
                        switch (choixMenuArticle){
                            case 1:
                                Produit produit = GetProductFromKeyboard(sc);
                                produitList[indiceProduit] = produit;
                                System.out.println("Produit ajouté avec succès !");
                                indiceProduit ++;
                                break;
                            case 2:
                                System.out.println("veullier entrer la references du produits à modifier");
                                String referenceAModifier = sc.next();
                                for (int i = 0; indiceProduit > i; i ++) {
                                    if (produitList[i].getRefe().equals(referenceAModifier)){
                                        System.out.print("Nom : ");
                                        String nom = sc.next();
                                        System.out.print("Quantité : ");
                                        int quantite = sc.nextInt();
                                        System.out.print("Quantité limite : ");
                                        int quantiteLimite = sc.nextInt();
                                        System.out.print("Remise (%) : ");
                                        double remise = sc.nextDouble();
                                        System.out.print("Remise d'achat (%) : ");
                                        double remiseAchat = sc.nextDouble();
                                        System.out.print("TVA (%) : ");
                                        double tva = sc.nextDouble();
                                        System.out.print("Prix : ");
                                        double prix = sc.nextDouble();
                                        System.out.print("Prix d'achat : ");
                                        double prixAchat = sc.nextDouble();
                                        System.out.print("Visibilité (true/false) : ");
                                        boolean visibilite = sc.nextBoolean();
                                        produitList[i].setNom(nom);
                                        produitList[i].setRemise(remise);
                                        produitList[i].setPrix(prix);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("veullier entrer la references du produits a suprimer");
                                String referenceASupprimer = sc.nextLine();
                                boolean found = false;
                                for (int i = 0; indiceProduit > i; i ++){
                                    if (produitList[i].getRefe().equals(referenceASupprimer)) {
                                        // Déplace tous les éléments après celui à supprimer vers la gauche
                                        for (int j = i; j < indiceProduit - 1; j++) {
                                            produitList[j] = produitList[j + 1];
                                        }
                                        // Vide la dernière case du tableau (optionnel, mais pour être propre)
                                        produitList[indiceProduit - 1] = null;
                                        indiceProduit--;  // Réduit l'indice de produits
                                        System.out.println("Produit supprimé avec succès !");
                                        found = true;
                                        break;
                                    }
                                }

                                if (!found) {
                                    System.out.println("Aucun produit trouvé avec cette référence.");
                                }
                                break;
                            case 4:
                                ParcourirTab(indiceProduit, produitList);
                                break;
                        }
                        break;
                    case 2:
                        ShowMenuClients();
                        choixMenuClient = sc.nextInt();
                        switch (choixMenuClient) {
                            case 1:
                                Client client = GetClientFromKeyboard(sc);
                                clientList[indiceClient] = client;
                                System.out.println("client ajouté avec succès !");
                                indiceClient ++;
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                ParcourirTabClient(indiceClient, clientList);
                                break;
                        }
                        break;
                    case 3:
                        break;
                }
       }while (input != 0);
    }
    private static void ParcourirTabClient(int indiceClient, Client[] clientList) {
        for (int i = 0; i < indiceClient; i ++ ){
            AffichageClientList(clientList[i]);
        }
    }
    private static void AffichageClientList(Client clientList) {
        System.out.println("--Nom: " + clientList.getNom() +
                " **ID: " + clientList.getId() +
                " Téléphone: " + clientList.getTel()+
                " Adresse: " + clientList.getAdress() +
                " Matricule: " + clientList.getMatricule() +
                " Code: " + clientList.getCode() +
                " Code Catégorie: " + clientList.getCodeCat() +
                " Établissement secondaire: " + clientList.getEtbSec() +
                " Email: " +  clientList.getMail());
    }
    private static Client GetClientFromKeyboard(Scanner sc) {
        System.out.print("ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nom : ");
        String nom = sc.nextLine();
        System.out.print("Téléphone : ");
        String tel = sc.nextLine();
        System.out.print("Adresse : ");
        String adress = sc.nextLine();
        System.out.print("Matricule : ");
        String matricule = sc.nextLine();
        System.out.print("Code : ");
        String code = sc.nextLine();
        System.out.print("Code Catégorie : ");
        String codeCat = sc.nextLine();
        System.out.print("Établissement secondaire : ");
        String etabSec = sc.nextLine();
        System.out.print("Email : ");
        String mail = sc.nextLine();
        Client client = new Client(
                id,
                nom,
                tel,
                adress,
                matricule,
                code,
                codeCat,
                etabSec,
                mail);
        return client;
    }
    private static void ShowMenuClients() {
        System.out.println("Menu client :");
        System.out.println("1 : Ajouter client  ");
        System.out.println("2 : Modifier client");
        System.out.println("3 : supprimer client");
        System.out.println("4 : Afficher toute les clients");
        System.out.println("0 : Retour menu principale ");
    }
    private static void ParcourirTab(int indiceProduit, Produit[] produitList) {
        for (int i = 0; i < indiceProduit; i++){
            AffichageProduitListe(produitList[i]);
        }
    }
    private static void AffichageProduitListe(Produit produit) {
        System.out.println("Nom: " + produit.getNom() +
                " Ref: " + produit.getRefe() +
                " Quantite: " + produit.getQte() +
                " Quantité Limite: " + produit.getQteLimite()+
                " Remise: " + produit.getRemise() +
                " Remise Achat: " + produit.getRemiseAchat()+
                " TVA: " + produit.getTva() +
                " Prix: " + produit.getPrix()+
                " Prix Achat: " + produit.getPrixAchat()+
                " Visibilité: " + produit.isVisibilite());
    }
    private static Produit GetProductFromKeyboard(Scanner sc) {
        System.out.print("Référence : ");
        String reference = sc.next();
        System.out.print("Nom : ");
        String nom = sc.next();
        System.out.print("Quantité : ");
        int quantite = sc.nextInt();
        System.out.print("Quantité limite : ");
        int quantiteLimite = sc.nextInt();
        System.out.print("Remise (%) : ");
        double remise = sc.nextDouble();
        System.out.print("Remise d'achat (%) : ");
        double remiseAchat = sc.nextDouble();
        System.out.print("TVA (%) : ");
        double tva = sc.nextDouble();
        System.out.print("Prix : ");
        double prix = sc.nextDouble();
        System.out.print("Prix d'achat : ");
        double prixAchat = sc.nextDouble();
        System.out.print("Visibilité (true/false) : ");
        boolean visibilite = sc.nextBoolean();
        Produit produit = new Produit(
                reference,
                nom,
                quantite,
                quantiteLimite,
                remise,
                remiseAchat,
                tva,
                prix,
                prixAchat,
                visibilite);
        return produit;
    }
    private static void ShowMenuArticle() {
        System.out.println("Menu article :");
        System.out.println("1 : Ajouter articles ");
        System.out.println("2 : Modifier article");
        System.out.println("3 : supprimer article");
        System.out.println("4 : Afficher toute les articles");
        System.out.println("0 : Retour menu principale ");
    }
    private static void ShowMenuPrincipale() {
        System.out.println("Menu Application gestion commerciale :");
        System.out.println("1 : Gestion des articles ");
        System.out.println("2 : Gestion des clients");
        System.out.println("3 : Gestion des factures");
        System.out.println("0 : Sortir ");
    }
}