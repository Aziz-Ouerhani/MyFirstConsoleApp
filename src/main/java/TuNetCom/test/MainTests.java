package TuNetCom.test;

import TuNetCom.BestErp.Console.ClientConsoleMethodes;
import TuNetCom.BestErp.Console.ProduitConsoleMethode;
import TuNetCom.BestErp.Domain.BonDeLivraison;
import TuNetCom.BestErp.Domain.Client;
import TuNetCom.BestErp.Domain.Commandes;
import TuNetCom.BestErp.Domain.Produit;

import java.util.Scanner;
public class MainTests {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Produit produitList[] = new Produit[10];
       Client clientList[] = new Client[10];
       Commandes commandesList[] = new Commandes[10];
        BonDeLivraison bonDeLivraisonList[] = new BonDeLivraison[10];
       int indiceProduit = 0;
       int indiceClient = 0 ;
       int indiceCommande = 0;
       int indiceBonDeLivraison = 0;
        int input = -1; // declaration + initialisation
        int choixMenuArticle = -1;
        int choixMenuClient = -1;
        int choixMenuCommande = -1;
        int choixMenuBonLivraison = -1;
        ProduitConsoleMethode produitConsoleMethode = new ProduitConsoleMethode();
            do {
                ShowMenuPrincipale();
                input = sc.nextInt(); // simple afectation
                switch (input){
                    case 1:
                        produitConsoleMethode.ShowMenuArticle();
                        choixMenuArticle = sc.nextInt(); // simple afectation
                        switch (choixMenuArticle){
                            case 1:
                                Produit produit = produitConsoleMethode.GetProductFromKeyboard(sc);
                                produitList[indiceProduit] = produit;
                                indiceProduit ++;
                                System.out.println("Produit ajouté avec succès !");
                                break;
                            case 2:
                                System.out.println("veullier entrer la references du produits à modifier");
                                String referenceAModifier = sc.next();
                                for (int i = 0; indiceProduit > i; i ++) {
                                    if (produitList[i].getRefe().equals(referenceAModifier)){
                                        produitConsoleMethode.editProduitFromKeyboard(sc, produitList[i]);
                                    }
                                }
                                break;
                            case 3:
                                ClientConsoleMethodes.supprimerProduit(sc, indiceProduit, produitList);
                                break;
                            case 4:
                                produitConsoleMethode.ParcourirTab(indiceProduit, produitList);
                                break;
                        }
                        break;
                    case 2:
                        ClientConsoleMethodes.ShowMenuClients();
                        choixMenuClient = sc.nextInt();
                        switch (choixMenuClient) {
                            case 1:
                                Client client = ClientConsoleMethodes.GetClientFromKeyboard(sc);
                                clientList[indiceClient] = client;
                                System.out.println("client ajouté avec succès !");
                                indiceClient ++;
                                break;
                            case 2:
                                System.out.println("veullier entrer l'id du client à modifier");
                                int idAModifier = sc.nextInt();
                                for (int i = 0; indiceClient > i; i ++) {
                                    if (clientList[i].getId() == idAModifier){
                                        ClientConsoleMethodes.editClientFromKeyboard(sc, clientList[i]);
                                    }
                                }
                                break;
                            case 3:
                                ClientConsoleMethodes.supprimerClient(sc, indiceClient, clientList);
                                break;
                            case 4:
                                ClientConsoleMethodes.ParcourirTabClient(indiceClient, clientList);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Menu Commandes :");
                        System.out.println("1 : Ajouter Commandes  ");
                        System.out.println("2 : Modifier Commandes");
                        System.out.println("3 : supprimer Commandes");
                        System.out.println("4 : Afficher toute Commandes");
                        System.out.println("0 : Retour menu principale ");
                        choixMenuCommande = sc.nextInt();
                        switch ( choixMenuCommande ){
                            case 1:
                                Commandes commandes = getCommandeFromKeyboard(sc);
                                commandesList[indiceCommande] = commandes ;
                                indiceCommande++;
                                break;
                            case 2:
                                System.out.println("veullier entrer le num du commande à modifier");
                                int numAModifier = sc.nextInt();
                                for (int i = 0; indiceCommande > i; i ++) {
                                    if (commandesList[i].getNum() == numAModifier) {
                                        System.out.print("date : ");
                                        String date = sc.next();
                                        System.out.print("fournisseurId : ");
                                        int fournisseurId = sc.nextInt();
                                        commandesList[i].setDate(date);
                                        commandesList[i].setFournisseurId(fournisseurId);
                                    }

                                }
                                break;
                            case 3:
                                System.out.println("veullier entrer le num du commande a suprimer");
                                int numASupprimer = sc.nextInt();
                                for (int i = 0; indiceClient > i; i ++){
                                    if (clientList[i].getId() == numASupprimer) {
                                        for (int j = i; j < indiceClient - 1; j++) {
                                            commandesList[j] = commandesList[j + 1];
                                        }
                                        commandesList[indiceCommande - 1] = null;
                                        indiceClient--;
                                        System.out.println("commande supprimé avec succès !");
                                    }
                                }
                                break;
                            case 4:
                                for (int i = 0; i < indiceCommande; i++){
                                    System.out.println("Num: " + commandesList[i].getNum() +
                                            " Date: " + commandesList[i].getDate() +
                                            " FournisseurId: " + commandesList[i].getFournisseurId());
                                }
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("Menu BonLivraison :");
                        System.out.println("1 : Ajouter BonLivraison  ");
                        System.out.println("2 : Modifier BonLivraison");
                        System.out.println("3 : supprimer BonLivraison");
                        System.out.println("4 : Afficher toute BonLivraison");
                        System.out.println("0 : Retour menu principale ");
                        choixMenuBonLivraison = sc.nextInt();
                        switch (choixMenuBonLivraison){
                            case 1:
                                System.out.print("num : ");
                                int num = sc.nextInt();
                                System.out.print("date : ");
                                String date = sc.next();
                                System.out.print("tothtva : ");
                                int totHTva = sc.nextInt();
                                System.out.print("totTva : ");
                                int totTva = sc.nextInt();
                                System.out.print("tempBl : ");
                                double tempBl = sc.nextDouble();
                                System.out.print("numFacture : ");
                                double numFacture = sc.nextDouble();
                                System.out.print("clientId : ");
                                double clientId = sc.nextDouble();
//                                BonDeLivraison bonDeLivraison = new BonDeLivraison(num,) ;
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        break;
                }
       }while (input != 0);
    }

    private static Commandes getCommandeFromKeyboard(Scanner sc) {
        System.out.print("num : ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("date : ");
        String date = sc.next();
        sc.nextLine();
        System.out.print("fournisseurId : ");
        int fournisseurId = sc.nextInt();
        sc.nextLine();
        Commandes commandes = new Commandes(
                num,
                date,
                fournisseurId);
        return commandes;
    }

    private static void ShowMenuPrincipale() {
        System.out.println("Menu Application gestion commerciale :");
        System.out.println("1 : Gestion des articles ");
        System.out.println("2 : Gestion des clients");
        System.out.println("3 : Gestion des commandes");
        System.out.println("4 : Gestion des BonLivraison");
        System.out.println("0 : Sortir ");
    }
}