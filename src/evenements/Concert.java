package evenements;

import java.time.LocalDateTime;


    public class Concert extends Evenement {
        private String artiste;
        private String genreMusical;
        private double prixEntree;

        // Constructeurs
        public Concert() {
            super();
        }

        public Concert(String id, String nom, LocalDateTime date, String lieu, int capaciteMax,
                       String artiste, String genreMusical) {
            super(id, nom, date, lieu, capaciteMax);
            this.artiste = artiste;
            this.genreMusical = genreMusical;
        }
        // Getters et Setters
        public String getArtiste() { return artiste; }
        public void setArtiste(String artiste) { this.artiste = artiste; }

        public String getGenreMusical() { return genreMusical; }
        public void setGenreMusical(String genreMusical) { this.genreMusical = genreMusical; }
    }