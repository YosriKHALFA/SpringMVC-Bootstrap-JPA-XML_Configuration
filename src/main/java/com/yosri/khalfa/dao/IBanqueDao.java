package com.yosri.khalfa.dao;

import java.util.List;

import com.yosri.khalfa.entities.Client;
import com.yosri.khalfa.entities.Compte;
import com.yosri.khalfa.entities.Employe;
import com.yosri.khalfa.entities.Groupe;
import com.yosri.khalfa.entities.Operation;

public interface IBanqueDao {
	public Client addClient(Client c);
	public Employe addEmploye(Employe e,Long codeSup);
	public Groupe addGroupe(Groupe g);
	public void addEmployeToGroupe(Long codeEmp,Long codeGr);
	public Compte addCompte(Compte cp,Long codeCli,Long codeEmp);
	public Operation addOperation(Operation op,String codeCpte,Long codeEmp);
	public Compte consulterCompte(String codeCpte);
	public List<Operation> consulterOperations(String codeCpte,int position,int nboperation);
	public Client consulterClient(Long codeCli);
	public List<Client> consulterClients(String mc);
	public List<Compte> getComptesByClient(Long codeCli);
	public List<Compte> getComptesByEmploye(Long codeEmp);
	public List<Employe> getEmployes();
	public List<Groupe> getGroupes();
	public List<Employe> getEmployesByGroupe(Long codeGr);
	public long getNombteOperation(String numCpte);
}
