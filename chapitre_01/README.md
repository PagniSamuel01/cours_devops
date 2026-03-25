**PIGIER Côte d'Ivoire**

Projet Informatique II -- LPRGL3

**AIDE-MÉMOIRE -- CHAPITRE 1**

**Concepts Fondamentaux de DevOps**

# 1. HISTOIRE & DÉFINITION DE DEVOPS

## 1.1 Histoire

| **Date / Acteur**          | **Événement clé**                                                        |
|----------------------------|--------------------------------------------------------------------------|
| **2007--2008**             | Naissance de DevOps -- résoudre le cloisonnement entre équipes Dev et Ops |
| **Patrick Debois & John Allspaw** | Figures clés -- prônent une approche unifiée Dev + Ops          |
| **2009**                   | 1ère conférence DevOpsDays                                               |
| **2011**                   | Publication du livre « The Phoenix Project » -- popularise le mouvement  |

## 1.2 Définition

**DevOps =** combinaison de **philosophies culturelles** + **pratiques** + **outils** qui améliore la capacité à livrer des applications et services **à un rythme élevé**.

# 2. FONCTIONNEMENT DE DEVOPS

## 2.1 Principe de base

- **Équipes non isolées :** Les équipes Dev et Ops fusionnent ou collaborent étroitement
- **Cycle de vie complet :** Les ingénieurs travaillent sur TOUTES les phases de l'application
- **Automatisation :** Remplacement des processus manuels et lents
- **Pile technologique unifiée :** Outils communs pour faire évoluer les apps rapidement et fiablement

## 2.2 Variantes

| **Modèle**      | **Description**                                                      |
|-----------------|----------------------------------------------------------------------|
| **DevOps**      | Fusion des équipes Dev + Ops                                         |
| **DevSecOps**   | DevOps où la Sécurité est au cœur des activités (intégrée dès le début) |

# 3. LES 6 AVANTAGES DE DEVOPS

| **Avantage**          | **Ce que cela signifie**                                      |
|-----------------------|---------------------------------------------------------------|
| ⚡ **Rapidité**        | Opérer et innover plus vite                                   |
| 🚀 **Livraison rapide** | Augmenter la fréquence et la cadence des versions            |
| ✅ **Fiabilité**       | Garantir la qualité des mises à jour (CI/CD, tests)          |
| 📈 **Évolutivité**     | Gérer et faire évoluer des systèmes complexes                |
| 🤝 **Collaboration**   | Partage des responsabilités, communication améliorée         |
| 🔒 **Sécurité**        | Intégration de la sécurité dès le départ (DevSecOps)         |

# 4. LES 6 PRATIQUES DEVOPS CLÉS

| **Pratique**                       | **Description essentielle**                                                     |
|------------------------------------|---------------------------------------------------------------------------------|
| **Intégration Continue (CI)**      | Fusionner les modifications de code fréquemment + tests automatiques à chaque commit |
| **Livraison Continue (CD)**        | Automatiser la mise en production de façon fiable à tout moment                |
| **Microservices**                  | Découper l'application en petits services indépendants et déployables séparément |
| **Infrastructure as Code (IaC)**   | Gérer l'infrastructure via du code (scripts) plutôt que manuellement           |
| **Surveillance & Journalisation**  | Monitorer en temps réel les performances et les logs des applications           |
| **Communication & Collaboration**  | Casser les silos et favoriser le travail d'équipe transversal                   |

# 5. OUTILS DEVOPS PAR CATÉGORIE

**Rôle des outils :** Accélérer le déploiement • Automatiser les tâches manuelles • Gérer les environnements complexes • Garder le contrôle sur la vitesse Dev/Ops

| **Catégorie**                   | **Outils**            | **Description courte**                                             |
|---------------------------------|-----------------------|--------------------------------------------------------------------|
| **CI/CD**                       | **Jenkins**           | Outil open source d'automatisation CI/CD le plus populaire         |
|                                 | **GitLab CI/CD**      | Solution CI/CD nativement intégrée à GitLab                        |
|                                 | **GitHub Actions**    | Plateforme CI/CD puissante hébergée par GitHub                     |
|                                 | **CircleCI**          | Plateforme CI/CD hébergée, large gamme de fonctionnalités          |
|                                 | **Travis CI**         | CI/CD populaire pour projets open source                           |
| **IaC**                         | **Terraform**         | Gestion d'infrastructure déclarative (open source)                 |
|                                 | **Ansible**           | Automatisation de configuration et gestion de serveurs             |
|                                 | **Chef**              | Plateforme d'automatisation de configuration serveurs              |
|                                 | **Puppet**            | Plateforme d'automatisation de configuration serveurs              |
| **Surveillance & Logs**         | **Prometheus**        | Système de surveillance open source (métriques)                    |
|                                 | **Grafana**           | Visualisation de données (tableaux de bord)                        |
|                                 | **Elasticsearch**     | Moteur de recherche et d'analyse (données)                         |
|                                 | **Kibana**            | Visualisation et analyse pour Elasticsearch                        |
|                                 | **Logstash**          | Collecte, traitement et stockage des logs                          |
| **Communication & Collab.**     | **Slack**             | Plateforme de communication et collaboration                       |
|                                 | **Microsoft Teams**   | Communication et collaboration Microsoft                           |
|                                 | **Jira**              | Suivi des problèmes et gestion de projet                           |
|                                 | **Confluence**        | Wiki et collaboration d'équipe                                     |
| **Conteneurisation & Cloud**    | **Docker**            | Plateforme de conteneurisation d'applications                      |
|                                 | **Kubernetes**        | Orchestration de conteneurs open source                            |
|                                 | **Spinnaker**         | Plateforme de livraison continue open source                       |

**À savoir aussi :** AWS, Azure, Google Cloud proposent également leurs propres produits DevOps.

# 6. DEVOPS ET AGILE

| **Point clé**                    | **Contenu**                                                                    |
|----------------------------------|--------------------------------------------------------------------------------|
| **Lien DevOps / Agile**          | DevOps trouve ses racines dans les principes du développement logiciel Agile   |
| **Manifeste Agile**              | Rédigé en 2001 pour améliorer le développement de systèmes                     |
| **Principe Agile lié à DevOps**  | « Les individus et leurs interactions plus que les processus et les outils »   |

## 4 valeurs du Manifeste Agile (à connaître)

| **Priorité (à gauche)**                    | **... plus que (à droite)**          |
|--------------------------------------------|--------------------------------------|
| **Les individus et leurs interactions**    | les processus et les outils          |
| **Des logiciels opérationnels**            | une documentation exhaustive         |
| **La collaboration avec les clients**      | la négociation contractuelle         |
| **L'adaptation au changement**             | le suivi d'un plan                   |

# 7. EXEMPLE DEVOPS : SPOTIFY

| **Aspect**     | **Détail**                                                                                          |
|----------------|-----------------------------------------------------------------------------------------------------|
| **Contexte**   | +422M d'utilisateurs actifs mensuels -- déploiements constants de nouvelles fonctionnalités         |
| **Défis**      | Dev en silo, manque d'automatisation, environnement de test instable, centaines de déploiements/jour |
| **Solution**   | Plateforme DevOps open source : Jenkins + Chef + Prometheus → automatisation CI/CD complète         |
| **Résultats**  | Time-to-market -50% \| Déploiements échoués -90% \| Coûts Dev/Maintenance -20% \| Satisfaction clients ++ |
| **Leçons**     | 1) Collaboration Dev+Ops+Sécu \| 2) Automatisation = réduction TTM \| 3) Culture DevOps indispensable |
