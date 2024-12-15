# Projet de Programmation Orientée Objet (POO)

## Objectif
Ce projet consiste à développer une application en **Java** qui respecte les principes de la programmation orientée objet (POO). L'application met en œuvre des concepts comme l'encapsulation, l'abstraction, l'héritage, la surcharge, la redéfinition, et le polymorphisme.

L'application choisie pour ce projet est une **Gestion Commerciale**, offrant des fonctionnalités pour gérer les articles, les stocks, et les commandes.

---

## Fonctionnalités Principales

### Gestion des Articles
- Ajouter un article avec les caractéristiques suivantes :
  - Référence unique (générée automatiquement)
  - Désignation (description du produit)
  - Prix d'achat
  - Prix de vente
  - Quantité initiale en stock (par défaut : 0)
- Modifier les informations d'un article (prix, désignation, etc.).
- Augmenter ou diminuer la quantité en stock.
- Supprimer un article.
- Afficher les détails d'un article.

**Types d'articles :**
- **Produit simple** : article composé d'un seul élément (exemple : souris, clavier, tablette, etc.).
- **Produit pack** : article composé de sous-produits (exemple : ordinateur avec unité centrale, écran, clavier).

---

### Gestion des Commandes
#### Réception (Entrée en stock)
- Ajouter des quantités au stock via une réception.
- Associer la date de réception.

#### Livraison (Sortie de stock)
- Réduire les quantités du stock via une livraison.
- Associer la date de livraison.

#### Inventaire
- Corriger manuellement les quantités de stock pour un ou plusieurs articles.

---

### Gestion du Stock
- Afficher l'état des stocks de tous les articles.
- Rechercher un article par sa référence ou sa désignation.
- Ajouter ou supprimer un article du magasin.

---

## Interface Utilisateur
L'application offre une interface utilisateur basée sur des **menus interactifs**. Voici un exemple de navigation :
