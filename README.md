# Bachelor CSI - TODO List App

**Période**: 2022  
**Niveau**: Bachelor CSI - Concepteur de Systèmes d'Informations  
**Type**: Application web permettant d'enregistrer et afficher des notes dans un tableau interactif

## 📋 Description du Projet

Application web moderne de gestion de tâches développée dans le cadre du Bachelor CSI. L'application permet d'enregistrer, organiser et afficher des notes dans un tableau interactif avec des fonctionnalités avancées de gestion de tâches.

## 🛠️ Technologies Utilisées

- **Frontend**: HTML5, CSS3, JavaScript ES6+
- **Backend**: PHP, Node.js (optionnel)
- **Base de données**: MySQL, SQLite
- **Framework**: Bootstrap, jQuery
- **Architecture**: SPA (Single Page Application)
- **Storage**: Local Storage, Session Storage

## 🎯 Fonctionnalités

- **Création de tâches** avec titre et description
- **Tableau interactif** avec colonnes (À faire, En cours, Terminé)
- **Drag & Drop** pour réorganiser les tâches
- **Filtres** et recherche de tâches
- **Catégorisation** par projets et priorités
- **Dates d'échéance** et rappels
- **Mode hors ligne** avec synchronisation
- **Interface responsive** mobile/desktop

## 📁 Structure du Projet

```
DeveloppementMobileTP2/
├── index.html          # Page principale SPA
├── js/                 # Scripts JavaScript
│   ├── app.js          # Application principale
│   ├── tasks.js        # Gestion des tâches
│   └── ui.js           # Interface utilisateur
├── css/                # Styles CSS
├── api/                # API REST pour les tâches
├── database/           # Scripts de base de données
├── assets/             # Images et ressources
└── README.md           # Documentation
```

## 🚀 Installation et Utilisation

1. **Cloner le repository**:
   ```bash
   git clone https://github.com/Elysio3/DeveloppementMobileTP2.git
   ```

2. **Configuration de la base de données**:
   ```sql
   CREATE DATABASE todo_app;
   mysql -u root -p todo_app < database/schema.sql
   ```

3. **Configuration PHP**:
   ```php
   // config/database.php
   define('DB_HOST', 'localhost');
   define('DB_NAME', 'todo_app');
   define('DB_USER', 'your_username');
   define('DB_PASS', 'your_password');
   ```

4. **Démarrage**:
   - Ouvrir `index.html` dans un navigateur
   - Ou utiliser un serveur local: `php -S localhost:8000`

## 🎨 Interface Utilisateur

- **Design moderne** avec Material Design
- **Tableau Kanban** interactif
- **Animations** fluides et transitions
- **Mode sombre/clair** (optionnel)
- **Interface tactile** optimisée
- **Responsive design** adaptatif

## 📊 Compétences Développées

- Développement d'applications web modernes
- Programmation JavaScript avancée (ES6+)
- Gestion d'état d'application complexe
- Interface utilisateur interactive
- Gestion des données en temps réel
- Optimisation des performances web
- Développement mobile-first
- Intégration d'APIs REST

## 🎓 Contexte Éducatif

Ce projet du Bachelor CSI démontre la maîtrise du développement web moderne et des interfaces utilisateur interactives.

## 🏗️ Architecture Application

- **Pattern MVC** côté client
- **Gestion d'état** avec JavaScript
- **API REST** pour la persistance
- **Local Storage** pour le cache
- **Service Workers** pour le mode hors ligne
- **Event-driven** architecture

## 🔧 Fonctionnalités Avancées

### **Gestion des Tâches**
- Création, modification, suppression
- Changement de statut par drag & drop
- Assignation d'utilisateurs
- Commentaires et notes

### **Organisation**
- Projets et catégories
- Tags et labels
- Filtres avancés
- Recherche en temps réel

### **Collaboration**
- Partage de tableaux
- Notifications en temps réel
- Historique des modifications
- Gestion des permissions

## 📱 Mobile et Responsive

- **PWA** (Progressive Web App)
- **Installation** sur mobile
- **Mode hors ligne** complet
- **Synchronisation** automatique
- **Notifications** push

## 🧪 Tests et Qualité

```javascript
// Tests unitaires JavaScript
npm test

// Tests d'intégration
npm run test:integration

// Linting et formatage
npm run lint
npm run format
```

## 📸 Captures d'écran

*[À ajouter: captures d'écran de l'application]*

## 🔗 Liens

- **Repository**: https://github.com/Elysio3/DeveloppementMobileTP2
- **Demo**: [Lien vers la démo en ligne]
- **Portfolio**: [Lien vers le portfolio principal]

---

**Développé par**: Maël KERVICHE  
**École**: ORT Toulouse-Colomiers  
**Année**: 2022
