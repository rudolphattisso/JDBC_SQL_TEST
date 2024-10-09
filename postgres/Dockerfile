FROM postgres
ENV POSTGRE_USER postgres
ENV POSTGRES_PASSWORD B@nLgU4qz*9?D~3n83
ENV POSTGRES_DB contacts
# copie du fichier de création de BDD dans le conteneur
# lancement automatique du script
COPY contacts.sql /docker-entrypoint-initdb.d/contacts.sql
