package jeuPPC;

import java.util.Random;
import java.util.Scanner;

public class JeuPPC {

	public static void main(String[] args) {
		Random rm=new Random();
		Scanner sc=new Scanner(System.in);
		int joueur,ordinateur;
		int cJoueur=0,cOrdinateur =0;
		String[] choix = {"Papier","Pièrre","Ciseaux"};
		System.out.println("0 pour papier");
		System.out.println("1 pour Pièrre");
		System.out.println("2 pour Ciseaux");
		while (cJoueur<3 && cOrdinateur<3) {
			joueur =sc.nextInt();
			ordinateur=rm.nextInt(3);
			while (joueur <0 || joueur >2) 
			{
			System.out.println("Entrer un choix valable 0,1,2");
			joueur = sc.nextInt();
				
			}
			System.out.println("Vous : "+choix[joueur]+"L'ordinateur : "+choix[ordinateur]);
			if(joueur==0 && ordinateur==1 || joueur==1 && ordinateur==2 || joueur==2 && ordinateur==0)
			{
				cJoueur++;
				System.out.println("le joueur qui gagne dans ce tour ");
				System.out.println(cJoueur+"/"+cOrdinateur);
			}
			if(ordinateur==0 && joueur==1 || ordinateur==1 && joueur==2 || ordinateur==2 && joueur==0)
			{	
				cOrdinateur++;
				System.out.println("l'ordinateur qui gagne dans ce tour ");
				System.out.println(cJoueur+"/"+cOrdinateur);
			}
			else 
			{
				System.out.println("L'égalité dans ce tour");
				System.out.println(cJoueur+"/"+cOrdinateur);
			}	
		}
		if(cJoueur == 3 )System.out.println("Le joueur qui gagne le jeu");
		if(cOrdinateur == 3 )System.out.println("L'Ordinateur qui gagne le jeu");
		
		System.out.println("Tester GitHub");
		
		System.out.println("commit 2");
		
		
		

	}

}
