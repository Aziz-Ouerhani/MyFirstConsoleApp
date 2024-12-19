package TuNetCom.BestErp.Console;

import TuNetCom.BestErp.Domain.Client;
import TuNetCom.BestErp.Domain.Produit;

import java.util.Scanner;

public class ClientConsoleMethodes {
    public static void editClientFromKeyboard(Scanner sc, Client client) {
        System.out.print("Nom : ");
        String nom = sc.next();
        System.out.print("Téléphone : ");
        String tel = sc.next();
        System.out.print("Adresse : ");
        String adress = sc.next();
        System.out.print("Matricule : ");
        String matricule = sc.next();
        System.out.print("Code : ");
        String code = sc.next();
        System.out.print("Code Catégorie : ");
        String codeCat = sc.next();
        System.out.print("Établissement secondaire : ");
        String etabSec = sc.next();
        System.out.print("Email : ");
        String mail = sc.next();
        client.setNom(nom);
        client.setAdress(adress);
        client.setCode(code);
        client.setMail(mail);
        client.setTel(tel);
        client.setCodeCat(codeCat);
        client.setEtbSec(etabSec);
        client.setMatricule(matricule);
    }

    public static void ParcourirTabClient(int indiceClient, Client[] clientList) {
        for (int i = 0; i < indiceClient; i++) {
            AffichageClientList(clientList[i]);
        }
    }

    public static void AffichageClientList(Client client) {
        System.out.println(client.toString());
    }

    public static Client GetClientFromKeyboard(Scanner sc) {
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

    public static void ShowMenuClients() {
        System.out.println("Menu client :");
        System.out.println("1 : Ajouter client  ");
        System.out.println("2 : Modifier client");
        System.out.println("3 : supprimer client");
        System.out.println("4 : Afficher toute les clients");
        System.out.println("0 : Retour menu principale ");
    }

    public static int supprimerClient(Scanner sc, int indiceClient, Client[] clientList) {
        System.out.println("veullier entrer l'id du client a suprimer");
        int idASupprimer = sc.nextInt();
        for (int i = 0; indiceClient > i; i ++){
            if (clientList[i].getId() == idASupprimer) {
                for (int j = i; j < indiceClient - 1; j++) {
                    clientList[j] = clientList[j + 1];
                }
                clientList[indiceClient - 1] = null;
                indiceClient--;
                System.out.println("Produit supprimé avec succès !");
            }
        }
        return indiceClient;
    }

    public static int supprimerProduit(Scanner sc, int indiceProduit, Produit[] produitList) {
        System.out.println("veullier entrer la reference du produit à suprimer");
        String referenceASupprimer = sc.next();
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
        return indiceProduit;
    }
}
