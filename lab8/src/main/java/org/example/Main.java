import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adauga o persoana");
            System.out.println("2. Adauga o excursie");
            System.out.println("3. Afiseaza toate persoanele si excursiile lor");
            System.out.println("4. Afiseaza excursiile unei persoane");
            System.out.println("5. Afiseaza persoanele care au vizitat o destinatie");
            System.out.println("6. Afiseaza persoanele care au facut excursii intr-un an");
            System.out.println("7. Sterge o excursie");
            System.out.println("8. Sterge o persoana si excursiile sale");
            System.out.println("9. Iesire");
            System.out.print("Alege o optiune: ");
            int optiune = scanner.nextInt();
            scanner.nextLine();
            switch (optiune) {
                case 1: {
                    System.out.print("Introduceti numele persoanei: ");
                    String nume = scanner.nextLine();
                    System.out.print("Introduceti varsta persoanei: ");
                    int varsta = scanner.nextInt();
                    scanner.nextLine();
                    Persoana persoana = new Persoana(nume, varsta);
                    PersoanaDAO.adaugaPersoana(persoana);
                    break;
                }
                case 2: {
                    System.out.print("Introduceti numele persoanei: ");
                    String nume = scanner.nextLine();
                    if (!PersoanaDAO.existaPersoana(nume)) {
                        System.out.println("Persoana nu exista in baza de date.");
                        break;
                    }
                    System.out.print("Introduceti destinatia excursiei: ");
                    String destinatie = scanner.nextLine();
                    System.out.print("Introduceti anul excursiei: ");
                    int anul = scanner.nextInt();
                    scanner.nextLine();
                    int idPersoana = PersoanaDAO.existaPersoana(nume) ? 1 : 0;
                    Excursie excursie = new Excursie(idPersoana, destinatie, anul);
                    ExcursieDAO.adaugaExcursie(excursie);
                    break;
                }
                case 3:
                    PersoanaDAO.afiseazaPersoane();
                    ExcursieDAO.afiseazaExcursii();
                    break;
                case 4: {
                    System.out.print("Introduceti numele persoanei: ");
                    String nume = scanner.nextLine();
                    ExcursieDAO.afiseazaExcursiiPersoana(nume);
                    break;
                }
                case 5: {
                    System.out.print("Introduceti destinatia: ");
                    String destinatie = scanner.nextLine();
                    ExcursieDAO.afiseazaPersoaneDestinatie(destinatie);
                    break;
                }
                case 6: {
                    System.out.print("Introduceti anul: ");
                    int anul = scanner.nextInt();
                    scanner.nextLine();
                    ExcursieDAO.afiseazaPersoaneAnul(anul);
                    break;
                }
                case 7: {
                    System.out.print("Introduceti ID-ul excursiei de sters: ");
                    int idExcursie = scanner.nextInt();
                    scanner.nextLine();
                    ExcursieDAO.stergeExcursie(idExcursie);
                    break;
                }
                case 8: {
                    System.out.print("Introduceti ID-ul persoanei de sters: ");
                    int idPersoana = scanner.nextInt();
                    scanner.nextLine();
                    ExcursieDAO.stergePersoana(idPersoana);
                    break;
                }
                case 9:
                    System.out.println("Iesire...");
                    return;
                default:
                    System.out.println("Optiune invalida.");
            }
        }
    }
}
