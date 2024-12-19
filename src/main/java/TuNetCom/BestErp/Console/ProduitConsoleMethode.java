package TuNetCom.BestErp.Console;

import TuNetCom.BestErp.Domain.Produit;

import java.util.Scanner;

public class ProduitConsoleMethode {
    public void ParcourirTab(int indiceProduit, Produit[] produitList) {
        for (int i = 0; i < indiceProduit; i++){
            AffichageProduitListe(produitList[i]);
        }
    }

    private void AffichageProduitListe(Produit produit) {
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
    public void editProduitFromKeyboard(Scanner sc, Produit produitList) {
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
        produitList.setNom(nom);
        produitList.setRemise(remise);
        produitList.setPrix(prix);
        produitList.setQte(quantite);
        produitList.setPrixAchat(prixAchat);
        produitList.setVisibilite(visibilite);
        produitList.setQteLimite(quantiteLimite);
        produitList.setTva(tva);
        produitList.setRemiseAchat(remiseAchat);
    }

    public  Produit GetProductFromKeyboard(Scanner sc) {
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

    public void ShowMenuArticle() {
        System.out.println("Menu article :");
        System.out.println("1 : Ajouter articles ");
        System.out.println("2 : Modifier article");
        System.out.println("3 : supprimer article");
        System.out.println("4 : Afficher toute les articles");
        System.out.println("0 : Retour menu principale ");
    }
}




