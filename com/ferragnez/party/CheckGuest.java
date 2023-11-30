package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {

    // Nomi Invitati
    String[] listaInvitati = {"Lorenzo", "Marta", "Giovanni", "Giada"};

    public static void main(String[] args) {

        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String nomeInvitato = scanner.nextLine();

        // Verifica se il nome risulta nella lista
        CheckGuest checkGuest = new CheckGuest();
        checkGuest.verificaInvitato(nomeInvitato);
    }

    private void verificaInvitato(String nome) {
        boolean presenteNellaLista = false;

        for (String invitato : listaInvitati) {
            if (invitato.equalsIgnoreCase(nome)) {
                presenteNellaLista = true;
                break;
            }
        }

        // Stampa se gli è permesso entrare o meno
        if (presenteNellaLista) {
            System.out.println("Puoi entrare.");
        } else {
            System.out.println("Mi dispiace, non sei nella lista. Ti preghiamo di lasciare l'edificio.");
        }
    }
}
