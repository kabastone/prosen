INSERT INTO `acces` VALUES (1,'Liste Facture','/pages/facturation/liste_facture.zul'),(2,'Liste Prestations','/pages/prestations/liste_prestations.zul'),(3,'Liste Utilisateurs','/pages/page_utilisateurs/liste_utilisateur.zul'),(4,'Paramètres','/pages/parametre/creer_parametre.zul');
                       
INSERT INTO `fonction` VALUES (1,'Utilisateur'),(2,'Administrateur');

INSERT INTO `fonctionnalites` VALUES (1,'dossier soin',NULL),(2,'dossier administratif',''),(3,'dossier medical',NULL),(4,'profil patient',NULL),(5,'nouveau',NULL),(6,'vuesoin',NULL),(7,'Facturer',NULL);

INSERT INTO `roles` VALUES (1,'z-icon-th-list','Facturation','/applications2/pages/facturation/creer.zul'),(2,'z-icon-th-list','Utilisateur','/applications2/pages/utilisateur/creer.zul'),(3,'z-icon-th-list','Client','/applications2/pages/client/creer.zul');

INSERT INTO `roles_acces` VALUES (1,1),(2,2),(3,3),(4,4);

INSERT INTO `utilisateurs` VALUES (1,'admin','ol','admin','passer','admin'),(2,'kaba','kaba@mail.com','stone','passer','kaba'),(3,'utilisateur','ol','utilisateur','passer','utilisateur');
INSERT INTO `utilisateurs_fonction` VALUES (1,2),(2,2),(3,1);

INSERT INTO `fonction_roles` VALUES (1,1),(2,1),(2,2),(2,3);
