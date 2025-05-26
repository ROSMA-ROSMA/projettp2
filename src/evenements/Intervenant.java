package evenements;

public class Intervenant {
    @XmlRootElement
    public class Intervenant {
        private String nom;
        private String specialite;
        private String biographie;

        // Constructeurs
        public Intervenant() {}

        public Intervenant(String nom, String specialite) {
            this.nom = nom;
            this.specialite = specialite;
        }

        public Intervenant(String nom, String specialite, String biographie) {
            this.nom = nom;
            this.specialite = specialite;
            this.biographie = biographie;
        }

        // Getters et Setters
        public String getNom() { return nom; }
        public void setNom(String nom) { this.nom = nom; }

        public String getSpecialite() { return specialite; }
        public void setSpecialite(String specialite) { this.specialite = specialite; }

        public String getBiographie() { return biographie; }
        public void setBiographie(String biographie) { this.biographie = biographie; }
    }

}
